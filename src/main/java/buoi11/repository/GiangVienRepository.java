package buoi11.repository;

import buoi11.entity.GiangVien;
import buoi11.util.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GiangVienRepository {
    public List<GiangVien> getAll(){
        List<GiangVien> listGVs= new ArrayList<>();
        //lưu ý: db "ma" -> "mssv"
        String sql = "SELECT TOP (1000) [id]\n" +
                "      ,[ma]\n" +
                "      ,[ten]\n" +
                "      ,[tuoi]\n" +
                "      ,[gioi_tinh]\n" +
                "      ,[que_quan]\n" +
                "  FROM [DB_GiangVien].[dbo].[giang_vien]\n";
        try(Connection con = DBConnect.getConnection();
            PreparedStatement ps= con.prepareStatement(sql)) {
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                GiangVien gv= new GiangVien();
                gv.setId(rs.getInt(1));
                gv.setMa(rs.getString(2));
                gv.setTen(rs.getString(3));
                gv.setTuoi(rs.getInt(4));
                gv.setGioiTinh(rs.getBoolean(5));
                gv.setQueQuan(rs.getString(6));
                listGVs.add(gv);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return listGVs;
    }

    public static void main(String[] args) {
        GiangVienRepository repo= new GiangVienRepository();
        List<GiangVien> list= repo.getAll();
        for (GiangVien giangVien : list) {
            System.out.println(giangVien.toString());
        }
    }
}
