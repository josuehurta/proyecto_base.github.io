package course.springframework.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product {
    private Integer id;
    private String courseName;
    private String courseSubtitle;
    private String courseDescription;
    private Author Author;
    private BigDecimal price;
    private List<ProductCategory>ProductCategory=new ArrayList<>() ;
    private String imageUrl;
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseSubtitle() {
        return courseSubtitle;
    }
    public void setCourseSubtitle(String courseSubtitle) {
        this.courseSubtitle = courseSubtitle;
    }
    public String getCourseDescription() {
        return courseDescription;
    }
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
    public Author getAuthor() {
        return Author;
    }
    public void setAuthor(Author author) {
        this.Author = author;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public List<ProductCategory> getProductCategory() {
        return ProductCategory;
    }
    public void setProductCategory(List<ProductCategory> productCategory) {
        ProductCategory = productCategory;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
