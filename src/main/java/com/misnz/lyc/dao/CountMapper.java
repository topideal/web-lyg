package com.misnz.lyc.dao;



public interface CountMapper {


    int tradesCountAdd(String tradesId);
    int tagsCountAdd(String tagsId);
    int brandsCountAdd(String brandsId);
    int countryCountAdd(String countryId);
    int classifiedCountAdd(String classifiedId);


    int tradesCountMinus(String tradesId);
    int tagsCountMinus(String tagsId);
    int brandsCountMinus(String brandsId);
    int countryCountMinus(String countryId);
    int classifiedCountMinus(String classifiedId);

    int batchClassifiedCountMinus(String infoId);
    int batchTagsCountMinus(String infoId);
}