package com.demo.elasticsearch.bean;

import lombok.Data;

import java.util.List;

/**
 * @ author: ln
 * @ date: 2019/3/1 16:53
 * @ description: 索引的Mapping配置
 */
@Data
public class FileMapping {
    /*不分词字段*/
    private List<String> keywordField;
    /*分词字段*/
    private List<String> textField;
    /*自动补全字段*/
    private List<String> completionField;

}
