package com.hlc.sell.result;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result<T>   implements Serializable {

    private static final long serialVersionUID = 1L;

    public int code;  //返回参数码

    public String msg;  //提示信息

    public T Data;   //返回数据
}
