package com.misnz.lyc.service;

import com.misnz.framework.cache.Cache;
import com.misnz.lyc.dao.TConstantMapper;
import com.misnz.lyc.model.TConstant;
import com.misnz.lyc.model.TConstantExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Administrator on 2016/3/25.
 */
@Service("cacheService")
public class CacheService {
    @Autowired
    @SuppressWarnings("SpringJavaAutowiringInspection")
    private TConstantMapper constantMapper;


    @PostConstruct
    public void initCache() {
        List<TConstant> systemList = constantMapper.selectByExample(new TConstantExample());
        for (int i = 0; i < systemList.size(); i++) {
            TConstant entity = systemList.get(i);
            Cache.add(entity.getCode(), entity.getSysValue());
        }


    }


}
