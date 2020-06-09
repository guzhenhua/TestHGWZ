package com.nuanshui.frms.test.utils.http;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
////1.遍历fore
//        for (String item : list) {
//            System.out.println(item);
//        }
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//
////  2.遍历迭代器
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println("------" + iterator.next());
//        }
////  3.增删改查  add remove get
//        list.remove("6");
//        System.out.printf("" + list);
   //map遍历
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("张三","18");
        map.put("李四","28");
        map.put("王五","8");
        for (String key:map.keySet()) {
            System.out.println(key+"-----"+map.get(key));
        }
    }

}
