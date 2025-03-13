package com.example.ai_demo.util;

import com.baidu.aip.imageclassify.AipImageClassify;
import org.json.JSONObject;

import java.util.HashMap;

public class SampleIMG {
    public static void main(String[] args) {
        //设置APPID/AK/SK
        String APP_ID = "6553892";
        String API_KEY = "rfhxlWQXfOUtBayJRnMunhO0";
        String SECRET_KEY = "9Le4phLOk1dIBTJNk929cZf5Wfy5rVUY";
        // 初始化一个AipImageClassify
        AipImageClassify client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);
        // 调用接口
//        String path = "C:\\Users\\Licanbin\\OneDrive\\桌面\\project\\img_test\\orange.jpg";
        String path = "C:\\Users\\Licanbin\\OneDrive\\桌面\\project\\img_test\\cat.jpg";
        JSONObject res = client.advancedGeneral(path, new HashMap<String, String>());
        System.out.println(res.toString(2));

    }
}
