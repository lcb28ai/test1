package com.example.ai_demo.util;


import com.baidu.aip.nlp.AipNlp;
import org.json.JSONObject;

public class SampleRectify {


    public static void main(String[] args) {
        //设置APPID/AK/SK
        String APP_ID = "117942708";
        String API_KEY = "NAfuHJgikbWq03Lbzvq8dRAn";
        String SECRET_KEY = "blSYgykJTxSMq68NLMnDBSf4JH43aY3e";
        // 初始化一个AipNlp
        AipNlp client = new AipNlp(APP_ID, API_KEY, SECRET_KEY);
        // 调用接口
        String text = "百度是一家人工只能公司";
        JSONObject res = client.ecnet(text, null);
        System.out.println(res.toString(2));
    }
}

