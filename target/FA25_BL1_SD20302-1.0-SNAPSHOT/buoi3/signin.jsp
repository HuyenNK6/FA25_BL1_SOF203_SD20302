<%--
  Created by IntelliJ IDEA.
  User: Huyen
  Date: 9/27/2025
  Time: 12:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trang Đăng Ký</title>
</head>
<body>
    <form action="/ket-qua-signin" method="post">
        <div>
            <label> Họ và tên:</label>
            <input type="text" name="hoTen" placeholder="Nhập họ tên" required>
        </div>
        <div>
            <label> Ngày sinh:</label>
            <input type="date" name="ngaySinh" required>
        </div>
        <div>
            <label> SĐT:</label>
            <input type="text" name="sdt" placeholder="Nhập sdt" required>
        </div>
        <div>
            <label>Giới tính: </label>
            <input type="radio" name="gioiTinh" id="male" value="nam">
            <label for="male">Nam</label>
            <input type="radio" name="gioiTinh" id="female" value="nu">
            <label for="female">Nữ</label>
        </div>
        <div>
            <label>Địa chỉ: </label>
            <textarea name="diaChi" rows="5" cols="40"></textarea>
        </div>
        <%--Comment trong jsp: Ctrl + Shift+ /
            COMBOBOX
        --%>
        <div>
            <label>Quốc gia: </label>
            <select name="quocGia">
                <option value="vietNam">Việt Nam</option>
                <option value="lao">Lào</option>
                <option value="campuchia">Campuchia</option>
            </select>
        </div>
<%--        LIST BOX--%>
        <div>
            <label>Môn học: </label>
            <select name="monHoc" size="3" multiple>
                <option value="toan">Toán</option>
                <option value="van">Văn</option>
                <option value="anh">Anh</option>
            </select>
        </div>
        <div>
            <label> Sở thích: </label>
            <input type="checkbox" id="reading" name="soThich" value="docSach">
            <label for="reading">Đọc sách</label>
            <input type="checkbox" id="traveling" name="soThich" value="duLich">
            <label for="traveling">Du lịch</label>
            <input type="checkbox" id="music" name="soThich" value="ngheNhac">
            <label for="music">Nghe nhạc</label>

        </div>
        <button type="submit">ĐĂNG KÝ</button>
    </form>
</body>
</html>
