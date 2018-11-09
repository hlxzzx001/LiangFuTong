package com.LFT.pojo;

import javax.persistence.*;

@Table(name = "`admin_permissions`")
public class AdminPermissions {
    /**
     * 权限id
     */
    @Id
    @Column(name = "`admin_permissions_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer adminPermissionsId;

    /**
     * 管理员id
     */
    @Column(name = "`admin_id`")
    private Integer adminId;

    /**
     * 销售
     */
    @Column(name = "`sales_manger`")
    private Byte salesManger;

    /**
     * 商品
     */
    @Column(name = "`product_manger`")
    private Byte productManger;

    /**
     * 会员
     */
    @Column(name = "`members_manger`")
    private Byte membersManger;

    /**
     * 粮食管理
     */
    @Column(name = "`food_manger`")
    private Byte foodManger;

    /**
     * 会员须知
     */
    @Column(name = "`notes_manger`")
    private Byte notesManger;

    /**
     * 仓储管理
     */
    @Column(name = "`storage_manger`")
    private Byte storageManger;

    /**
     * 发布管理
     */
    @Column(name = "`publish_manger`")
    private Byte publishManger;

    /**
     * 账号管理
     */
    @Column(name = "`account_manger`")
    private Byte accountManger;

    /**
     * 农场管理
     */
    @Column(name = "`farm_manger`")
    private Byte farmManger;

    /**
     * 销售_营业概况
     */
    @Column(name = "`sales_manger_businesssituation`")
    private Byte salesMangerBusinesssituation;

    /**
     * 销售_销售单据
     */
    @Column(name = "`sales_manger_soldnote`")
    private Byte salesMangerSoldnote;

    /**
     * 销售_日结记录
     */
    @Column(name = "`sales_manger_dailyrecord`")
    private Byte salesMangerDailyrecord;

    /**
     * 销售_趋势分析
     */
    @Column(name = "`sales_manger_trendanalysis`")
    private Byte salesMangerTrendanalysis;

    /**
     * 销售_销售统计
     */
    @Column(name = "`sales_manger_salesstatistics`")
    private Byte salesMangerSalesstatistics;

    /**
     * 销售_利润统计
     */
    @Column(name = "`sales_manger_profitstatistics`")
    private Byte salesMangerProfitstatistics;

    /**
     * 商品_商品入库
     */
    @Column(name = "`product_manger_putin`")
    private Byte productMangerPutin;

    /**
     * 商品_商品管理
     */
    @Column(name = "`product_manger_products`")
    private Byte productMangerProducts;

    /**
     * 商品_预售时间活动
     */
    @Column(name = "`product_manger_activites`")
    private Byte productMangerActivites;

    /**
     * 会员_添加会员
     */
    @Column(name = "`members_manger_add`")
    private Byte membersMangerAdd;

    /**
     * 会员_会员资料修改
     */
    @Column(name = "`members_manger_update`")
    private Byte membersMangerUpdate;

    /**
     * 会员_会员日志
     */
    @Column(name = "`members_manger_note`")
    private Byte membersMangerNote;

    /**
     * 粮食_粮食种类
     */
    @Column(name = "`food_manger_type`")
    private Byte foodMangerType;

    /**
     * 粮食_粮食价格
     */
    @Column(name = "`food_manger_price`")
    private Byte foodMangerPrice;

    /**
     * 粮食_粮食折算
     */
    @Column(name = "`food_manger_exchange`")
    private Byte foodMangerExchange;

    /**
     * 须知_提粮须知
     */
    @Column(name = "`notes_manger_carryfood`")
    private Byte notesMangerCarryfood;

    /**
     * 须知_提现须知
     */
    @Column(name = "`notes_manger_withdrawal`")
    private Byte notesMangerWithdrawal;

    /**
     * 须知_商品兑换须知
     */
    @Column(name = "`notes_manger_exchange`")
    private Byte notesMangerExchange;

    /**
     * 仓储_运输管理
     */
    @Column(name = "`storage_manger_transport`")
    private Byte storageMangerTransport;

    /**
     * 仓储_仓储概况
     */
    @Column(name = "`storage_manger_general`")
    private Byte storageMangerGeneral;

    /**
     * 仓储_仓储详情
     */
    @Column(name = "`storage_manger_details`")
    private Byte storageMangerDetails;

    /**
     * 发布_banner
     */
    @Column(name = "`publish_manger_banner`")
    private Byte publishMangerBanner;

    /**
     * 发布_文章管理
     */
    @Column(name = "`publish_manger_article`")
    private Byte publishMangerArticle;

    /**
     * 农场_发布
     */
    @Column(name = "`farm_manger_add`")
    private Byte farmMangerAdd;

    /**
     * 农场_审核
     */
    @Column(name = "`farm_manger_check`")
    private Byte farmMangerCheck;

    /**
     * 获取权限id
     *
     * @return admin_permissions_id - 权限id
     */
    public Integer getAdminPermissionsId() {
        return adminPermissionsId;
    }

    /**
     * 设置权限id
     *
     * @param adminPermissionsId 权限id
     */
    public void setAdminPermissionsId(Integer adminPermissionsId) {
        this.adminPermissionsId = adminPermissionsId;
    }

    /**
     * 获取管理员id
     *
     * @return admin_id - 管理员id
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * 设置管理员id
     *
     * @param adminId 管理员id
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取销售
     *
     * @return sales_manger - 销售
     */
    public Byte getSalesManger() {
        return salesManger;
    }

    /**
     * 设置销售
     *
     * @param salesManger 销售
     */
    public void setSalesManger(Byte salesManger) {
        this.salesManger = salesManger;
    }

    /**
     * 获取商品
     *
     * @return product_manger - 商品
     */
    public Byte getProductManger() {
        return productManger;
    }

    /**
     * 设置商品
     *
     * @param productManger 商品
     */
    public void setProductManger(Byte productManger) {
        this.productManger = productManger;
    }

    /**
     * 获取会员
     *
     * @return members_manger - 会员
     */
    public Byte getMembersManger() {
        return membersManger;
    }

    /**
     * 设置会员
     *
     * @param membersManger 会员
     */
    public void setMembersManger(Byte membersManger) {
        this.membersManger = membersManger;
    }

    /**
     * 获取粮食管理
     *
     * @return food_manger - 粮食管理
     */
    public Byte getFoodManger() {
        return foodManger;
    }

    /**
     * 设置粮食管理
     *
     * @param foodManger 粮食管理
     */
    public void setFoodManger(Byte foodManger) {
        this.foodManger = foodManger;
    }

    /**
     * 获取会员须知
     *
     * @return notes_manger - 会员须知
     */
    public Byte getNotesManger() {
        return notesManger;
    }

    /**
     * 设置会员须知
     *
     * @param notesManger 会员须知
     */
    public void setNotesManger(Byte notesManger) {
        this.notesManger = notesManger;
    }

    /**
     * 获取仓储管理
     *
     * @return storage_manger - 仓储管理
     */
    public Byte getStorageManger() {
        return storageManger;
    }

    /**
     * 设置仓储管理
     *
     * @param storageManger 仓储管理
     */
    public void setStorageManger(Byte storageManger) {
        this.storageManger = storageManger;
    }

    /**
     * 获取发布管理
     *
     * @return publish_manger - 发布管理
     */
    public Byte getPublishManger() {
        return publishManger;
    }

    /**
     * 设置发布管理
     *
     * @param publishManger 发布管理
     */
    public void setPublishManger(Byte publishManger) {
        this.publishManger = publishManger;
    }

    /**
     * 获取账号管理
     *
     * @return account_manger - 账号管理
     */
    public Byte getAccountManger() {
        return accountManger;
    }

    /**
     * 设置账号管理
     *
     * @param accountManger 账号管理
     */
    public void setAccountManger(Byte accountManger) {
        this.accountManger = accountManger;
    }

    /**
     * 获取农场管理
     *
     * @return farm_manger - 农场管理
     */
    public Byte getFarmManger() {
        return farmManger;
    }

    /**
     * 设置农场管理
     *
     * @param farmManger 农场管理
     */
    public void setFarmManger(Byte farmManger) {
        this.farmManger = farmManger;
    }

    /**
     * 获取销售_营业概况
     *
     * @return sales_manger_businesssituation - 销售_营业概况
     */
    public Byte getSalesMangerBusinesssituation() {
        return salesMangerBusinesssituation;
    }

    /**
     * 设置销售_营业概况
     *
     * @param salesMangerBusinesssituation 销售_营业概况
     */
    public void setSalesMangerBusinesssituation(Byte salesMangerBusinesssituation) {
        this.salesMangerBusinesssituation = salesMangerBusinesssituation;
    }

    /**
     * 获取销售_销售单据
     *
     * @return sales_manger_soldnote - 销售_销售单据
     */
    public Byte getSalesMangerSoldnote() {
        return salesMangerSoldnote;
    }

    /**
     * 设置销售_销售单据
     *
     * @param salesMangerSoldnote 销售_销售单据
     */
    public void setSalesMangerSoldnote(Byte salesMangerSoldnote) {
        this.salesMangerSoldnote = salesMangerSoldnote;
    }

    /**
     * 获取销售_日结记录
     *
     * @return sales_manger_dailyrecord - 销售_日结记录
     */
    public Byte getSalesMangerDailyrecord() {
        return salesMangerDailyrecord;
    }

    /**
     * 设置销售_日结记录
     *
     * @param salesMangerDailyrecord 销售_日结记录
     */
    public void setSalesMangerDailyrecord(Byte salesMangerDailyrecord) {
        this.salesMangerDailyrecord = salesMangerDailyrecord;
    }

    /**
     * 获取销售_趋势分析
     *
     * @return sales_manger_trendanalysis - 销售_趋势分析
     */
    public Byte getSalesMangerTrendanalysis() {
        return salesMangerTrendanalysis;
    }

    /**
     * 设置销售_趋势分析
     *
     * @param salesMangerTrendanalysis 销售_趋势分析
     */
    public void setSalesMangerTrendanalysis(Byte salesMangerTrendanalysis) {
        this.salesMangerTrendanalysis = salesMangerTrendanalysis;
    }

    /**
     * 获取销售_销售统计
     *
     * @return sales_manger_salesstatistics - 销售_销售统计
     */
    public Byte getSalesMangerSalesstatistics() {
        return salesMangerSalesstatistics;
    }

    /**
     * 设置销售_销售统计
     *
     * @param salesMangerSalesstatistics 销售_销售统计
     */
    public void setSalesMangerSalesstatistics(Byte salesMangerSalesstatistics) {
        this.salesMangerSalesstatistics = salesMangerSalesstatistics;
    }

    /**
     * 获取销售_利润统计
     *
     * @return sales_manger_profitstatistics - 销售_利润统计
     */
    public Byte getSalesMangerProfitstatistics() {
        return salesMangerProfitstatistics;
    }

    /**
     * 设置销售_利润统计
     *
     * @param salesMangerProfitstatistics 销售_利润统计
     */
    public void setSalesMangerProfitstatistics(Byte salesMangerProfitstatistics) {
        this.salesMangerProfitstatistics = salesMangerProfitstatistics;
    }

    /**
     * 获取商品_商品入库
     *
     * @return product_manger_putin - 商品_商品入库
     */
    public Byte getProductMangerPutin() {
        return productMangerPutin;
    }

    /**
     * 设置商品_商品入库
     *
     * @param productMangerPutin 商品_商品入库
     */
    public void setProductMangerPutin(Byte productMangerPutin) {
        this.productMangerPutin = productMangerPutin;
    }

    /**
     * 获取商品_商品管理
     *
     * @return product_manger_products - 商品_商品管理
     */
    public Byte getProductMangerProducts() {
        return productMangerProducts;
    }

    /**
     * 设置商品_商品管理
     *
     * @param productMangerProducts 商品_商品管理
     */
    public void setProductMangerProducts(Byte productMangerProducts) {
        this.productMangerProducts = productMangerProducts;
    }

    /**
     * 获取商品_预售时间活动
     *
     * @return product_manger_activites - 商品_预售时间活动
     */
    public Byte getProductMangerActivites() {
        return productMangerActivites;
    }

    /**
     * 设置商品_预售时间活动
     *
     * @param productMangerActivites 商品_预售时间活动
     */
    public void setProductMangerActivites(Byte productMangerActivites) {
        this.productMangerActivites = productMangerActivites;
    }

    /**
     * 获取会员_添加会员
     *
     * @return members_manger_add - 会员_添加会员
     */
    public Byte getMembersMangerAdd() {
        return membersMangerAdd;
    }

    /**
     * 设置会员_添加会员
     *
     * @param membersMangerAdd 会员_添加会员
     */
    public void setMembersMangerAdd(Byte membersMangerAdd) {
        this.membersMangerAdd = membersMangerAdd;
    }

    /**
     * 获取会员_会员资料修改
     *
     * @return members_manger_update - 会员_会员资料修改
     */
    public Byte getMembersMangerUpdate() {
        return membersMangerUpdate;
    }

    /**
     * 设置会员_会员资料修改
     *
     * @param membersMangerUpdate 会员_会员资料修改
     */
    public void setMembersMangerUpdate(Byte membersMangerUpdate) {
        this.membersMangerUpdate = membersMangerUpdate;
    }

    /**
     * 获取会员_会员日志
     *
     * @return members_manger_note - 会员_会员日志
     */
    public Byte getMembersMangerNote() {
        return membersMangerNote;
    }

    /**
     * 设置会员_会员日志
     *
     * @param membersMangerNote 会员_会员日志
     */
    public void setMembersMangerNote(Byte membersMangerNote) {
        this.membersMangerNote = membersMangerNote;
    }

    /**
     * 获取粮食_粮食种类
     *
     * @return food_manger_type - 粮食_粮食种类
     */
    public Byte getFoodMangerType() {
        return foodMangerType;
    }

    /**
     * 设置粮食_粮食种类
     *
     * @param foodMangerType 粮食_粮食种类
     */
    public void setFoodMangerType(Byte foodMangerType) {
        this.foodMangerType = foodMangerType;
    }

    /**
     * 获取粮食_粮食价格
     *
     * @return food_manger_price - 粮食_粮食价格
     */
    public Byte getFoodMangerPrice() {
        return foodMangerPrice;
    }

    /**
     * 设置粮食_粮食价格
     *
     * @param foodMangerPrice 粮食_粮食价格
     */
    public void setFoodMangerPrice(Byte foodMangerPrice) {
        this.foodMangerPrice = foodMangerPrice;
    }

    /**
     * 获取粮食_粮食折算
     *
     * @return food_manger_exchange - 粮食_粮食折算
     */
    public Byte getFoodMangerExchange() {
        return foodMangerExchange;
    }

    /**
     * 设置粮食_粮食折算
     *
     * @param foodMangerExchange 粮食_粮食折算
     */
    public void setFoodMangerExchange(Byte foodMangerExchange) {
        this.foodMangerExchange = foodMangerExchange;
    }

    /**
     * 获取须知_提粮须知
     *
     * @return notes_manger_carryfood - 须知_提粮须知
     */
    public Byte getNotesMangerCarryfood() {
        return notesMangerCarryfood;
    }

    /**
     * 设置须知_提粮须知
     *
     * @param notesMangerCarryfood 须知_提粮须知
     */
    public void setNotesMangerCarryfood(Byte notesMangerCarryfood) {
        this.notesMangerCarryfood = notesMangerCarryfood;
    }

    /**
     * 获取须知_提现须知
     *
     * @return notes_manger_withdrawal - 须知_提现须知
     */
    public Byte getNotesMangerWithdrawal() {
        return notesMangerWithdrawal;
    }

    /**
     * 设置须知_提现须知
     *
     * @param notesMangerWithdrawal 须知_提现须知
     */
    public void setNotesMangerWithdrawal(Byte notesMangerWithdrawal) {
        this.notesMangerWithdrawal = notesMangerWithdrawal;
    }

    /**
     * 获取须知_商品兑换须知
     *
     * @return notes_manger_exchange - 须知_商品兑换须知
     */
    public Byte getNotesMangerExchange() {
        return notesMangerExchange;
    }

    /**
     * 设置须知_商品兑换须知
     *
     * @param notesMangerExchange 须知_商品兑换须知
     */
    public void setNotesMangerExchange(Byte notesMangerExchange) {
        this.notesMangerExchange = notesMangerExchange;
    }

    /**
     * 获取仓储_运输管理
     *
     * @return storage_manger_transport - 仓储_运输管理
     */
    public Byte getStorageMangerTransport() {
        return storageMangerTransport;
    }

    /**
     * 设置仓储_运输管理
     *
     * @param storageMangerTransport 仓储_运输管理
     */
    public void setStorageMangerTransport(Byte storageMangerTransport) {
        this.storageMangerTransport = storageMangerTransport;
    }

    /**
     * 获取仓储_仓储概况
     *
     * @return storage_manger_general - 仓储_仓储概况
     */
    public Byte getStorageMangerGeneral() {
        return storageMangerGeneral;
    }

    /**
     * 设置仓储_仓储概况
     *
     * @param storageMangerGeneral 仓储_仓储概况
     */
    public void setStorageMangerGeneral(Byte storageMangerGeneral) {
        this.storageMangerGeneral = storageMangerGeneral;
    }

    /**
     * 获取仓储_仓储详情
     *
     * @return storage_manger_details - 仓储_仓储详情
     */
    public Byte getStorageMangerDetails() {
        return storageMangerDetails;
    }

    /**
     * 设置仓储_仓储详情
     *
     * @param storageMangerDetails 仓储_仓储详情
     */
    public void setStorageMangerDetails(Byte storageMangerDetails) {
        this.storageMangerDetails = storageMangerDetails;
    }

    /**
     * 获取发布_banner
     *
     * @return publish_manger_banner - 发布_banner
     */
    public Byte getPublishMangerBanner() {
        return publishMangerBanner;
    }

    /**
     * 设置发布_banner
     *
     * @param publishMangerBanner 发布_banner
     */
    public void setPublishMangerBanner(Byte publishMangerBanner) {
        this.publishMangerBanner = publishMangerBanner;
    }

    /**
     * 获取发布_文章管理
     *
     * @return publish_manger_article - 发布_文章管理
     */
    public Byte getPublishMangerArticle() {
        return publishMangerArticle;
    }

    /**
     * 设置发布_文章管理
     *
     * @param publishMangerArticle 发布_文章管理
     */
    public void setPublishMangerArticle(Byte publishMangerArticle) {
        this.publishMangerArticle = publishMangerArticle;
    }

    /**
     * 获取农场_发布
     *
     * @return farm_manger_add - 农场_发布
     */
    public Byte getFarmMangerAdd() {
        return farmMangerAdd;
    }

    /**
     * 设置农场_发布
     *
     * @param farmMangerAdd 农场_发布
     */
    public void setFarmMangerAdd(Byte farmMangerAdd) {
        this.farmMangerAdd = farmMangerAdd;
    }

    /**
     * 获取农场_审核
     *
     * @return farm_manger_check - 农场_审核
     */
    public Byte getFarmMangerCheck() {
        return farmMangerCheck;
    }

    /**
     * 设置农场_审核
     *
     * @param farmMangerCheck 农场_审核
     */
    public void setFarmMangerCheck(Byte farmMangerCheck) {
        this.farmMangerCheck = farmMangerCheck;
    }
}