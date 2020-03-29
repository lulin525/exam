package com.exam.utils;
import lombok.Data;
import lombok.experimental.Accessors;

/** 封装控制层值对象（处理结果） */
@Data
@Accessors(chain=true)
public class JsonResult {

    /**
     * 状态码 ，1表示success，0表示Error
     */
    private int state = 1;

    /**
     * 状态信息
     */
    private String message = "ok";

    /**
     * 正确数据
     */
    private Object data;

    public JsonResult() {
    }

    public JsonResult(String message) {
        this.message = message;
    }

    /**
     * 一般查询时调用，封装查询结果
     */
    public JsonResult(Object data) {
        this.data = data;
    }

    /**
     * 出现异常时时调用
     */
    public JsonResult(Throwable t) {
        this.state = 0;
        this.message = t.getMessage();
    }
}
