package com.demo.elasticsearch.bean;

import lombok.Data;

/**
 * @ author: ln
 * @ date: 2019/2/26 08:59
 * @ description: 文档查询类
 */
@Data
public class FileBeanQuery {
    /** 文件名称 */
    private String name;
    /** 作者名称 */
    private String author;
    /** 文件内容 */
    private String content;
    /** 文件路径 */
    private String filePath;


}
