package com.young.notepad.web.controller;

import com.young.notepad.web.entity.Offer;
import com.young.notepad.web.feign.service.AdminService;
import com.young.notepad.web.service.IOfferService;
import com.young.notepad.web.util.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author young
 * @since 2020-12-10
 */
@Slf4j
@RestController
@RequestMapping("/web/offer")
public class OfferController {

    @Autowired
    IOfferService iOfferService;

    @Autowired
    AdminService adminService;

    //    @SagaStart(timeout = 20)
    @Transactional
    @GetMapping("/get")
    public R get() throws Exception {

        Offer offer = new Offer();
        Random random = new Random();
        int i = random.nextInt(100);
        offer.setCampaignId(i);
        offer.setName("test offer name...");
        offer.setCampaignId(+1);

        iOfferService.save(offer.setCountryIds("s"));
        adminService.get();

        return R.SUCCESS();
    }
}
