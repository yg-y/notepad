package com.young.notepad.web.feign.service.fallback;

import com.young.notepad.web.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceFallback implements AdminService {
    @Override
    public String get() {
        return "http get method error, into fallback";
    }
}
