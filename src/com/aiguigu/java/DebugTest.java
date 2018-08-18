package com.aiguigu.java;

import java.util.HashMap;

/**
 * @author jet
 * @create 2018-08-18 9:45
 */
public class DebugTest {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name","Tom");
        hashMap.put("age","20");
        hashMap.put("school","qinghua");
        hashMap.put("major","computer");


        String age = hashMap.get("age");
        System.out.println("age = " + age);

        hashMap.remove("major");
        System.out.println(hashMap);

    }
}
