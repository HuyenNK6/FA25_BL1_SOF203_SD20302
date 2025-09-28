package buoi4.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder//tạo constructor tùy ý
public class SinhVien {
    // String mssv; String ten; int tuoi; boolean gioiTinh; String diaChi
    private String mssv;
    private String ten;
    private int tuoi;
    private boolean gioiTinh;
    private String diaChi;
}
