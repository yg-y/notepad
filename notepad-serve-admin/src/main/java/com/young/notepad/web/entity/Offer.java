package com.young.notepad.web.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author young
 * @since 2020-12-10
 */
@Data
@Accessors(chain = true)
@TableName("OFFER")
public class Offer implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("Name")
    private String Name;

    @TableField("CampaignId")
    private Integer CampaignId;

    @TableField("CountryIds")
    private String CountryIds;

    @TableField("CarrierIds")
    private String CarrierIds;

    /**
     * 出价
     */
    @TableField("BidPrice")
    private BigDecimal BidPrice;

    /**
     * 单价
     */
    @TableField("Price")
    private BigDecimal Price;

    /**
     * 1Banner-468×60，2Mobile-300×50，3Mobile-300×100，4Popunders，5Mobile-320×480，6Icon-96×96,7Push-22x22
     */
    @TableField("Type")
    private Integer Type;

    /**
     * 图片url
     */
    @TableField("ImageUrl")
    private String ImageUrl;

    /**
     * offer url
     */
    @TableField("Url")
    private String Url;

    /**
     * 0inactive、1active
     */
    @TableField("Status")
    private Integer Status;

    /**
     * 0pending1approved2deny
     */
    @TableField("AmStatus")
    private Integer AmStatus;

    @TableField("'Desc'")
    private String Desc;

    /**
     * 0不限制1包含2排除
     */
    @TableField("OpType")
    private Integer OpType;

    @TableField("SubIds")
    private String SubIds;

    /**
     * 1Android，2Android(Tablet)，3BlackBerry，4iPad，5iPhone，6Java，7Opera Mini，8PC，9Symbian，10Windows，11feature phone，12other
     */
    @TableField("DeviceType")
    private String DeviceType;

    @TableField("CreateTime")
    private String CreateTime;

    /**
     * 当campaign为3cpa时可设置
     */
    @TableField("ClickCount")
    private Integer ClickCount;

    @TableField("TodayClickCount")
    private Integer TodayClickCount;

    @TableField("TodayFee")
    private BigDecimal TodayFee;

    @TableField("AdOfferId")
    private Integer AdOfferId;

    @TableField("AdDesc")
    private String AdDesc;

    @TableField("IsCollect")
    private Integer IsCollect;

    private String regulars;

    @TableField("CollectPercent")
    private Integer CollectPercent;

    @TableField("IsTest")
    private Integer IsTest;

    @TableField("PricePercent")
    private Integer PricePercent;

    @TableField("Caps")
    private Integer Caps;

    @TableField("TodayCaps")
    private Integer TodayCaps;

    @TableField("SalePercent")
    private Integer SalePercent;

    @TableField("LpUrl")
    private String LpUrl;

    @TableField("AdType")
    private String AdType;

    @TableField("OptStatus")
    private Integer OptStatus;

    @TableField("OptTime")
    private String OptTime;

    @TableField("IsApi")
    private Integer IsApi;

    @TableField("Preview")
    private String Preview;

    @TableField("ShowTimes")
    private Integer ShowTimes;

    @TableField("ImageUrls")
    private String ImageUrls;

    @TableField("TodayShowCount")
    private Integer TodayShowCount;

    @TableField("IconUrl")
    private String IconUrl;

    @TableField("SpyStatus")
    private Integer SpyStatus;

    @TableField("ImageLib")
    private Integer ImageLib;

    @TableField("DenyReason")
    private String DenyReason;

    @TableField("Modes")
    private String Modes;

    @TableField("ApplyTime")
    private String ApplyTime;

    @TableField("AnalysisId")
    private Integer AnalysisId;

    @TableField("OptFailReason")
    private Integer OptFailReason;

    @TableField("OptResultTime")
    private String OptResultTime;

    @TableField("ConversionProcess")
    private Integer ConversionProcess;

    private Integer level;

    @TableField("IsApiTime")
    private String IsApiTime;

    @TableField("IsRecommend")
    private Integer IsRecommend;

    @TableField("CloseCollectionOperator")
    private String CloseCollectionOperator;

    @TableField("Cr")
    private Integer Cr;

    @TableField("UniqueId")
    private String UniqueId;

    @TableField("ShowCount")
    private Integer ShowCount;

    @TableField("ImgMode")
    private Integer ImgMode;

    @TableField("TestWins")
    private Integer TestWins;

    @TableField("modeCaps")
    private String modeCaps;

    @TableField("todayModeCaps")
    private String todayModeCaps;

    @TableField("needParams")
    private String needParams;

    @TableField("PublisherPayout")
    private BigDecimal PublisherPayout;

    @TableField("MediaBuyIds")
    private String MediaBuyIds;

    /**
     * 用来记录改offer是从哪个cpaOffer导入过来
     */
    @TableField("OldCpaOfferId")
    private Integer OldCpaOfferId;

    private String regions;

    private String citys;

    @TableField("endTime")
    private String endTime;

    @TableField("ImagesZipUrl")
    private String ImagesZipUrl;

    /**
     * 分组配置app payout 刮率
     */
    @TableField("AppGroupConfig")
    private String AppGroupConfig;

    @TableField("PackageName")
    private String PackageName;

    @TableField("IsSpyPause")
    private Integer IsSpyPause;

    @TableField("RedirectPercent")
    private Integer RedirectPercent;

    @TableField("RedirectOffer")
    private Integer RedirectOffer;

    @TableField("SmartClickCount")
    private Integer SmartClickCount;

    @TableField("TotalSmartClickCount")
    private Integer TotalSmartClickCount;

    @TableField("AppCaps")
    private String AppCaps;

    @TableField("SmartPricePercent")
    private Integer SmartPricePercent;

    @TableField("SmartSalePercent")
    private Integer SmartSalePercent;

    @TableField("redirectCount")
    private Integer redirectCount;

    @TableField("Logo")
    private String Logo;

    @TableField("Creatives")
    private String Creatives;

    /**
     * 当该offer属于Recommend offer时,该字段用于排除app/包含app
     */
    @TableField("RecommendAppList")
    private String RecommendAppList;

    /**
     * 当该offer属于Recommend offer时,排除/包含/ALL
     */
    @TableField("RecommendAppListOpt")
    private Integer RecommendAppListOpt;

    @TableField("jsBeforeUrl")
    private String jsBeforeUrl;

    private String block;


}
