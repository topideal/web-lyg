package com.misnz.util.datatables;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

public class DataTablesUtils {
    public static Map<String,Object> covertJsonStringToHashMap(String jsonParam){
        JSONArray jsonArray = JSONArray.parseArray(jsonParam);
        Map<String,Object> map = Maps.newHashMap();
        for(int i=0;i<jsonArray.size();i++){
            JSONObject jsonObj = jsonArray.getJSONObject(i);
            map.put(jsonObj.getString("name"), jsonObj.get("value"));
        }
        return map;
    }


    public static DataTableParameter getDataTableParameterByJsonParam(String jsonParam){
        Map<String,Object> map = covertJsonStringToHashMap(jsonParam);
        int sEcho = (int) map.get("sEcho");
        int iDisplayStart = (int) map.get("iDisplayStart");
        int iDisplayLength = (int) map.get("iDisplayLength");
        int iColumns = (int)map.get("iColumns");
        Object sortingCols=map.get("iSortingCols");
        List<String> mDataProps = Lists.newArrayList();
        List<Integer> iSortCols = Lists.newArrayList();
        List<String> sSortDirs = Lists.newArrayList();
        List<String> iSortColsName = Lists.newArrayList();
        List<Boolean> bSortables = Lists.newArrayList();
        Integer iSortingCols =0;
        if(sortingCols!=null) {
             iSortingCols = Integer.parseInt(sortingCols.toString());


            for(int i=0;i<iColumns;i++){
                String dataProp = (String) map.get("mDataProp_"+i);
                Boolean sortable = (Boolean) map.get("bSortable_"+i);
                mDataProps.add(dataProp);
                bSortables.add(sortable);
            }


            for(int i=0;i<iSortingCols;i++){
                Integer sortCol = (Integer) map.get("iSortCol_"+i);
                String sortColName = mDataProps.get(sortCol);
                String sortDir = (String) map.get("sSortDir_"+i);
                iSortCols.add(sortCol);
                sSortDirs.add(sortDir);
                iSortColsName.add(sortColName);
            }
        }


        return new DataTableParameter(sEcho, iDisplayStart, iDisplayLength, iColumns, mDataProps, bSortables, iSortingCols, iSortCols, sSortDirs,iSortColsName);
    }
}
