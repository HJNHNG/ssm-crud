package com.hjh.service;

import com.hjh.bean.Employee;
import com.hjh.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：胡锦洪
 * @date ：Created in 2020/2/16 11:04
 * 描述   ：
 */
@Service
public class EmplService {

    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> getAll(){
        return employeeMapper.selectByExampleWithDept(null);
    }

}

    