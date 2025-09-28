package buoi4.service;

import buoi4.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    List<SinhVien> lstSV = new ArrayList<>();

    public SinhVienService() {
        lstSV.add(new SinhVien("PH123", "Hang",18,false, "Nam Dinh"));
        lstSV.add(new SinhVien("PH234", "Nguyen",20,true, "Ha Noi"));
        lstSV.add(new SinhVien("PH345", "Ngan",18,false, "Ha Noi"));
        lstSV.add(new SinhVien("PH456", "Phong",18,true, "Lang Son"));
        lstSV.add(new SinhVien("PH567", "Trang",18,false, "Ha Noi"));
        lstSV.add(new SinhVien("PH678", "Ha",18,true, "Ha Noi"));
        lstSV.add(new SinhVien("PH789", "Linh",20,false, "Hai Duong"));
    }
    public List<SinhVien> getAll(){
        return lstSV;
    }
    public void addSV(SinhVien sv){
        lstSV.add(sv);
    }
    public SinhVien searchByMSSV(String mssv){
        //gõ nhanh foreach: iter + tab
        for (SinhVien sinhVien : lstSV) {
            if(sinhVien.getMssv().equalsIgnoreCase(mssv)){
                return sinhVien;
            }
        }
        return  null;
    }
    public void deleteSV(String mssv){
        for (SinhVien sinhVien : lstSV) {
            if(sinhVien.getMssv().equalsIgnoreCase(mssv)){
                lstSV.remove(sinhVien);
                break;
            }
        }
    }
    public void updateSV(SinhVien sv){
        for (SinhVien sinhVien : lstSV) {
            if(sinhVien.getMssv().equalsIgnoreCase(sv.getMssv())){
               sinhVien.setTen(sv.getTen());
               sinhVien.setTuoi(sv.getTuoi());
               sinhVien.setGioiTinh(sv.isGioiTinh());
               sinhVien.setDiaChi(sv.getDiaChi());
            }
        }
    }
}
