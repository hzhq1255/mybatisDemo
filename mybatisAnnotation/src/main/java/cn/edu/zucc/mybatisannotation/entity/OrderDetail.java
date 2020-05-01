package cn.edu.zucc.mybatisannotation.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author: hzhq1255
 * @mail: hzhq1255@163.com
 * @date: 2020/4/30 0:40
 * @description:
 * CREATE TABLE `orderdetails` (
 *   `OrderId` int(4) NOT NULL,
 *   `ProductId` int(4) NOT NULL,
 *   `UnitPrice` decimal(15,2) DEFAULT NULL,
 *   `Quantity` int(2) DEFAULT '0',
 *   PRIMARY KEY (`OrderId`,`ProductId`)
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */
@Data
public class OrderDetail {
    private Integer orderId;
    private Integer productId;
    private BigDecimal unitPrice;
    private Integer quantity;
}
