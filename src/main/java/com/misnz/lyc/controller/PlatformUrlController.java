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
@RequestMapping("platform/url")
public class PlatformUrlController {
    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("index.do")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("platform/index");
    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("country_list.do")
    public ModelAndView countryList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("platform/base_country_list");
    }
    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("years_list.do")
    public ModelAndView yearsList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("platform/base_years_list");
    }
    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("trades_list.do")
    public ModelAndView tradesList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("platform/base_trades_list");
    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("tags_list.do")
    public ModelAndView tagsList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("platform/base_tags_list");
    }
    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("brands_list.do")
    public ModelAndView brandsList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("platform/base_brands_list");
    }
    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("classified_list.do")
    public ModelAndView classifiedList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("platform/base_classified_list");
    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("recruit_category_list.do")
    public ModelAndView recruitCategoryList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("platform/base_recruit_category_list");
    }
    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("shows_recruit_en_list.do")
    public ModelAndView recruitEnList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("platform/shows_recruit_en_list");
    }
    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("shows_recruit_cn_list.do")
    public ModelAndView recruitCnList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("platform/shows_recruit_cn_list");
    }

    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("shows_info_list.do")
    public ModelAndView infoList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("platform/shows_info_list");
    }
    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("{infoId}/info_file_list.do")
    public ModelAndView infoFileList(@PathVariable String infoId, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav= new ModelAndView("platform/shows_info_file_list");
        mav.getModel().put("infoId", infoId);
        return mav;
    }


    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("shows_news_list.do")
    public ModelAndView newsList(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return new ModelAndView("platform/shows_news_list");
    }
    @Auth(verifyLogin = true, verifyURL = false)
    @RequestMapping("{infoId}/news_file_list.do")
    public ModelAndView newsFileList(@PathVariable String infoId, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mav= new ModelAndView("platform/shows_news_file_list");
        mav.getModel().put("infoId", infoId);
        return mav;
    }
}

