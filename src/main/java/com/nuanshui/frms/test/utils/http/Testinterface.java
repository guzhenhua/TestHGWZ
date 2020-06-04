package com.nuanshui.frms.test.utils.http;

import io.restassured.response.ValidatableResponse;

public class Testinterface {
    public static void main(String[] args) {
        try {
            ValidatableResponse body= RequestUtil.sendgetWithHttps("https://test-admin.fejj.com/api/admin/news/list","EMk0Ep4iOikjVaPiLdkhbGCiOikHUNHazik9.EMkYDGKiOik3D3lsLWfKbWluHiwi1pzNHJoiD3D5bdahZGaXbiaNZpk21WzlHiwi1Wf0HJoxzTKwzJUxzcP3LdklEI4iOJeaOTg0yJC0zcCsHnzaqiH6HJeiLdkNZpzN1W9uHJX-HnVNZpkuqWalHJoiqWRv1WAiLdkMZWfsbmfvZSH6Hui2hEE6X8EuoEEPhuWRmdk9LdkMb2xlC0lKHJoiySk9.OIpRKka6RLWP_YHwetjj3Rnh7W7l7VKxyzMYy1rHAlg","page=1&limit=20&newsId=&checkStatus=&createTimeStart=&createTimeEnd=&publisherName=&contentType=");
            System.out.printf(""+body.toString());
            System.out.printf(""+body.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
