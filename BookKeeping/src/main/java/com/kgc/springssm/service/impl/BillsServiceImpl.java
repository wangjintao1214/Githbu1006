package com.kgc.springssm.service.impl;

import com.kgc.springssm.mapper.BillsMapper;
import com.kgc.springssm.pojo.Bills;
import com.kgc.springssm.pojo.BillsExample;
import com.kgc.springssm.service.BillsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-06 10:40
 */
@Service
public class BillsServiceImpl implements BillsService{
    @Resource
    BillsMapper billsMapper;

   /* @Override
    public  Bills selectAllByTypeId(Integer typeId) {
        BillsExample example=new BillsExample();
        BillsExample.Criteria criteria = example.createCriteria();
        if(typeId!=null&&typeId!=0){
            criteria.andTypeIdEqualTo(typeId);
        }
        Bills bills = billsMapper.selectByPrimaryKey(typeId);
        return bills;
    }
*/
    @Override
    public List<Bills> selectAll(Integer typeId) {
      BillsExample example=new BillsExample();
        BillsExample.Criteria criteria = example.createCriteria();
        if(typeId!=null&&typeId!=0){
            criteria.andTypeIdEqualTo(typeId);
        }
        List<Bills> bills = billsMapper.selectByExample(example);
        return bills;
    }

    @Override
    public int add(Bills bills) {
        int i = billsMapper.insertSelective(bills);
        return i;
    }
}
