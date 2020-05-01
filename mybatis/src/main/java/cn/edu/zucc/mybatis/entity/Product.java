package cn.edu.zucc.mybatis.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author: hzhq1255
 * @mail: hzhq1255@163.com
 * @date: 2020/4/30 0:37
 * @description:
 * CREATE TABLE `product` (
 *   `ProductID` varchar(10) NOT NULL,
 *   `ProductName` varchar(100) DEFAULT NULL,
 *   `UnitPrice` decimal(8,2) DEFAULT NULL,
 *   `UnitsInStock` int(11) DEFAULT NULL,
 *   `ProductDesc` varchar(200) DEFAULT NULL,
 *   PRIMARY KEY (`ProductID`)
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */
@Data
public class Product {
    private String productId;
    private String productName;
    private Double unitPrice;
    private Integer unitsInStock;
    private String productDesc;
}
