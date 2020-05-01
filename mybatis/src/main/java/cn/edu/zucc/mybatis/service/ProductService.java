package cn.edu.zucc.mybatis.service;

import cn.edu.zucc.mybatis.entity.Product;

/**
 * @author: hzhq1255
 * @mail: hzhq1255@163.com
 * @date: 2020/5/1 0:05
 * @desc:
 */
public interface ProductService {

    /**
     * 通过 Id 获取 Product
     * @param productId
     * @return product
     */
    Product findProductById(String productId);

    /**
     * 添加Product
     * @param product
     * @return success 1
     */
    Integer addProduct(Product product);

    /**
     * 修改Product
     * @param product
     * @return update line
     */
    Integer updateProduct(Product product);

    /**
     * 删除产品
     * @param productId
     * @return delete line
     */
    Integer deleteProduct(String productId);
}
