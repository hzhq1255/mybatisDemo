package cn.edu.zucc.mybatisannotation.dao;

import cn.edu.zucc.mybatisannotation.entity.Product;
import org.apache.ibatis.annotations.*;


/**
 * @author: hzhq1255
 * @mail: hzhq1255@163.com
 * @date: 2020/5/1 0:02
 * @desc:
 */
@Mapper
public interface ProductDAO {
    /**
     * 添加产品
     * @param product
     * @return
     */
    @Insert("  insert into product (ProductID,ProductName,UnitPrice,UnitsInStock,ProductDesc) " +
            "        values (#{productId},#{productName},#{unitPrice},#{unitsInStock},#{productDesc}) ")
    Integer addProduct(Product product);

    /**
     * 删除产品
     * @param productId
     * @return
     */
    @Delete("delete from product where ProductID = #{productId}")
    Integer deleteProduct(@Param("productId") String productId);

    /**
     * 修改产品
     * @param product
     * @return
     */
    @Update({"<script>",
            "update product",
            "<set>",
            "        <if test = 'productId != null'>ProductID=#{productId},</if>",
            "        <if test = 'productName != null'>ProductName=#{productName},</if>",
            "        <if test = 'unitPrice != null'>UnitPrice=#{unitPrice},</if>",
            "        <if test = 'unitsInStock != null'>UnitsInStock=#{unitsInStock},</if>",
            "        <if test = 'productDesc != null'>ProductDesc=#{productDesc},</if>",
            "</set>",
            "where productId = #{productId}",
            "</script>"})
    Integer updateProduct(Product product);

    /**
     * 通过id来查找产品
     * @param productId
     * @return
     */
    @Select("select * from product where ProductId=#{productId}")
    Product findProductById(@Param("productId") String productId);
}
