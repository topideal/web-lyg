package com.misnz.lyc.controller;

import com.misnz.framework.annotation.Auth;
import com.misnz.lyc.model.MessageVo;
import com.misnz.lyc.model.PagesListVo;
import com.misnz.lyc.model.RecruitCnEntity;
import com.misnz.lyc.service.RecruitCnService;
import com.misnz.util.datatables.DataTable;
import com.misnz.util.datatables.DataTableParameter;
import com.misnz.util.datatables.DataTablesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by david on 2015/3/1.
 */
@Controller
@RequestMapping("cn/recruit")
public class RecruitCnController extends BaseController {

    @Autowired(required = false)
    private RecruitCnService service;



    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("getRecruitListByPaginator.do")
    @ResponseBody
    public DataTable getRecruitListByPaginator(String infoId, String jsonParam) {
        try {
            DataTableParameter dataTableParam = DataTablesUtils.getDataTableParameterByJsonParam(jsonParam);

            PagesListVo<RecruitCnEntity> pageObj = service.getRecruitListByPaginator(dataTableParam.getPages(), dataTableParam.getiDisplayLength());
            DataTable<RecruitCnEntity> dt = new DataTable<RecruitCnEntity>();
            int sEcho = dataTableParam.getsEcho() + 1;
            dt.setAaData((List) pageObj.getData());
            dt.setsEcho(sEcho);
            dt.setiTotalDisplayRecords(Integer.parseInt(pageObj.getRecords() + ""));
            dt.setiTotalRecords(Integer.parseInt(pageObj.getRecords() + ""));

            return dt;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new DataTable();
    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("addRecruit.do")
    @ResponseBody
    public MessageVo addRecruit(@RequestBody RecruitCnEntity recruitEnEntity) {
        try {


            service.addRecruit(recruitEnEntity);

            return new MessageVo(200, null, "保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("delRecruit.do")
    @ResponseBody
    public MessageVo delRecruit(String delStr) {
        try {
            service.delRecruit(delStr);
            return new MessageVo(200, null, "删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }
    }




}
