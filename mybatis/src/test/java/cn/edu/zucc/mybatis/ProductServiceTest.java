package cn.edu.zucc.mybatis;

import cn.edu.zucc.mybatis.entity.Product;
import cn.edu.zucc.mybatis.service.ProductService;
import cn.edu.zucc.mybatis.service.ProductServiceImpl;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author: hzhq1255
 * @mail: hzhq1255@163.com
 * @date: 2020/5/1 18:46
 * @desc:
 */
public class ProductServiceTest {
    private ProductService productService;
    {
        productService = new ProductServiceImpl();
    }
    @Test
    public void testAdd(){
       Product addProduct = new Product();
       addProduct.setProductId("5");
       addProduct.setProductName("热水器");
       addProduct.setUnitPrice(1000.00);
       addProduct.setUnitsInStock(25);
       addProduct.setProductDesc("燃气热水器");
        if (productService.addProduct(addProduct) == 1) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    @Test
    public void testFind(){
        String productId = "5";
        Product product = productService.findProductById(productId);
        if (product == null){
            System.out.println("没有此产品");
        }else {
            System.out.println(product.toString());
        }
    }

    @Test
    public void testUpdate(){
        Product updateProduct = new Product();
        updateProduct.setProductId("5");
        updateProduct.setUnitPrice(1500.00);
        updateProduct.setUnitsInStock(30);
        updateProduct.setProductDesc("燃气热水器升级版");
        if (productService.updateProduct(updateProduct) == 1){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }

    @Test
    public void testDelete(){
        if (productService.deleteProduct("5") == 1){
            System.out.println("删除成功");
        }else {
            System.out.println("删除失败");
        }
    }
}
