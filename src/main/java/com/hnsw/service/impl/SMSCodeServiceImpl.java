package com.hnsw.service.impl;

import com.hnsw.domain.SMSCode;
import com.hnsw.service.SMSCodeService;
import com.hnsw.utils.CodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;

@Service
public class SMSCodeServiceImpl implements SMSCodeService {

    @Autowired
    private CodeUtils codeUtils;

    @Override
//    @Cacheable(value = "smsCode", key = "#tele")
    @CachePut(value = "smsCode", key = "#tele")
    public String sendCodeToSMS(String tele) {
        String code = codeUtils.generator(tele);
        return code;
    }

    @Override
    public boolean checkCode(SMSCode smsCOde) {
        return false;
    }
}
