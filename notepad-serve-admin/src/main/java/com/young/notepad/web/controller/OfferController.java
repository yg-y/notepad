package com.young.notepad.web.controller;


import com.young.notepad.web.service.IOfferService;
import com.young.notepad.web.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author young
 * @since 2020-12-10
 */
@RestController
@RequestMapping("/web/offer")
public class OfferController {

    @Autowired
    IOfferService iOfferService;

    @GetMapping("/get")
    public R get() {
        return R.SUCCESS(iOfferService.list());
    }

}
