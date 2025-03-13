package com.example.ai_demo.util;

import java.util.*;
import org.json.JSONObject;
import com.baidu.aip.ocr.AipOcr;
public class SampleWORDS {


    public static void main(String[] args) {
        //设置APPID/AK/SK
        String APP_ID = "6553895";
        String API_KEY = "ixbH1YbGsTcUC4cuRWKAXQpG";
        String SECRET_KEY = "VX6LA1MiJYiB20cNKUvQnQmZcanae1Ka";
        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);

        // 调用接口
        String path = "C:\\Users\\Licanbin\\OneDrive\\桌面\\project\\img_test\\resou.jpg";
        JSONObject res = client.basicGeneral(path, new HashMap<String, String>());
        System.out.println(res.toString(2));
    }
}
