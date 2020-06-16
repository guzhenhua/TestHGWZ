package com.nuanshui.frms.test.utils.http;

import java.io.File;
import java.io.FileInputStream;

public class FileUtils {

    public static String read(String filePath){
        File file = new File(filePath);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            return new String(bytes,"UTF-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

}
