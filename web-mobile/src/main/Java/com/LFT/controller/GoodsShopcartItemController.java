package com.LFT.controller;

import com.LFT.pojo.GoodsShopCar;
import com.LFT.pojo.GoodsShopcartItem;
import com.LFT.service.GoodsCartService;
import com.LFT.service.GoodsShopcartItemService;
import com.LFT.utils.JsonUtil;
import com.LFT.utils.UUIDUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
@RequestMapping("/cartitem")
public class GoodsShopcartItemController {
    @Autowired
    private GoodsShopcartItemService goodsShopcartItemSrvice;

    @Autowired
    private GoodsCartService goodsShopcartService;

    /**
     * 根据uid查询我的购物车
     */
    @RequestMapping("/queryItemByUid")
    @ResponseBody
    public List<GoodsShopcartItem> queryItemByUid(@RequestParam("uid") String uid){
        //根据uid查询对应的购物车id
        String cid = goodsShopcartService.queryCidByuid(uid);
        //2.根据cid查出所有的购物车项数据
        List<GoodsShopcartItem> goods = goodsShopcartItemSrvice.finditemBycid(cid);
        System.out.print(goods);
        return goods;
    }
    /**
     * 加入购物车
     */
    @RequestMapping("/addcart")
    @ResponseBody
    public String addcart(GoodsShopcartItem goods, HttpServletRequest request){
        Map<String,String> result = new HashMap<String, String>();
        GoodsShopCar car = new GoodsShopCar();
        int rows = 0;
        int rows1 = 0;
        int rows2 = 0;
        int rows3 = 0;
        int rows4 = 0;
        int rows5 = 0;
        int uid = goods.getUid();
        int pid = goods.getProductId();
        int num = goods.getProductNum();

        List<GoodsShopcartItem> list = goodsShopcartItemSrvice.querybyuidandpid(uid,pid);
        //1.判断用户是否已存在这个商品,存在,item和cart数量增加即可
        if (list.size()>0){
            for (GoodsShopcartItem item:list) {
                String itemid =  item.getItemId();
                num +=item.getProductNum();
                item.setProductNum(num);
                item.setUpdateTime(new Date());
                rows =goodsShopcartItemSrvice.updata(item);
            }
               rows1 = goodsShopcartService.updataBycid(list.get(0).getcId(),num);
        }else{
            //不存在,判断是否存在购物车,
            List<GoodsShopcartItem> listcar = goodsShopcartItemSrvice.selectByuid(uid);

            if (listcar.size()>0){
                //存在,在item中添加在car中修改
               String c = listcar.get(0).getcId();
                goods.setcId(c);
                goods.setCreateTime(new Date());
                goods.setItemId(UUIDUtils.getOrderIdByTime());
                rows2 = goodsShopcartItemSrvice.additem(goods);
                rows3 =goodsShopcartService.updataBycid(c,num);
            }else{
                //不存在,两个都要添加
                String cid = UUIDUtils.getOrderIdByTime();
                goods.setcId(cid);
                goods.setCreateTime(new Date());
                goods.setItemId(UUIDUtils.getOrderIdByTime());
                rows4 = goodsShopcartItemSrvice.additem(goods);
                car.setcId(cid);
                car.setUid(goods.getUid());
                car.setGoodsId(goods.getProductId());
                car.setNumber(goods.getProductNum());
                car.setCreateTime(new Date());
                rows5 = goodsShopcartService.addGoodsCar(car);
            }

        }

        //添加购物车


    if (rows==1&&rows1==1){
        result.put("message","success");

    }else if (rows2==1&&rows3==1){
        result.put("message","success");

    }else if ( rows4==1&&rows5==1){
        result.put("message","success");
    }else {
        result.put("message","error");
    }
        return JsonUtil.map2json(result);
    }

}
