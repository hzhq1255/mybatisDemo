package cn.edu.zucc.mybatis.service;

import cn.edu.zucc.mybatis.entity.Order;

import java.util.List;

/**
 * @author: hzhq1255
 * @mail: hzhq1255@163.com
 * @date: 2020/5/1 21:54
 * @desc:
 */
public interface OrderService {

    /**
     * 通过id 获取订单 包括详情
     * @param orderId 订单id
     * @return 订单详情
     */
    Order getOrderById(String orderId);

    /**
     * 通过查询产品名字获得所有订单
     * @param productName 产品名字
     * @return 产品的所有订单信息
     */
    List<Order> getOrderByProductName(String productName);
}
