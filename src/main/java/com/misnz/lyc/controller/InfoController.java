package com.misnz.lyc.controller;


import com.misnz.framework.annotation.Auth;
import com.misnz.lyc.model.*;
import com.misnz.lyc.service.InfoService;
import com.misnz.util.datatables.DataTable;
import com.misnz.util.datatables.DataTableParameter;
import com.misnz.util.datatables.DataTablesUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("info")
public class InfoController {
    @Autowired
    private InfoService service;



    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("getInfoListByPaginator.do")
    @ResponseBody
    public DataTable getInfoListByPaginator(String jsonParam) {
        try {
            DataTableParameter dataTableParam = DataTablesUtils.getDataTableParameterByJsonParam(jsonParam);

            PagesListVo<OutPutInfoVo> pageObj = service.getInfoListByPaginator(dataTableParam.getPages(), dataTableParam.getiDisplayLength());
            DataTable<OutPutInfoVo> dt = new DataTable<OutPutInfoVo>();
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
    @RequestMapping("addInfo.do")
    @ResponseBody
    public MessageVo addInfo(@RequestBody InputInfoVo infoVo) {
        try {


            service.addInfo(infoVo);

            return new MessageVo(200, null, "保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("delInfo.do")
    @ResponseBody
    public MessageVo delInfo(String delStr) {
        try {
            service.delInfo(delStr);
            return new MessageVo(200, null, "删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }
    }


    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("getInfoList.do")
    @ResponseBody
    public PagesListVo getInfoList(String searchType,String searchKey,Integer pageSize,Integer pageNumber) {
        try {
            return service.getInfoList(searchType,searchKey,pageSize,pageNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new PagesListVo<OutPutInfoVo>();
    }




    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("getInfoFileListByPaginator.do")
    @ResponseBody
    public DataTable getInfoFileListByPaginator(String infoId, String jsonParam) {
        try {
            DataTableParameter dataTableParam = DataTablesUtils.getDataTableParameterByJsonParam(jsonParam);

            PagesListVo<OutPutInfoVo> pageObj = service.getInfoFileListByPaginator(infoId,dataTableParam.getPages(), dataTableParam.getiDisplayLength());
            DataTable<OutPutInfoVo> dt = new DataTable<OutPutInfoVo>();
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
    @RequestMapping("addInfoFile.do")
    @ResponseBody
    public MessageVo addInfoFile(@RequestBody TLycInfoFile classifiedInfoFile) {
        try {


            service.addInfoFile(classifiedInfoFile);

            return new MessageVo(200, null, "保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("delInfoFile.do")
    @ResponseBody
    public MessageVo delInfoFile(String delStr) {
        try {
            service.delInfoFile(delStr);
            return new MessageVo(200, null, "删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }
    }


    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("getInfoDetailList.do")
    @ResponseBody
    public PagesListVo getInfoDetailList(String infoId) {
        try {
            return service.getInfoDetailList(infoId,0,0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new PagesListVo<OutPutInfoVo>();
    }

    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("getPrevNextInfoDetail.do")
    @ResponseBody
    public MessageVo getPrevNextInfoDetail(String infoId) {
        try {
            return new MessageVo(200, service.getPrevNextInfoDetail(infoId), "获取数据成功!");

        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, new MessageVo<HashMap>(), e.getMessage());
        }


    }


    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("setHis.do")
    @ResponseBody
    public MessageVo setHis(String infoId) {
        try {
            service.setHis(infoId);
            return new MessageVo(200,null , "点赞+1");

        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }

    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("setBrowser.do")
    @ResponseBody
    public MessageVo setBrowser(String infoId) {
        try {
            service.setBrowser(infoId);
            return new MessageVo(200,null, "浏览+1");

        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204,null, e.getMessage());
        }
    }


    /**
     * 新闻
     * **/
    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("getNewsListByPaginator.do")
    @ResponseBody
    public DataTable getNewsListByPaginator(String jsonParam) {
        try {
            DataTableParameter dataTableParam = DataTablesUtils.getDataTableParameterByJsonParam(jsonParam);

            PagesListVo<OutPutInfoVo> pageObj = service.getNewsListByPaginator(dataTableParam.getPages(), dataTableParam.getiDisplayLength());
            DataTable<OutPutInfoVo> dt = new DataTable<OutPutInfoVo>();
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
    @RequestMapping("addNews.do")
    @ResponseBody
    public MessageVo addNews(@RequestBody InputInfoVo infoVo) {
        try {


            service.addNews(infoVo);

            return new MessageVo(200, null, "保存成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }


    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("delNews.do")
    @ResponseBody
    public MessageVo delNews(String delStr) {
        try {
            service.delNews(delStr);
            return new MessageVo(200, null, "删除成功!");
        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, null, e.getMessage());
        }
    }


    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("getNewsList.do")
    @ResponseBody
    public PagesListVo getNewsList(String searchType,String searchKey,Integer pageSize,Integer pageNumber) {
        try {
            return service.getNewsList(searchType,searchKey,pageSize,pageNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new PagesListVo<OutPutInfoVo>();
    }

    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("getPrevNextNewsDetail.do")
    @ResponseBody
    public MessageVo getPrevNextNewsDetail(String infoId) {
        try {
            return new MessageVo(200, service.getPrevNextNewsDetail(infoId), "获取数据成功!");

        } catch (Exception e) {
            e.printStackTrace();
            return new MessageVo(204, new MessageVo<HashMap>(), e.getMessage());
        }


    }

    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("getNewsDetailList.do")
    @ResponseBody
    public PagesListVo getNewsDetailList(String infoId) {
        try {
            return service.getNewsDetailList(infoId,0,0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return new PagesListVo<OutPutInfoVo>();
    }
}
