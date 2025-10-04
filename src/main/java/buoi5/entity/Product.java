package buoi5.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private Integer id;
    private String code;
    private String name;
    private Double price;
    private String description;
    private Category category; //bthg sử dụng: Integer category_id
}
