package com.hjh.test;

import com.hjh.bean.Department;
import com.hjh.bean.Employee;
import com.hjh.dao.DepartmentMapper;
import com.hjh.dao.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * @author ：胡锦洪
 * @date ：Created in 2020/2/15 19:03
 * 描述   ：1.导入spring test模块
 *          2.@ContextConfiguration()指定spring的配置文件
 *          3.直接Autowired要使用的组件即可
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestCRUD {
    @Autowired
    DepartmentMapper departmentMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    SqlSession sqlSession;

    @Test
    public void testCRUD(){
        //插入几个部门
//        departmentMapper.insertSelective(new Department(null,"开发部"));
//        departmentMapper.insertSelective(new Department(null,"测试部"));

        //插入几个员工
//        employeeMapper.insertSelective(new Employee(null,"zhangsan","M","zhangsan@qq.com",1));

        //批量插入员工
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        for (int i = 0; i < 100; i++) {
            String uid = UUID.randomUUID().toString().substring(0, 5);
            mapper.insertSelective(new Employee(null,uid,"M",uid+"@qq.com",1));
        }
        System.out.println("插入完成");


    }
}

    