package com.example.dao;

import com.example.model.AcCrtPay;

public interface AcCrtPayMapper {
    int insert(AcCrtPay record);

    int insertSelective(AcCrtPay record);
}