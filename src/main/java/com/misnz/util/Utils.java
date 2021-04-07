package com.misnz.util;

import com.github.pagehelper.PageInfo;
import com.misnz.lyc.model.PagesListVo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Utils {
    public static List getPageResult(PageInfo pageObj, Integer pageNumber) {
        if (pageObj == null) {
            return new ArrayList();
        }
        if (pageObj.getPages() < pageNumber) {
            return new ArrayList();
        } else {
            return pageObj.getList();
        }

    }



    public static String getFileSuffix(String fileName) {
        if (fileName == null || "".equals(fileName)) {
            return "";
        }
        if (fileName.indexOf(".") > 0) {
            return fileName.substring(fileName.lastIndexOf("."));
        } else {
            return "";
        }
    }
    public static PagesListVo getPagesAndResult(PageInfo pageObj, Integer pageNumber) {
        PagesListVo pagesListVo = new PagesListVo();
        pagesListVo.setPages(1);
        pagesListVo.setData(new ArrayList());
        pagesListVo.setRecords(0);
        if (pageObj == null) {
            return pagesListVo;
        }

        if (pageObj.getPages() < pageNumber) {
            pagesListVo.setPages(pageObj.getPages());
            pagesListVo.setRecords(pageObj.getTotal());
            return pagesListVo;
        } else {
            pagesListVo.setPages(pageObj.getPages());
            pagesListVo.setData(pageObj.getList());
            pagesListVo.setRecords(pageObj.getTotal());
            return pagesListVo;
        }

    }

    public static void uploadFile(InputStream in, String filePath, String newfileName) throws Exception{

        File uploadFile = new File(filePath, newfileName);
        OutputStream out = new FileOutputStream(uploadFile);
        byte[] buffer = new byte[1024 * 1024];
        int length;
        while ((length = in.read(buffer)) > 0) {
            out.write(buffer, 0, length);
        }
        in.close();
        out.close();

    }
}
