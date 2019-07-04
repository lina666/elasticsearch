package com.demo.elasticsearch.service;

import com.demo.elasticsearch.bean.FileBean;
import com.demo.elasticsearch.bean.FileBeanQuery;
import com.demo.elasticsearch.bean.FileMapping;

import java.io.IOException;

/**
 * @Author: ln
 * @Date: 2019/2/26 08:59
 * @Description:
 */
public interface ElasticsearchService {
	/**
	 * @Description: 新建索引
	 * @Author: ln  2019/3/1 16:51
	 * @Param: [index：索引名称]
	 **/
	String createIndex(String index, FileMapping mapping) throws IOException;

	String delIndex(String index) throws IOException;

	String putDocument(String index, FileBean fileBean) throws IOException;

	String delDocument(String index, String id) throws IOException;

	String getDocument(String index, String id) throws IOException;

	String keywordSearch(String index, String value, int current, int size) throws IOException;

	String multiSearch(String index, FileBeanQuery query, int current, int size) throws IOException, IllegalAccessException;

	String highlightSearch(String index, String value, int current, int size) throws IOException;

	String suggestSearch(String index, String value) throws IOException;

	String searchAll(String index, int current, int size) throws IOException;

	String putMapping(String index) throws IOException;

	String getMapping(String index) throws IOException;

	String countQuery(String index) throws IOException;

	String nestedQuery(String index, FileBeanQuery query, int current, int size) throws IllegalAccessException, IOException;
}
