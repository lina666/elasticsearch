package com.demo.elasticsearch.controller;

import com.demo.elasticsearch.bean.FileBean;
import com.demo.elasticsearch.bean.FileBeanQuery;
import com.demo.elasticsearch.bean.FileMapping;
import com.demo.elasticsearch.service.ElasticsearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * @Author: ln
 * @Date: 2019/2/22 14:04
 * @Description: elasticsearch demo
 */
@Controller
@RequestMapping("/demo")
public class ElasticsearchController {

    @Autowired
    private ElasticsearchService elasticsearchService;


    /* 创建索引 */
    @RequestMapping("/createIndex")
    @ResponseBody
    public String createIndex(String index, FileMapping mapping) throws IOException {
        String result = elasticsearchService.createIndex(index, mapping);
        return result;
    }
    /* 删除索引 Elasticsearch的版本要与client的版本一致,spring的start版本6.4.3调试失败，6.6.1调试成功 */
    @RequestMapping("/delIndex")
    @ResponseBody
    public String delIndex(String index) throws IOException {
        String result = elasticsearchService.delIndex(index);
        return result;
    }
    /* 新建文档(若索引不存在则新建) */
    @RequestMapping("/putDocument")
    @ResponseBody
    public String putDocument(String index, FileBean fileBean) throws IOException {
        String result = elasticsearchService.putDocument(index, fileBean);
        return result;
    }
    /* 删除文档 */
    @RequestMapping("/delDocument")
    @ResponseBody
    public String delDocument(String index, String id) throws IOException {
        String result = elasticsearchService.delDocument(index, id);
        return result;
    }
    /* 获取文档 */
    @RequestMapping("/getDocument")
    @ResponseBody
    public String getDocument(String index, String id) throws IOException {
        String result = elasticsearchService.getDocument(index, id);
        return result;
    }
    /* 全局搜索（不分词） */
    @RequestMapping("/keywordSearch")
    @ResponseBody
    public String keywordSearch(String index, String value,
                            int current, int size) throws IOException {
        String result = elasticsearchService.keywordSearch(index, value, current, size);
        return result;
    }
    /* 复合搜索 */
    @RequestMapping("/multiSearch")
    @ResponseBody
    public String multiSearch(String index, FileBeanQuery query,
                              int current, int size) throws IOException, IllegalAccessException {
        String result = elasticsearchService.multiSearch(index, query, current, size);
        return result;
    }
    /* 高亮搜索（注意QueryBuilders的查询方法） */
    @RequestMapping("/highlightSearch")
    @ResponseBody
    public String highlightSearch(String index, String value, int current, int size) throws IOException {
        String result = elasticsearchService.highlightSearch(index, value, current, size);
        return result;
    }
    /* 词语补全(只能根据前缀补全) */
    @RequestMapping("/suggestSearch")
    @ResponseBody
    public String suggestSearch(String index, String value) throws IOException {
        String result = elasticsearchService.suggestSearch(index, value);
        return result;
    }
    /* 词语补全(只能根据前缀补全) */
    @RequestMapping("/searchAll")
    @ResponseBody
    public String searchAll(String index, int current, int size) throws IOException {
        String result = elasticsearchService.searchAll(index, current, size);
        return result;
    }

    @RequestMapping("/putMapping")
    @ResponseBody
    public String putMapping(String index) throws IOException {
        String result = elasticsearchService.putMapping(index);
        return result;
    }
    @RequestMapping("/getMapping")
    @ResponseBody
    public String getMapping(String index) throws IOException {
        String result = elasticsearchService.getMapping(index);
        return result;
    }
    /* 查询文档总数 */
    @RequestMapping("/countQuery")
    @ResponseBody
    public String countQuery(String index) throws IOException {
        String result = elasticsearchService.countQuery(index);
        return result;
    }
    /* 嵌套查询 */
    @RequestMapping("/nestedQuery")
    @ResponseBody
    public String nestedQuery(String index, FileBeanQuery query,
                              int current, int size) throws IOException, IllegalAccessException {
        String result = elasticsearchService.nestedQuery(index, query, current, size);
        return result;
    }









}
