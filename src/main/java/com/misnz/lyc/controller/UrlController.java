package com.misnz.lyc.controller;


import com.misnz.framework.annotation.Auth;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by david on 2015/3/1.
 */

@Controller
@RequestMapping("/")
public class UrlController {
    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("index.do")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("index");
    }

    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("aboutus.do")
    public ModelAndView aboutus(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("about_us");
    }
    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("recruitenlist.do")
    public ModelAndView recruitenlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("recruit_list");
    }

    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("{id}/recruitendetail.do")
    public ModelAndView recruitendetail(@PathVariable String id,HttpServletRequest request, HttpServletResponse response) throws Exception {
         ModelAndView mav= new ModelAndView("recruit_detail");
        mav.getModel().put("id", id);
        return mav;
    }

    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("recruitcnlist.do")
    public ModelAndView recruitcnlist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("cn/recruit_list");
    }

    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("{searchType}/{searchKey}/infolist.do")
    public ModelAndView searchIndex(@PathVariable String searchType,@PathVariable String searchKey,HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav= new ModelAndView("info_list");
      //  System.out.println("searchType====>"+searchType);
      //  System.out.println("searchKey====>"+searchKey);
        mav.getModel().put("searchType", searchType);
        mav.getModel().put("searchKey", searchKey);
        return mav;
    }

    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("{infoId}/info_details.do")
    public ModelAndView infoDetails(@PathVariable String infoId,String title,HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav= new ModelAndView("info_details");
        mav.getModel().put("infoId", infoId);
        mav.getModel().put("title", title);
        return mav;
    }

    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("infolist.do")
    public ModelAndView infolist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("info_list");
    }
    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("newslist.do")
    public ModelAndView newslist(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("news_list");
    }
    @Auth(verifyLogin = false, verifyURL = false)
    @RequestMapping("{infoId}/news_details.do")
    public ModelAndView newsDetails(@PathVariable String infoId,String title,HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav= new ModelAndView("news_details");
        mav.getModel().put("infoId", infoId);
        mav.getModel().put("title", title);
        return mav;
    }
}

