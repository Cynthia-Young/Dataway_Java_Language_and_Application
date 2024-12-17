package com.example.demo.pojo;

// 封装响应数据的格式
public class Result {
    // 1 响应码 1：成功 0：失败
    private Integer code;
    // 2 响应码描述
    private String msg;
    // 3 响应的数据
    private Object data;

    // 静态方法 封装响应数据
    public static Result success(Object data){
        return new Result(1, "success", data);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result() {
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result [code=" + code + ", msg=" + msg + ", data=" + data + "]";
    }
}
