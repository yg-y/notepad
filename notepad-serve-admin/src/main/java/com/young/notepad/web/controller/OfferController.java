package com.young.notepad.web.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
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

import java.util.List;

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
    public R get() {
        List<Offer> list = iOfferService.list(new QueryWrapper<Offer>().lambda().orderByDesc(Offer::getCampaignId));
        Offer offer = list.get(0);
        offer.setName("test offer name...");
        offer.setCampaignId(offer.getCampaignId() + 1);
        iOfferService.save(offer);

        try {
            adminService.get();
        } catch (Exception e) {
            log.error("feign http request error :{}", e.getMessage());
        }

        return R.SUCCESS();
    }
}
