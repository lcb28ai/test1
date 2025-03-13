package com.example.ai_demo.util;

import com.baidu.aip.imageclassify.AipImageClassify;
import com.baidu.aip.nlp.AipNlp;
import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;

public class AiUtils {
    public static String img(MultipartFile file) throws IOException {
        //设置APPID/AK/SK
        String APP_ID = "6553892";
        String API_KEY = "rfhxlWQXfOUtBayJRnMunhO0";
        String SECRET_KEY = "9Le4phLOk1dIBTJNk929cZf5Wfy5rVUY";
        // 初始化一个AipImageClassify
        AipImageClassify client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);
        // 调用接口

        JSONObject res = client.advancedGeneral(file.getBytes(), new HashMap<String, String>());
//        System.out.println(res.toString(2));
        return res.toString(2);
    }

    public static String word(MultipartFile file) throws IOException {
        //设置APPID/AK/SK
        String APP_ID = "6553895";
        String API_KEY = "ixbH1YbGsTcUC4cuRWKAXQpG";
        String SECRET_KEY = "VX6LA1MiJYiB20cNKUvQnQmZcanae1Ka";
        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        JSONObject res = client.basicGeneral(file.getBytes(), new HashMap<String, String>());
//        System.out.println(res.toString(2));

        return res.toString(2);
    }

    public static String nlp(String text) {
        //设置APPID/AK/SK
        String APP_ID = "117942708";
        String API_KEY = "NAfuHJgikbWq03Lbzvq8dRAn";
        String SECRET_KEY = "blSYgykJTxSMq68NLMnDBSf4JH43aY3e";
        // 初始化一个AipNlp
        AipNlp client = new AipNlp(APP_ID, API_KEY, SECRET_KEY);
        // 调用接口
        text = "百度是一家人工只能公司";
        JSONObject res = client.ecnet(text, null);
        String string = res.getJSONObject("item").getString("currect_query");
//        System.out.println(res.toString(2));
        return string;
    }

    public static void main(String[] args) {
//        System.out.println(word());
//        System.out.println(img());

        //目前用不了了
//        System.out.println(nlp());
    }
}
