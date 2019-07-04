package com.demo.elasticsearch.bean;

import java.util.List;

/**
 * @Author: ln
 * @Date: 2019/3/1 16:53
 * @Description: 索引的Mapping配置
 */
public class FileMapping {
    /*不分词字段*/
    private List<String> keywordField;
    /*分词字段*/
    private List<String> textField;
    /*自动补全字段*/
    private List<String> completionField;

    public List<String> getKeywordField() {
        return keywordField;
    }

    public void setKeywordField(List<String> keywordField) {
        this.keywordField = keywordField;
    }

    public List<String> getTextField() {
        return textField;
    }

    public void setTextField(List<String> textField) {
        this.textField = textField;
    }

    public List<String> getCompletionField() {
        return completionField;
    }

    public void setCompletionField(List<String> completionField) {
        this.completionField = completionField;
    }
}
