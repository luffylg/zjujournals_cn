package com.zdxb.dao;

import java.io.*;
import java.util.Properties;

/**
 * Created by hp on 2017/2/13.
 */
public class DaoBase {
    public String user;
    public String password;
    public DaoBase(){
        try {
            Properties properties =new Properties();
            String path = Thread.currentThread().getContextClassLoader().getResource("database.properties").getPath();
            InputStream in = new BufferedInputStream(new FileInputStream(path));
            properties.load(in);
            user =  properties.getProperty("user");
            password = properties.getProperty("password");
            in.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }

//    public static void main(String[] args) {
//        System.out.println(new DaoBase().password);
//    }

}
