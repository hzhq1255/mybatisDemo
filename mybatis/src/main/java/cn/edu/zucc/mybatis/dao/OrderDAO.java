package cn.edu.zucc.mybatis.dao;

import cn.edu.zucc.mybatis.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: hzhq1255
 * @mail: hzhq1255@163.com
 * @date: 2020/5/1 21:37
 * @desc:
 */
public interface OrderDAO {

    /**
     * 通过id 返回 order
     * @param orderId 订单id
     * @return order
     */
    Order getOrderById(@Param("orderId")String orderId);

    /**
     * 查找产品的所有订单信息
     * @param productName 产品名称
     * @return 产品有关的所有订单
     */
    List<Order> getOrderByProductNameLike(@Param("productName")String productName);
}
