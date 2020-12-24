package com.young.notepad.web.feign.service.fallback;

import com.young.notepad.web.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceFallback implements AdminService {
    @Override
    public String get() throws Exception {
        throw new Exception("feign http request error, method get()");
    }
}
