package cn.edu.zucc.mybatis;

import cn.edu.zucc.mybatis.dao.OrderDAO;
import cn.edu.zucc.mybatis.entity.Order;
import cn.edu.zucc.mybatis.service.OrderService;
import cn.edu.zucc.mybatis.service.OrderServiceImpl;
import org.junit.Test;

import java.util.List;

/**
 * @author: hzhq1255
 * @mail: hzhq1255@163.com
 * @date: 2020/5/1 21:57
 * @desc:
 */
public class OrderServiceTest {

    private OrderService orderService = new OrderServiceImpl();
    @Test
    public void getOrderById(){
        Order order = orderService.getOrderById("1");
        System.out.println(order.toString());
    }

    @Test
    public void getOrderByProductNameLike(){
        String productName = "美的空调";
        List<Order> orders = orderService.getOrderByProductName(productName);
        System.out.println("-------------------");
        System.out.println("美的空调的所有订单信息");
        for (Order order:orders){
            System.out.println(order.toString());
        }
    }
}
