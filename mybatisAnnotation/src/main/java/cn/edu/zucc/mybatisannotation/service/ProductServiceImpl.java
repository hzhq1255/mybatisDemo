package cn.edu.zucc.mybatisannotation.service;

import cn.edu.zucc.mybatisannotation.dao.ProductDAO;
import cn.edu.zucc.mybatisannotation.entity.Product;
import cn.edu.zucc.mybatisannotation.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

/**
 * @author: hzhq1255
 * @mail: hzhq1255@163.com
 * @date: 2020/5/1 18:37
 * @desc:
 */
public class ProductServiceImpl implements ProductService {

    @Override
    public Product findProductById(String productId) {
        SqlSession session = MyBatisSqlSessionFactory.openSession();
        Product product = new Product();
        try{
            ProductDAO productDAO = session.getMapper(ProductDAO.class);
            product =  productDAO.findProductById(productId);
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return product;
    }

    @Override
    public Integer addProduct(Product product) {
        SqlSession session = MyBatisSqlSessionFactory.openSession();
        Integer addCount = 0;
        try{
            ProductDAO productDAO = session.getMapper(ProductDAO.class);
            addCount =  productDAO.addProduct(product);
            session.commit();
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return addCount;
    }

    @Override
    public Integer updateProduct(Product product) {
        SqlSession session = MyBatisSqlSessionFactory.openSession();
        Integer updateCount = 0;
        try{
            ProductDAO productDAO = session.getMapper(ProductDAO.class);
            updateCount = productDAO.updateProduct(product);
            session.commit();
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return updateCount;
    }

    @Override
    public Integer deleteProduct(String productId) {
        SqlSession session = MyBatisSqlSessionFactory.openSession();
        Integer deleteCount = 0;
        try{
            ProductDAO productDAO = session.getMapper(ProductDAO.class);
            deleteCount = productDAO.deleteProduct(productId);
            session.commit();
        }catch (RuntimeException e){
            e.printStackTrace();
        }finally {
            session.close();
        }
        return deleteCount;
    }
}
