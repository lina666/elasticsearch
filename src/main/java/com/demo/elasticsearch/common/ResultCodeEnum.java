package com.demo.elasticsearch.common;

/**
 * @Author: ZYJ
 * @Description: ResultCode
 * @CreateDate: 2019-03-11 22:46
 * @UpdateUser: ZYJ
 * @UpdateDate: 2019-03-11 22:46
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 **/
public enum ResultCodeEnum {
    //请求成功
    OK(9200, "成功"),
    //用户发出的请求有错误，如参数类型、格式等错误
    Failure(9400, "失败"),
    //token、用户名和密码校验失败
    Unauthorized(9401, "token、用户名和密码校验失败"),
    //当前用户无url访问权限
    Forbidden(9403, "无权限访问"),
    //服务器发生错误
    InternalServerError(9500, "服务器内部错误"),
    //网关错误，如网络无法连接
    BadGateway(9502, "网关错误"),
    //服务不可用，可用于断路器中
    ServiceIsNotAvailable(9503, "服务器不可用"),
    // 参数错误
    PARAM_ERROR(9901, "参数错误"),
    // 用户名或密码错误
    UNAME_OR_PWD_ERROR(9902, "用户名或密码错误");

    private final int code;
    private String message;

    ResultCodeEnum(int state, String message) {
        this.code = state;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return message;
    }

}
