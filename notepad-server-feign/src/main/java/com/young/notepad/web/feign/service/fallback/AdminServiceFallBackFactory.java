package com.young.notepad.web.feign.service.fallback;

import com.young.notepad.web.feign.service.AdminService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceFallBackFactory implements FallbackFactory<AdminService> {
    private final AdminServiceFallback adminServiceFallback;

    public AdminServiceFallBackFactory(AdminServiceFallback adminServiceFallback) {
        this.adminServiceFallback = adminServiceFallback;
    }

    @Override
    public AdminService create(Throwable throwable) {
        throwable.printStackTrace();
        return adminServiceFallback;
    }
}
