package com.kgc.springssm.service;

import com.kgc.springssm.pojo.Bill_type;
import org.w3c.dom.ls.LSInput;

import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-06 10:40
 */
public interface Bill_typeService {
  List<Bill_type> selectAll();
}
