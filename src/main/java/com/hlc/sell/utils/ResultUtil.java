package com.hlc.sell.utils;


import com.hlc.sell.result.Result;

public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setData(object);
        result.setCode(0);
        result.setMsg("成功");
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result resultVO = new Result();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
