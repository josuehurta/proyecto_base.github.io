package course.springframework.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import course.springframework.model.Author;
import course.springframework.model.Product;
import course.springframework.model.ProductCategory;


@Service
public class ProductServiceImpl implements ProductService  {

    public ProductServiceImpl(){
        loadProducts();

    }

    List<Product> products = new ArrayList<>();
    @Override
    public Product getProduct(int id) {
       for (Product p: products){
            if(p.getId()== id)
            return p;
       }
        return null;
    }

    @Override
    public List<Product> listProducts() {
        // TODO Auto-generated method stub
        return products;
    }

    private void loadProducts(){
        Author jt=new Author();
        jt.setFirstName("firstName");
        jt.setLastName("lastName");
        jt.setId(1);
        jt.setImage("Instructor_jt.jpg");
    
        ProductCategory springIntroCat = new ProductCategory();
        springIntroCat.setId(1);
        springIntroCat.setCategory("Spring Introduction");

        ProductCategory springCoreCat = new ProductCategory();
        springCoreCat.setId(2);
        springCoreCat.setCategory("Spring core");

        ProductCategory springBootCat = new ProductCategory();
        springBootCat.setId(3);
        springBootCat.setCategory("Spring Boot");

        ProductCategory thymeleafCat = new ProductCategory();
        thymeleafCat.setId(4);
        thymeleafCat.setCategory("thyme leaf");

        ProductCategory geapCat = new ProductCategory();
        geapCat.setId(5);
        geapCat.setCategory("G.E.A.P");

        Product springIntro= new Product();
        springIntro.setId(1);
        springIntro.setCourseName("Introduction to spring");
        springIntro.setCourseSubtitle("Start learning spring");
        springIntro.setAuthor(jt);
        springIntro.setCourseDescription("why would you want to learn about the spring framework? Simple, spring is the most widely used framework in the enterprise today. Major companies all over the world are hiring programmers who know Spring frameword \n My Introduction Spring Framework Tutorial is designed to give you an introduction to the Spring Framework This course is written for beginners. Ideally before taking the course, you should already have a foundation with the Java programming language. You don't need to be an expert in Java, but you should the basics of Object Oriented Programming with Java. \nYou will leam what Dependency Injection is, and how Spring uses Inversion of Control to leverage Dependency Injection. Next in my course, I will walk you step by step through building your very first Spring Framework application. I'll show you hat to use the Spring Initializer and Spring Boot to jumpstart your Spring Framework project. Ideally, you can follow along and create your own Spring project. I know it can be frustrating to follow along in a course and run into errors. So don't worry, I have the complete source code examples in Git for you to checkout and use");
       
        springIntro.setPrice(new BigDecimal("0"));
        springIntro.setImageUrl("SpringIntroThumb.png");
        springIntro.getProductCategory().add(springIntroCat);
        springIntro.getProductCategory().add(springBootCat);
        products.add(springIntro);


        Product springCoreUltimate= new Product();
        springCoreUltimate.setId(2);
        springCoreUltimate.setCourseName("Spring core Ultimate");
        springCoreUltimate.setCourseSubtitle("ultimate bundle of spring core!");
        springCoreUltimate.setAuthor(jt);
        springCoreUltimate.setCourseDescription("why would you want to learn about the spring framework?");

        springCoreUltimate.setPrice(new BigDecimal("199"));
        springCoreUltimate.setImageUrl("SpringIntroThumb.png");
        springCoreUltimate.getProductCategory().add(springIntroCat);
        springCoreUltimate.getProductCategory().add(springBootCat);
        products.add(springCoreUltimate);


        Product thymeleaf= new Product();
        thymeleaf.setId(3);
        thymeleaf.setCourseName("Thymeleaf");
        thymeleaf.setCourseSubtitle("Thymeleaf and Spring!");
        thymeleaf.setAuthor(jt);
        thymeleaf.setCourseDescription("why would you want to learn about the spring framework?");

        thymeleaf.setPrice(new BigDecimal("199"));
        thymeleaf.setImageUrl("SpringIntroThumb.png");
        thymeleaf.getProductCategory().add(thymeleafCat);
        products.add(thymeleaf);


        Product springCore= new Product();
        springCore.setId(4);
        springCore.setCourseName("Spring core");
        springCore.setCourseSubtitle("Spring core - matering Spring!");
        springCore.setAuthor(jt);
        springCore.setCourseDescription("why would you want to learn about the spring framework?");

        springCore.setPrice(new BigDecimal("199"));
        springCore.setImageUrl("SpringIntroThumb.png");
        springCore.getProductCategory().add(springIntroCat);
        springCore.getProductCategory().add(springBootCat);
        products.add(springCore);

        
        Product springCoreAdv= new Product();
        springCoreAdv.setId(4);
        springCoreAdv.setCourseName("Spring core");
        springCoreAdv.setCourseSubtitle("Spring core - matering Spring!");
        springCoreAdv.setAuthor(jt);
        springCoreAdv.setCourseDescription("why would you want to learn about the spring framework?");

        springCoreAdv.setPrice(new BigDecimal("199"));
        springCoreAdv.setImageUrl("SpringIntroThumb.png");
        springCoreAdv.getProductCategory().add(springIntroCat);
        springCoreAdv.getProductCategory().add(springBootCat);
        products.add(springCoreAdv);





        Product springCoreDevOps= new Product();
        springCoreDevOps.setId(6);
        springCoreDevOps.setCourseName("Spring core");
        springCoreDevOps.setCourseSubtitle("Spring core - matering Spring!");
        springCoreDevOps.setAuthor(jt);
        springCoreDevOps.setCourseDescription("why would you want to learn about the spring framework?");

        springCoreDevOps.setPrice(new BigDecimal("199"));
        springCoreDevOps.setImageUrl("SpringIntroThumb.png");
        springCoreDevOps.getProductCategory().add(springIntroCat);
        springCoreDevOps.getProductCategory().add(springBootCat);
        products.add(springCoreDevOps);
    }

 
}
