<%--
  Created by IntelliJ IDEA.
  User: Huyen
  Date: 9/28/2025
  Time: 5:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Trang thêm mới</title>
</head>
<body>
    <button>
        <a href="/sinh-vien/get-all">HOME</a>
    </button>
    <form action="/sinh-vien/add" method="post">
        <label>MSSV: </label>
        <input type="text" name="mssv"><br>
        <label>Tên: </label>
        <input type="text" name="ten"><br>
        <label>Tuổi: </label>
        <input type="text" name="tuoi"><br>
        <label>Giới tính: </label>
        <input type="radio" name="gioiTinh" id="male" value="nam" checked>
        <label for="male">Nam</label>
        <input type="radio" name="gioiTinh" id="female" value="nu">
        <label for="female">Nữ</label>
        <br>
        <label>Địa chỉ: </label>
        <input type="text" name="diaChi"><br>
        <button type="submit">ADD</button>
    </form>
</body>
</html>
