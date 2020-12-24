package com.young.notepad.web.feign.service;

import com.young.notepad.web.feign.service.fallback.AdminServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "notepad-auth-api", fallback = AdminServiceFallback.class)
public interface AdminService {

    @RequestMapping(value = "/web/client-user/get",method = RequestMethod.GET)
    String get() throws Exception;
}
