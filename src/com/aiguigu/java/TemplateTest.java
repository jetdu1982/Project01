package com.aiguigu.java;

import java.util.ArrayList;

/**
 * @author jet
 * @create 2018-08-18 1:09
 */
public class TemplateTest {

    //prsf
    private static final String AAA = null;

    public static void main(String[] args) {
        System.out.println();
        //soutp / soutm /soutv / xxx.sout
        System.out.println("TemplateTest.main");
        System.out.println("args = " + args);
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        System.out.println("args = [" + args + "]");
         String userName = System.getProperty("user.name");
        System.out.println(userName);
        int num = 10;
        System.out.println("num = " + num);
        String[] arr = new String[]{"TOM","Jerry","lilie","hanmemie"};
        //fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        //itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //list.for
        ArrayList<Object> testList = new ArrayList<>();
        testList.add(123);
        testList.add(345);
        testList.add(567);
        testList.add(566);
    
        for (Object o : testList) {
            
        }
        
        //list.fori
        for (int i = 0; i < testList.size(); i++) {
            
        }
        //list.forr 倒序遍历
        for (int i = testList.size() - 1; i >= 0; i--) {
            
        }
    }

    public void method(){
        ArrayList<Object> testList = new ArrayList<>();
        testList.add(123);
        testList.add(345);
        testList.add(567);
        testList.add(566);

        if (testList == null) {
            
        }
        for (int i = 0; i < 10; i++) {
            
        }

        // ifnn
        if (testList != null) {
            
        }
        //xxx.nn
        if (testList != null) {

        }
        //xxx.null
        if (testList == null) {

        }


    }
}
