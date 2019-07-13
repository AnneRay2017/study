package com.example.dao;

import com.example.model.AcSnapFee;

public interface AcSnapFeeMapper {
    int insert(AcSnapFee record);

    int insertSelective(AcSnapFee record);
}