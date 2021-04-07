package com.misnz.lyc.controller;


import com.misnz.framework.annotation.Auth;
import com.misnz.lyc.model.*;
import com.misnz.lyc.service.ClassifiedService;
import com.misnz.util.datatables.DataTable;
import com.misnz.util.datatables.DataTableParameter;
import com.misnz.util.datatables.DataTablesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("classified")
public class ClassifiedController {
    @Autowired
    private ClassifiedService service;


    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("getClassifiedListByPaginator.do")
    @ResponseBody
    public DataTable getClassifiedListByPaginator(String jsonParam) {
        try {
            DataTableParameter dataTableParam = DataTablesUtils.getDataTableParameterByJsonParam(jsonParam);

            PagesListVo<TLycClassified> pageObj = service.getClassifiedListByPaginator(dataTableParam.getPages(), dataTableParam.getiDisplayLength());
            DataTable<TLycClassified> dt = new DataTable<TLycClassified>();
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
    @RequestMapping("addClassified.do")
    @ResponseBody
    public MessageVo addClassified(@RequestBody TLycClassified classified) {
        try {


            service.addClassified(classified);

            return new MessageVo(200, null, "保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("delClassified.do")
    @ResponseBody
    public MessageVo delClassified(String delStr) {
        try {

            service.delClassified(delStr);
            return new MessageVo(200, null, "删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }


    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("addTags.do")
    @ResponseBody
    public MessageVo addTags(@RequestBody TLycTags tags) {
        try {


            service.addTags(tags);

            return new MessageVo(200, null, "保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("delTags.do")
    @ResponseBody
    public MessageVo delTags(String delStr) {
        try {

            service.delTags(delStr);
            return new MessageVo(200, null, "删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }



    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("getTagsListByPaginator.do")
    @ResponseBody
    public DataTable getTagsListByPaginator(String jsonParam) {
        try {
            DataTableParameter dataTableParam = DataTablesUtils.getDataTableParameterByJsonParam(jsonParam);

            PagesListVo<TLycTags> pageObj = service.getTagsListByPaginator(dataTableParam.getPages(), dataTableParam.getiDisplayLength());
            DataTable<TLycTags> dt = new DataTable<TLycTags>();
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
    @RequestMapping("addBrands.do")
    @ResponseBody
    public MessageVo addBrands(@RequestBody TLycBrands brands) {
        try {


            service.addBrands(brands);

            return new MessageVo(200, null, "保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("delBrands.do")
    @ResponseBody
    public MessageVo delBrands(String delStr) {
        try {

            service.delBrands(delStr);
            return new MessageVo(200, null, "删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }



    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("getBrandsListByPaginator.do")
    @ResponseBody
    public DataTable getBrandsListByPaginator(String jsonParam) {
        try {
            DataTableParameter dataTableParam = DataTablesUtils.getDataTableParameterByJsonParam(jsonParam);

            PagesListVo<TLycBrands> pageObj = service.getBrandsListByPaginator(dataTableParam.getPages(), dataTableParam.getiDisplayLength());
            DataTable<TLycBrands> dt = new DataTable<TLycBrands>();
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
    @RequestMapping("addCountry.do")
    @ResponseBody
    public MessageVo addCountry(@RequestBody TLycCountry country) {
        try {


            service.addCountry(country);

            return new MessageVo(200, null, "保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("delCountry.do")
    @ResponseBody
    public MessageVo delCountry(String delStr) {
        try {

            service.delCountry(delStr);
            return new MessageVo(200, null, "删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }



    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("getCountryListByPaginator.do")
    @ResponseBody
    public DataTable getCountryListByPaginator(String jsonParam) {
        try {
            DataTableParameter dataTableParam = DataTablesUtils.getDataTableParameterByJsonParam(jsonParam);

            PagesListVo<TLycCountry> pageObj = service.getCountryListByPaginator(dataTableParam.getPages(), dataTableParam.getiDisplayLength());
            DataTable<TLycCountry> dt = new DataTable<TLycCountry>();
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
    @RequestMapping("addYears.do")
    @ResponseBody
    public MessageVo addYears(@RequestBody TLycYears years) {
        try {


            service.addYears(years);

            return new MessageVo(200, null, "保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("delYears.do")
    @ResponseBody
    public MessageVo delYears(String delStr) {
        try {

            service.delYears(delStr);
            return new MessageVo(200, null, "删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }



    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("getYearsListByPaginator.do")
    @ResponseBody
    public DataTable getYearsListByPaginator(String jsonParam) {
        try {
            DataTableParameter dataTableParam = DataTablesUtils.getDataTableParameterByJsonParam(jsonParam);

            PagesListVo<TLycYears> pageObj = service.getYearsListByPaginator(dataTableParam.getPages(), dataTableParam.getiDisplayLength());
            DataTable<TLycYears> dt = new DataTable<TLycYears>();
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
    @RequestMapping("addTrades.do")
    @ResponseBody
    public MessageVo addTrades(@RequestBody TLycTrades trades) {
        try {


            service.addTrades(trades);

            return new MessageVo(200, null, "保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("delTrades.do")
    @ResponseBody
    public MessageVo delTrades(String delStr) {
        try {

            service.delTrades(delStr);
            return new MessageVo(200, null, "删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }



    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("getTradesListByPaginator.do")
    @ResponseBody
    public DataTable getTradesListByPaginator(String jsonParam) {
        try {
            DataTableParameter dataTableParam = DataTablesUtils.getDataTableParameterByJsonParam(jsonParam);

            PagesListVo<TLycTrades> pageObj = service.getTradesListByPaginator(dataTableParam.getPages(), dataTableParam.getiDisplayLength());
            DataTable<TLycTrades> dt = new DataTable<TLycTrades>();
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

    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("getClassifiedListForAll.do")
    @ResponseBody
    public List getClassifiedListForAll() {
        try {
            return service.getClassifiedListForAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList();

    }

    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("getTagsListForAll.do")
    @ResponseBody
    public List getTagsListForAll() {
        try {
            return service.getTagsListForAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList();

    }
    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("getCountryListForAll.do")
    @ResponseBody
    public List getCountryListForAll() {
        try {
            return service.getCountryListForAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList();

    }
    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("getBrandListForAll.do")
    @ResponseBody
    public List getBrandListForAll() {
        try {
            return service.getBrandListForAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList();

    }
    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("getTradeListForAll.do")
    @ResponseBody
    public List getTradeListForAll() {
        try {
            return service.getTradeListForAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList();

    }

    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("getMenus.do")
    @ResponseBody
    public MessageVo getMenus() {
        try {
            Map map=new HashMap<>();
            map.put("classifieds",service.getClassifiedListForAll());
            map.put("tags",service.getTagsListForAll());
            map.put("brands",service.getBrandListForAll());
            map.put("years",service.getYearsForAll());
            map.put("countries",service.getCountryListForAll());
            return new MessageVo(200, map, "获取信息成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }
}
