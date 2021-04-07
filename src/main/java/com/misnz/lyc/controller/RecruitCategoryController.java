package com.misnz.lyc.controller;

import com.misnz.framework.annotation.Auth;
import com.misnz.lyc.model.MessageVo;
import com.misnz.lyc.model.PagesListVo;
import com.misnz.lyc.model.RecruitCategoryEntity;
import com.misnz.lyc.service.RecruitCategoryService;
import com.misnz.util.datatables.DataTable;
import com.misnz.util.datatables.DataTableParameter;
import com.misnz.util.datatables.DataTablesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 2015/3/1.
 */
@Controller
@RequestMapping("recruitCategory")
public class RecruitCategoryController extends BaseController {
    @Autowired(required = false)
    private RecruitCategoryService service;




    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("getRecruitCategoryListByPaginator.do")
    @ResponseBody
    public DataTable getRecruitCategoryListByPaginator(String jsonParam) {
        try {
            DataTableParameter dataTableParam = DataTablesUtils.getDataTableParameterByJsonParam(jsonParam);

            PagesListVo<RecruitCategoryEntity> pageObj = service.getRecruitCategoryListByPaginator(dataTableParam.getPages(), dataTableParam.getiDisplayLength());
            DataTable<RecruitCategoryEntity> dt = new DataTable<RecruitCategoryEntity>();
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
    @RequestMapping("addRecruitCategory.do")
    @ResponseBody
    public MessageVo addRecruitCategory(@RequestBody RecruitCategoryEntity recruitCategoryEntity) {
        try {


            service.addRecruitCategory(recruitCategoryEntity);

            return new MessageVo(200, null, "保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("delRecruitCategory.do")
    @ResponseBody
    public MessageVo delRecruitCategory(String delStr) {
        try {

            service.delRecruitCategory(delStr);
            return new MessageVo(200, null, "删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }

    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("getRecruitCategoryListForAll.do")
    @ResponseBody
    public List getRecruitCategoryListForAll() {
        try {
            return service.getRecruitCategoryListForAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList();

    }


}
