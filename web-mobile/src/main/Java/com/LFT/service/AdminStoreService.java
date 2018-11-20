package com.LFT.service;

import com.LFT.pojo.AdminStore;

import java.util.List;

public interface AdminStoreService {
    List<AdminStore> findAll(String num);
}
