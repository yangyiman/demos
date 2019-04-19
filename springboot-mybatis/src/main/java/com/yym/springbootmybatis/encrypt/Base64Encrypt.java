package com.yym.springbootmybatis.encrypt;

import org.mockito.internal.util.StringUtil;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * describe:
 *
 * @author yangyiman
 * @date 2019/04/18
 */
public class Base64Encrypt {


    private final static String salt = "changjiangyunxinmeiti";

      /**
      * 字符串Base64位加密
      * @param str
      * @return
      */
       public static String base64Encode(String string) {
            // 重新封装
            String str = string + salt;
            // base64加密
            BASE64Encoder encoder = new BASE64Encoder();
            String result = encoder.encode(str.getBytes());
            return result;
       }

     /**
      * 字符串Base64位解密
      * @param str
      * @return
      * @throws IOException
      */
        public static String base64Decode(String str) {
            BASE64Decoder decoder = new BASE64Decoder();
            try {
                byte[] bytes = decoder.decodeBuffer(str);
                String decodeStr = new String(bytes);
                String result = decodeStr.replaceAll(salt,"");
                return result.substring(0,result.length());
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

}
