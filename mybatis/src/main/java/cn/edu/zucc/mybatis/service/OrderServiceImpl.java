package cn.edu.zucc.mybatis.service;

import cn.edu.zucc.mybatis.dao.OrderDAO;
import cn.edu.zucc.mybatis.entity.Order;
import cn.edu.zucc.mybatis.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: hzhq1255
 * @mail: hzhq1255@163.com
 * @date: 2020/5/1 21:55
 * @desc:
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public Order getOrderById(String orderId) {
        SqlSession session = MyBatisSqlSessionFactory.openSession();
        Order order = new Order();
        try {
            OrderDAO orderDAO = session.getMapper(OrderDAO.class);
            order = orderDAO.getOrderById(orderId);
        }finally {
            session.close();
        }
        return order;
    }

    @Override
    public List<Order> getOrderByProductName(String productName) {
        SqlSession session = MyBatisSqlSessionFactory.openSession();
        List<Order> orders = new ArrayList<>();
        try{
            OrderDAO orderDAO = session.getMapper(OrderDAO.class);
            orders = orderDAO.getOrderByProductNameLike(productName);
        }finally {
            session.close();
        }
        return orders;
    }
}
