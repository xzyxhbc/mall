package com.imooc.mall.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.tomcat.util.codec.binary.Base64;

public class MD5Utils {

    public MD5Utils() {
    }

    public static String getMD5Str(String strValue) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        return Base64.encodeBase64String(md5.digest((strValue + "8svbsvjkweDF,.03[").getBytes()));
    }

}