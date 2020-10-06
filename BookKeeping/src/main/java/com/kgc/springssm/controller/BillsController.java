package com.kgc.springssm.controller;

import com.kgc.springssm.pojo.Bill_type;
import com.kgc.springssm.pojo.Bills;
import com.kgc.springssm.service.Bill_typeService;
import com.kgc.springssm.service.BillsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author shkstart
 * @create 2020-10-06 10:42
 */
@Controller
public class BillsController {
    @Resource
    BillsService billsService;
    @Resource
    Bill_typeService bill_typeService;
    @RequestMapping("/")
    public String toindex(Integer typeId, Model model){
        List<Bills> bills = billsService.selectAll(typeId);
        model.addAttribute("bills",bills);
        model.addAttribute("typeId",typeId);
        return "index";
    }
    @RequestMapping("/toadd")
    public String toadd(){
        return "add";
    }
    @RequestMapping("/doadd")
    public String doadd(HttpSession session,Bills bills){
        int i = billsService.add(bills);
        if(i>0){
            session.setAttribute("msg","添加成功！！！");
            return "redirect:/";
        }else {
            session.setAttribute("msg","添加失败！！！");
            return "add";
        }
    }
}
