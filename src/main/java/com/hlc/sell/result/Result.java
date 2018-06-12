package com.hlc.sell.result;

import lombok.Data;

@Data
public class Result<T> {

    public int code;  //返回参数码

    public String msg;  //提示信息

    public T Data;   //返回数据
}
