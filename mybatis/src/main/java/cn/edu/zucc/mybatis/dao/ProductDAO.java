package cn.edu.zucc.mybatis.dao;

import cn.edu.zucc.mybatis.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: hzhq1255
 * @mail: hzhq1255@163.com
 * @date: 2020/5/1 0:02
 * @desc:
 */
public interface ProductDAO {
    /**
     * mybatis if 动态查询
     * @param productName
     * @param productDesc
     * @return
     */
    List<Product> selectProductIf(@Param("productName") String productName,
                                  @Param("productDesc") String productDesc);

    /**
     * mybatis choose when otherwise
     * @param productName
     * @param productDesc
     * @return
     */
    List<Product> selectProductCWO(@Param("productName") String productName,
                                  @Param("productDesc") String productDesc);

    /**
     * MyBatis where 标签测试
     * @param productName
     * @param productDesc
     * @return
     */
    List<Product> selectProductWhere(@Param("productName") String productName,
                                     @Param("productDesc") String productDesc);

    /**
     * MyBatis set元素 动态更新
     * @param product
     * @return
     */
    int updateProductSet(Product product);

    /**
     * MyBatis trim 标签测试
     * @param productName
     * @param productDesc
     * @return
     */
    List<Product> selectProductTrim(@Param("productName") String productName,
                                     @Param("productDesc") String productDesc);

    /**
     * MyBatis foreach 标签测试
     * @param productIds
     * @return
     */
    List<Product> selectProductIn(List<String> productIds);

    /**
     * MyBatis bind 标签测试
     * @param productDesc
     * @return
     */
    Product selectProductBind(@Param("productDesc")String productDesc);

    /**
     * 添加产品
     * @param product
     * @return
     */
    Integer addProduct(Product product);

    /**
     * 删除产品
     * @param productId
     * @return
     */
    Integer deleteProduct(@Param("productId") String productId);

    /**
     * 修改产品
     * @param product
     * @return
     */
    Integer updateProduct(Product product);

    /**
     * 通过id来查找产品
     * @param productId
     * @return
     */
    Product findProductById(@Param("productId") String productId);
}
