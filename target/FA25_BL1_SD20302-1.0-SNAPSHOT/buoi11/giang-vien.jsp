<%--
  Created by IntelliJ IDEA.
  User: Huyen
  Date: 10/9/2025
  Time: 10:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/giang-vien/hien-thi-tat-ca" method="post">
        <label>Mã</label>
        <input type="text" name="ma" value="${gv.ma}" required><br>
        <label>Họ tên</label>
        <input type="text" name="ten" value="${gv.ten}"required><br>
        <label>Tuổi</label>
        <input type="text" name="tuoi" value="${gv.tuoi}"required><br>
        <label>Giới tính</label>
        <input type="radio" name="gioiTinh" id="male" value="nam" ${gv.gioiTinh ? "checked":""} >
        <label for="male">Nam</label>
        <input type="radio" name="gioiTinh" id="female" value="nu" ${!gv.gioiTinh ? "checked":""}>
        <label for="female">Nữ</label> <br>
        <label>Quê quán</label>
        <input type="text" name="queQuan" value="${gv.queQuan}" required>
        <button type="submit" name="hanhDong" value="add">ADD</button>
    </form>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Mã GV</th>
                <th>Họ Tên</th>
                <th>Tuổi</th>
                <th>Giới tính</th>
                <th>Quê quán</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${listGVs}" var="gv">
                <tr>
                    <td>${gv.id}</td>
                    <td>${gv.ma}</td>
                    <td>${gv.ten}</td>
                    <td>${gv.tuoi}</td>
                    <td>${gv.gioiTinh}</td>
                    <td>${gv.queQuan}</td>
                    <td>
                        <a href="/giang-vien/detail?id=${gv.id}">Detail</a>
                        <a href="/giang-vien/detail?id=${gv.id}">Update</a>
                        <a href="/giang-vien/detail?id=${gv.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>
