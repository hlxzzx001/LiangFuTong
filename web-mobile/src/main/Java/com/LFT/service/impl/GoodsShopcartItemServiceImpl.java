package com.LFT.service.impl;

import com.LFT.dao.GoodsShopcartItemMapper;
import com.LFT.pojo.GoodsShopCar;
import com.LFT.pojo.GoodsShopcartItem;
import com.LFT.service.GoodsShopcartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class GoodsShopcartItemServiceImpl implements GoodsShopcartItemService {
    @Autowired
    private GoodsShopcartItemMapper goodsShopcartItemMapper;

    @Override
    public List<GoodsShopcartItem> finditemBycid(String cid) {
        Example example = new Example(GoodsShopcartItem.class);
        example.createCriteria().andEqualTo("cId",cid);
        return goodsShopcartItemMapper.selectByExample(example);
    }

    @Override
    public int additem(GoodsShopcartItem goods) {
        return goodsShopcartItemMapper.insert(goods);
    }

    @Override
    public List<GoodsShopcartItem> querybyuidandpid(int uid, int pid) {
        Example example = new Example(GoodsShopcartItem.class);
        example.createCriteria().andEqualTo("uid",uid).andEqualTo("productId",pid);
        return goodsShopcartItemMapper.selectByExample(example);
    }

    @Override
    public int updata(GoodsShopcartItem item) {
        return goodsShopcartItemMapper.updateByPrimaryKey(item);

    }

    @Override
    public List<GoodsShopcartItem> selectByuid(int uid) {
        Example example = new Example(GoodsShopcartItem.class);
        example.createCriteria().andEqualTo("uid",uid);
        return goodsShopcartItemMapper.selectByExample(example);
    }
}
