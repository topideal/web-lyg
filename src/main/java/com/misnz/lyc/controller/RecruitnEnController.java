package com.misnz.lyc.controller;

import com.misnz.framework.annotation.Auth;
import com.misnz.lyc.model.MessageVo;
import com.misnz.lyc.model.OutPutInfoVo;
import com.misnz.lyc.model.PagesListVo;
import com.misnz.lyc.model.RecruitEnEntity;
import com.misnz.lyc.service.RecruitEnService;
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
@RequestMapping("en/recruit")
public class RecruitnEnController extends BaseController {

    @Autowired(required = false)
    private RecruitEnService service;



    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("getRecruitListByPaginator.do")
    @ResponseBody
    public DataTable getRecruitListByPaginator(String infoId, String jsonParam) {
        try {
            DataTableParameter dataTableParam = DataTablesUtils.getDataTableParameterByJsonParam(jsonParam);

            PagesListVo<RecruitEnEntity> pageObj = service.getRecruitListByPaginator(dataTableParam.getPages(), dataTableParam.getiDisplayLength());
            DataTable<RecruitEnEntity> dt = new DataTable<RecruitEnEntity>();
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
    public MessageVo addRecruit(@RequestBody RecruitEnEntity recruitEnEntity) {
        try {


            service.addRecruit(recruitEnEntity);

            return new MessageVo(200, null, "????????????!");
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
            return new MessageVo(200, null, "????????????!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }
    }


    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("getRecruitList.do")
    @ResponseBody
    public PagesListVo getRecruitList(String searchType,String searchKey,Integer pageSize,Integer pageNumber) {
        try {
            return service.getRecruitList(searchType,searchKey,pageSize,pageNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new PagesListVo<OutPutInfoVo>();
    }
    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("getRecruitById.do")
    @ResponseBody
    public PagesListVo getRecruitById(String id) {
        try {
            return service.getRecruitById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new PagesListVo<OutPutInfoVo>();
    }
}
