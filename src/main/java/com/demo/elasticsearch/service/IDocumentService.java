package com.demo.elasticsearch.service;

import com.demo.elasticsearch.bean.FileBean;
import com.demo.elasticsearch.bean.FileBeanQuery;
import com.demo.elasticsearch.bean.FileMapping;

import java.io.IOException;

/**
 * @Description: TODO
 * @Author: ln
 * @Date: 2019/8/21 17:42
 * @Version: 1.0
 **/
public interface IDocumentService {

    String putDocument(String index, FileBean fileBean) throws IOException;

    String delDocument(String index, String id) throws IOException;

    String getDocument(String index, String id) throws IOException;

    String keywordSearch(String index, String value, int current, int size) throws IOException;

    String multiSearch(String index, FileBeanQuery query, int current, int size) throws IOException, IllegalAccessException;

    String highlightSearch(String index, String value, int current, int size) throws IOException;

    String suggestSearch(String index, String value) throws IOException;

    String searchAll(String index, int current, int size) throws IOException;

    String countQuery(String index) throws IOException;

    String nestedQuery(String index, FileBeanQuery query, int current, int size) throws IllegalAccessException, IOException;

}
