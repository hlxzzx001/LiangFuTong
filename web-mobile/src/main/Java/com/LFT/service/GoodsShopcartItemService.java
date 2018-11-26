package com.LFT.service;

import com.LFT.pojo.GoodsShopcartItem;

import java.util.List;

public interface GoodsShopcartItemService {
    List<GoodsShopcartItem> finditemBycid(String cid);
    int additem(GoodsShopcartItem goods);
    List<GoodsShopcartItem> querybyuidandpid(int uid,int pid);
    int updata(GoodsShopcartItem item);
    List<GoodsShopcartItem> selectByuid(int uid);
}
