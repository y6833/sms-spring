package com.hnsw.utils;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@Component
public class CodeUtils {

    //生成电话号码的验证码
    public String generator(@NotNull String tele) {
        int hash = tele.hashCode();
        int encryption = 20206666;
        long result = hash ^  encryption;
        long nowTime = System.currentTimeMillis();
        result = result ^ nowTime;
        long code = result % 100000;
        code = code < 0 ? -code : code;
        String codeStr = String.valueOf(code);
        int len = codeStr.length();
        if (len < 6) {
            while (len++< 6) {
                int supNum = (int)(Math.random() * 10);
                codeStr = supNum + codeStr;
            }
        }
        return codeStr;

    }

//    public static void main(String[] args) throws Exception {
//        System.out.println(new CodeUtils().generator("18866668888"));
//    }
}
