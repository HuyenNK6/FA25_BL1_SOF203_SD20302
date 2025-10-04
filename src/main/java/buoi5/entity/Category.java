package buoi5.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Category {
    private Integer id;
    private String code;
    private String name;
}
