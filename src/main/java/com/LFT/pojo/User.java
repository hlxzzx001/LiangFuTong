package com.LFT.pojo;

import javax.persistence.*;

@Table(name = "`user`")
public class User {
    /**
     * 用户id
     */
    @Id
    @Column(name = "`user_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer userId;

    /**
     * 用户账户或手机号
     */
    @Column(name = "`user_account`")
    private String userAccount;

    /**
     * 用户密码
     */
    @Column(name = "`user_password`")
    private String userPassword;

    /**
     * 用户姓名
     */
    @Column(name = "`user_name`")
    private String userName;

    /**
     * 用户地址
     */
    @Column(name = "`user_address`")
    private String userAddress;

    /**
     * 用户头像
     */
    @Column(name = "`user_photo`")
    private String userPhoto;

    /**
     * 用户总存粮
     */
    @Column(name = "`user_allfood`")
    private Double userAllfood;

    /**
     * 用户总资产
     */
    @Column(name = "`user_allmoney`")
    private Double userAllmoney;

    /**
     * 用户身份证
     */
    @Column(name = "`user_idcard`")
    private String userIdcard;

    /**
     * 用户紧急联系人
     */
    @Column(name = "`user_emergency`")
    private Integer userEmergency;

    /**
     * 用户支付密码
     */
    @Column(name = "`user_payment`")
    private Integer userPayment;

    /**
     * 用户所属门店
     */
    @Column(name = "`user_belongstore`")
    private String userBelongstore;

    /**
     * 用户积分
     */
    @Column(name = "`user_credits`")
    private Double userCredits;

    /**
     * 用户种植类型
     */
    @Column(name = "`user_planttype`")
    private String userPlanttype;

    /**
     * 种植面积
     */
    @Column(name = "`user_plantarea`")
    private String userPlantarea;

    /**
     * 人口数
     */
    @Column(name = "`user_familynumber`")
    private Integer userFamilynumber;

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户账户或手机号
     *
     * @return user_account - 用户账户或手机号
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 设置用户账户或手机号
     *
     * @param userAccount 用户账户或手机号
     */
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    /**
     * 获取用户密码
     *
     * @return user_password - 用户密码
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * 设置用户密码
     *
     * @param userPassword 用户密码
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * 获取用户姓名
     *
     * @return user_name - 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户姓名
     *
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户地址
     *
     * @return user_address - 用户地址
     */
    public String getUserAddress() {
        return userAddress;
    }

    /**
     * 设置用户地址
     *
     * @param userAddress 用户地址
     */
    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    /**
     * 获取用户头像
     *
     * @return user_photo - 用户头像
     */
    public String getUserPhoto() {
        return userPhoto;
    }

    /**
     * 设置用户头像
     *
     * @param userPhoto 用户头像
     */
    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    /**
     * 获取用户总存粮
     *
     * @return user_allfood - 用户总存粮
     */
    public Double getUserAllfood() {
        return userAllfood;
    }

    /**
     * 设置用户总存粮
     *
     * @param userAllfood 用户总存粮
     */
    public void setUserAllfood(Double userAllfood) {
        this.userAllfood = userAllfood;
    }

    /**
     * 获取用户总资产
     *
     * @return user_allmoney - 用户总资产
     */
    public Double getUserAllmoney() {
        return userAllmoney;
    }

    /**
     * 设置用户总资产
     *
     * @param userAllmoney 用户总资产
     */
    public void setUserAllmoney(Double userAllmoney) {
        this.userAllmoney = userAllmoney;
    }

    /**
     * 获取用户身份证
     *
     * @return user_idcard - 用户身份证
     */
    public String getUserIdcard() {
        return userIdcard;
    }

    /**
     * 设置用户身份证
     *
     * @param userIdcard 用户身份证
     */
    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard;
    }

    /**
     * 获取用户紧急联系人
     *
     * @return user_emergency - 用户紧急联系人
     */
    public Integer getUserEmergency() {
        return userEmergency;
    }

    /**
     * 设置用户紧急联系人
     *
     * @param userEmergency 用户紧急联系人
     */
    public void setUserEmergency(Integer userEmergency) {
        this.userEmergency = userEmergency;
    }

    /**
     * 获取用户支付密码
     *
     * @return user_payment - 用户支付密码
     */
    public Integer getUserPayment() {
        return userPayment;
    }

    /**
     * 设置用户支付密码
     *
     * @param userPayment 用户支付密码
     */
    public void setUserPayment(Integer userPayment) {
        this.userPayment = userPayment;
    }

    /**
     * 获取用户所属门店
     *
     * @return user_belongstore - 用户所属门店
     */
    public String getUserBelongstore() {
        return userBelongstore;
    }

    /**
     * 设置用户所属门店
     *
     * @param userBelongstore 用户所属门店
     */
    public void setUserBelongstore(String userBelongstore) {
        this.userBelongstore = userBelongstore;
    }

    /**
     * 获取用户积分
     *
     * @return user_credits - 用户积分
     */
    public Double getUserCredits() {
        return userCredits;
    }

    /**
     * 设置用户积分
     *
     * @param userCredits 用户积分
     */
    public void setUserCredits(Double userCredits) {
        this.userCredits = userCredits;
    }

    /**
     * 获取用户种植类型
     *
     * @return user_planttype - 用户种植类型
     */
    public String getUserPlanttype() {
        return userPlanttype;
    }

    /**
     * 设置用户种植类型
     *
     * @param userPlanttype 用户种植类型
     */
    public void setUserPlanttype(String userPlanttype) {
        this.userPlanttype = userPlanttype;
    }

    /**
     * 获取种植面积
     *
     * @return user_plantarea - 种植面积
     */
    public String getUserPlantarea() {
        return userPlantarea;
    }

    /**
     * 设置种植面积
     *
     * @param userPlantarea 种植面积
     */
    public void setUserPlantarea(String userPlantarea) {
        this.userPlantarea = userPlantarea;
    }

    /**
     * 获取人口数
     *
     * @return user_familynumber - 人口数
     */
    public Integer getUserFamilynumber() {
        return userFamilynumber;
    }

    /**
     * 设置人口数
     *
     * @param userFamilynumber 人口数
     */
    public void setUserFamilynumber(Integer userFamilynumber) {
        this.userFamilynumber = userFamilynumber;
    }
}