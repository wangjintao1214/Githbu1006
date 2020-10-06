package com.kgc.springssm.service;

import com.kgc.springssm.pojo.Bills;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-06 10:40
 */
public interface BillsService {
  /*  Bills selectAllByTypeId();*/
    List<Bills> selectAll(Integer typeId);
    int add(Bills bills);
}
