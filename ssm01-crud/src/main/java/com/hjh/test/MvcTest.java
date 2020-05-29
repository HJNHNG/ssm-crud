package com.hjh.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

/**
 * @author ：胡锦洪
 * @date ：Created in 2020/2/16 11:26
 * 描述   ：使用spring测试模块提供的测试请求功能，测试crud请求的正确性
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml","file:E:\\project\\ssm\\ssm01-crud\\src\\main\\webapp\\WEB-INF\\dispatcherServlet-servlet.xml"})
public class MvcTest {

    MockMvc mockMvc;

}

    