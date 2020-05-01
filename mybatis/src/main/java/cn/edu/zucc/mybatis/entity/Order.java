package cn.edu.zucc.mybatis.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author: hzhq1255
 * @mail: hzhq1255@163.com
 * @date: 2020/4/30 0:39
 * @description:
 * CREATE TABLE `orders` (
 *   `OrderID` int(4) NOT NULL,
 *   `CustomerID` varchar(10) NOT NULL,
 *   `EmployeeID` int(4) NOT NULL,
 *   `OrderDate` datetime NOT NULL,
 *   PRIMARY KEY (`OrderID`)
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */
@Data
public class Order {
    private Integer orderId;
    private String customerId;
    private Integer employeeId;
    private Date orderDate;
    private OrderDetail orderDetail;
}
