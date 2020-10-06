package com.kgc.springssm.service.impl;

import com.kgc.springssm.mapper.Bill_typeMapper;
import com.kgc.springssm.pojo.Bill_type;
import com.kgc.springssm.pojo.Bills;
import com.kgc.springssm.service.Bill_typeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-06 10:40
 */
@Service
public class Bill_typeServiceImpl implements Bill_typeService{
    @Resource
    Bill_typeMapper bill_typeMapper;

    @Override
    public List<Bill_type> selectAll() {
        List<Bill_type> bill_types = bill_typeMapper.selectByExample(null);
        return bill_types;
    }
}
