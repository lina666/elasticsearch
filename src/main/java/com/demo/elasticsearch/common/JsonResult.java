package com.demo.elasticsearch.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @ author: ln
 * @ date: 2019/2/26 08:59
 * @ description: 返回结果封装
 */
@Data
public class JsonResult implements Serializable {
    /**
     * 返回状态码
     */
    private int code;
    /**
     * 返回消息
     */
    private String msg;
    /**
     * 返回数据
     */
    private Object data;
    /**
     * @ description: 成功
     * @ param []
     **/
    public static JsonResult success() {
        return new JsonResult(ResultCodeEnum.OK, RiceConstants.JSON_BACK_SUCCESS);
    }
    /**
     * @ description: 成功，带数据
     * @ param [data：返回数据]
     **/
    public static JsonResult success(Object data) {
        return new JsonResult(ResultCodeEnum.OK, RiceConstants.JSON_BACK_SUCCESS, data);
    }
    /**
     * @ description: 成功，带提示信息和数据
     * @ param [msg：提示信息, data：返回数据]
     **/
    public static JsonResult success(String msg, Object data) {
        return new JsonResult(ResultCodeEnum.OK, msg, data);
    }
    /**
     * @ description: 失败
     * @ param []
     **/
    public static JsonResult failure() {
        return new JsonResult(ResultCodeEnum.Failure, RiceConstants.JSON_BACK_FAILURE);
    }
    /**
     * @ description: 失败，带提示信息
     * @ param [msg：错误提示信息]
     **/
    public static JsonResult failure(String msg) {
        return new JsonResult(ResultCodeEnum.Failure, msg);
    }
    /**
     * @ description: 失败，带提示信息和数据
     * @ param [msg：错误提示信息, data：返回数据]
     **/
    public static JsonResult failure(String msg, Object data) {
        return new JsonResult(ResultCodeEnum.Failure, msg, data);
    }
    /**
     * @ description: 失败。带自定义错误编码和提示信息
     * @ param [code：带自定义错误编码, msg：错误提示信息]
     **/
    public static JsonResult failure(int code, String msg) {
        return new JsonResult(code, msg);
    }
    /**
     * 构造函数
     */
    public JsonResult() {}

    public JsonResult(ResultCodeEnum code, String msg) {
        this.code = code.getCode();
        this.msg = msg;
        this.data = null;
    }

    public JsonResult(ResultCodeEnum code, String msg, Object data) {
        this.code = code.getCode();
        this.msg = msg;
        this.data = data;
    }

    public JsonResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public JsonResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

}
