package com.hjh.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hjh.bean.Employee;
import com.hjh.service.EmplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author ：胡锦洪
 * @date ：Created in 2020/2/15 20:09
 * 描述   ：处理员工crud请求
 */
@Controller
public class EmplController {

    @Autowired
    EmplService emplService;

    @RequestMapping("/emps")
    public String getAll(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){

        //查询前调用，传入页码和分页条数
        PageHelper.startPage(pn,5);
        //后面跟着查询
        List<Employee> emps = emplService.getAll();
        //使用pageInfo包装查询后的结果，只需要将pageInfo交给页面
        //封装了x详细的分页信息包括我们查出来的数据，传入连续显示的页数
        PageInfo page = new PageInfo(emps,5);
        model.addAttribute("pageInfo",page);
        return "list";

    }
}

    