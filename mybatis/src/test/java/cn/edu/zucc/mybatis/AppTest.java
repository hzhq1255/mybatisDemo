package cn.edu.zucc.mybatis;


import static org.junit.Assert.assertTrue;

import cn.edu.zucc.mybatis.dao.ProductDAO;
import cn.edu.zucc.mybatis.entity.Product;
import cn.edu.zucc.mybatis.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testIf(){

        SqlSession session = MyBatisSqlSessionFactory.openSession();
        HashMap<String,String> params = new HashMap<>(2);
        params.put("productName","空调");
        params.put("productDesc","冰箱");
        //logger.debug("selectProductIf",params.toString());
        try{
            ProductDAO productDAO = session.getMapper(ProductDAO.class);
            System.out.println("输入参数 productName = null productDesc = null ");
            List<Product> products1 = productDAO.selectProductIf(null,null);
            System.out.println(products1.toString()+'\n');
            System.out.println("输入参数 productName = 空调 productDesc = null");
            List<Product> products2 = productDAO.selectProductIf(params.get("productName"),null);
            System.out.println(products2.toString()+'\n');
            System.out.println("输入参数 productName = null productDesc = 冰箱");
            List<Product> products3 = productDAO.selectProductIf(null,params.get("productDesc"));
            System.out.println(products3.toString()+'\n');
            System.out.println("输入参数 productName = 空调 productDesc = 冰箱");
            List<Product> products4 = productDAO.selectProductIf(params.get("productName"),params.get("productDesc"));
            System.out.println(products4.toString()+'\n');
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    @Test
    public void testCWO(){
        SqlSession session = MyBatisSqlSessionFactory.openSession();
        HashMap<String,String> params = new HashMap<>(2);
        params.put("productName","空调");
        params.put("productDesc","冰箱");
        logger.debug("selectProductCWO",params.toString());
        try{
            ProductDAO productDAO = session.getMapper(ProductDAO.class);
            System.out.println("输入参数 productName = 空调 productDesc = null");
            List<Product> products1 = productDAO.selectProductCWO(params.get("productName"),null);
            System.out.println(products1.toString()+'\n');
            System.out.println("输入参数 productName = null productDesc = 冰箱");
            List<Product> products2 = productDAO.selectProductCWO(params.get("productName"),params.get("productDesc"));
            System.out.println(products2.toString()+'\n');
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            session.close();
        }

    }

    @Test
    public void testWhere(){
        SqlSession session = MyBatisSqlSessionFactory.openSession();
        HashMap<String,String> params = new HashMap<>(2);
        params.put("productName","空调");
        params.put("productDesc","冰箱");
        //logger.debug("selectProductCWO",params.toString());
        try{
            ProductDAO productDAO = session.getMapper(ProductDAO.class);
            System.out.println("输入参数 productName = null productDesc = null");
            List<Product> products1 = productDAO.selectProductWhere(null,null);
            System.out.println(products1.toString()+'\n');
            System.out.println("输入参数 productName = 空调 productDesc = null");
            List<Product> products2 = productDAO.selectProductWhere(params.get("productName"),null);
            System.out.println(products2.toString()+'\n');
            System.out.println("输入参数 productName = null productDesc = 冰箱");
            List<Product> products3 = productDAO.selectProductWhere(null,params.get("productDesc"));
            System.out.println(products3.toString()+'\n');
            System.out.println("输入参数 productName = 空调 productDesc = 冰箱");
            List<Product> products4 = productDAO.selectProductWhere(params.get("productName"),params.get("productDesc"));
            System.out.println(products4.toString()+'\n');
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    @Test
    public void testSet(){
        SqlSession session = MyBatisSqlSessionFactory.openSession();
        Product product = new Product();
        product.setProductId("4");
        product.setProductName("洗衣机");
        product.setProductDesc("超强力洗衣机");
        try{
            ProductDAO productDAO = session.getMapper(ProductDAO.class);
            int isUpdate = productDAO.updateProductSet(product);
            System.out.println(isUpdate);
            session.commit();
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {

            session.close();
        }
    }

    @Test
    public void testTrim(){
        SqlSession session = MyBatisSqlSessionFactory.openSession();
        HashMap<String,String> params = new HashMap<>(2);
        params.put("productName","空调");
        params.put("productDesc","冰箱");
        //logger.debug("selectProductCWO",params.toString());
        try{
            ProductDAO productDAO = session.getMapper(ProductDAO.class);
            System.out.println("输入参数 productName = null productDesc = null");
            List<Product> products1 = productDAO.selectProductTrim(null,null);
            System.out.println(products1.toString()+'\n');
            System.out.println("输入参数 productName = 空调 productDesc = null");
            List<Product> products2 = productDAO.selectProductTrim(params.get("productName"),null);
            System.out.println(products2.toString()+'\n');
            System.out.println("输入参数 productName = null productDesc = 冰箱");
            List<Product> products3 = productDAO.selectProductTrim(null,params.get("productDesc"));
            System.out.println(products3.toString()+'\n');
            System.out.println("输入参数 productName = 空调 productDesc = 冰箱");
            List<Product> products4 = productDAO.selectProductTrim(params.get("productName"),params.get("productDesc"));
            System.out.println(products4.toString()+'\n');
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    @Test
    public void testForeach(){
        SqlSession session = MyBatisSqlSessionFactory.openSession();
        List<String> ids = new ArrayList<>();
        ids.add("1");
        ids.add("2");
        ids.add("3");
        ids.add("4");
        try{
            ProductDAO productDAO = session.getMapper(ProductDAO.class);
            List<Product> products = productDAO.selectProductIn(ids);
            System.out.println(products.toString());
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }

    @Test
    public void testBind(){
        SqlSession session = MyBatisSqlSessionFactory.openSession();
        try{
            ProductDAO productDAO = session.getMapper(ProductDAO.class);
            String productDesc = "冰箱";
            Product product = productDAO.selectProductBind(productDesc);
            System.out.println(product.toString());
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
    }
}
