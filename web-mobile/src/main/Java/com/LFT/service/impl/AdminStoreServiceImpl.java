package com.LFT.service.impl;

import com.LFT.dao.AdminStoreMapper;
import com.LFT.pojo.AdminStore;
import com.LFT.service.AdminStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class AdminStoreServiceImpl implements AdminStoreService {
    @Autowired
    private AdminStoreMapper adminStoreMapper;
    @Override
    public List<AdminStore> findAll(String num) {
        int i = Integer.parseInt(num);

            //查询所有门店
            Example example = new Example(AdminStore.class);
            example.createCriteria().andEqualTo("adminStoreType",num);
            return adminStoreMapper.selectByExample(example);
    }
}
