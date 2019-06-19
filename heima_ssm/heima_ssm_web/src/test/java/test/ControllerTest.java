package test;

import com.itcast.domain.Product;
import com.itheima.service.IProductService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ControllerTest {

    @Autowired
    private IProductService productService;

    @Test
    public void test1(){
        List<Product> all = productService.findAll();
        for (Product product : all) {
            System.out.println(product);
        }
    }
}
