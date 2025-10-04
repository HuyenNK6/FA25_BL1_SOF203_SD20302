package buoi5.repository;

import buoi5.entity.Category;
import buoi5.entity.Product;
import buoi5.util.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    public List<Product> getAll(){
        List<Product> lstProducts= new ArrayList<>();
        String sql="SELECT dbo.category.id AS id_category, dbo.category.category_code, \n" +
                "dbo.category.category_name, dbo.product.id AS id_product,\n" +
                "dbo.product.product_code, dbo.product.product_name, dbo.product.price, dbo.product.description\n" +
                "FROM     dbo.category INNER JOIN\n" +
                "                  dbo.product ON dbo.category.id = dbo.product.category_id";

        try (Connection con = DBConnect.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs= ps.executeQuery();//kết quả trả về dưới dạng bảng
            //kiểm tra còn next đc nữa ko
            while (rs.next()){
                //tạo đối tượng category
                Category category = new Category();
                category.setId(rs.getInt(1));
                category.setCode(rs.getString(2));
                category.setName(rs.getString(3));
                //tạo đối tượng product
                Product product = new Product();
                product.setId(rs.getInt(4));
                product.setCode(rs.getString(5));
                product.setName(rs.getString(6));
                product.setPrice(rs.getDouble(7));
                product.setDescription(rs.getString(8));
                product.setCategory(category);
                //thêm đối tượng vào danh sách
                lstProducts.add(product);
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return  lstProducts;
    }

    public static void main(String[] args) {
        ProductRepository repo= new ProductRepository();
        List<Product> lstProducts= repo.getAll();
        for (Product product : lstProducts) {
            System.out.println(product.toString());
        }

    }
}
