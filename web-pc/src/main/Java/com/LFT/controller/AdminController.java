package com.LFT.controller;

import com.LFT.pojo.Admin;
import com.LFT.pojo.AdminStore;
import com.LFT.service.AdminService;
import com.LFT.service.AdminStoreServie;
import com.LFT.utils.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private AdminStoreServie adminStoreServie;


    /**
     * 添加门店的管理员
      * @param admin
     * @param adminStore
     * @return
     */
    @RequestMapping(value = "storecreateadmin", method = RequestMethod.POST)
    @ResponseBody
    public String StoreCreateAdmin(Admin admin, AdminStore adminStore) {
        adminStore.setAdminStoreType(1);
        adminStore.setAdminStoreAddtime(new Date());
        Map<String, Object> result = new HashMap<String, Object>();
        if (adminService.queryAdminExist(admin)) { //管理员已存在
            result.put("message","admin exist");
            return JsonUtil.map2json(result);
        }else if(adminStoreServie.queryStoreExist(adminStore)){ //门店已存在 添加管理员
            AdminStore adminStore1 = adminStoreServie.queryByStoreAddress(adminStore);
            admin.setAdminStore(adminStore1.getAdminStoreName());
            admin.setAdminStoreId(adminStore1.getAdminStoreId());
            if (adminService.addAdmin(admin)){
                result.put("message","success");
                return JsonUtil.map2json(result);
            }else {
                result.put("message","add admin error");
                return JsonUtil.map2json(result);
            }
        }else {
            if (adminStoreServie.addStore(adminStore)){ // 都不存在 创建管理员和门店
                AdminStore adminStore1 = adminStoreServie.queryByStoreAddress(adminStore);
                admin.setAdminStoreId(adminStore1.getAdminStoreId());
                admin.setAdminStore(adminStore1.getAdminStoreName());
                if (adminService.addAdmin(admin)){
                    result.put("message","success");
                    return JsonUtil.map2json(result);
                }else {
                    result.put("message","add adminStore suc add admin err ");
                    return JsonUtil.map2json(result);
                }
            }else {
                result.put("message","add adminStore err ");
                return JsonUtil.map2json(result);
            }



        }

    }


}
