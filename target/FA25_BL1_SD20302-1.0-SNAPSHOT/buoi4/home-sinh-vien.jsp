<%--
  Created by IntelliJ IDEA.
  User: Huyen
  Date: 9/28/2025
  Time: 5:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Trang Chủ</title>
</head>
<body>
    <button>
        <a href="/sinh-vien/view-add">Thêm mới</a>
    </button>
    <table>
        <thead>
            <tr>
                <th>STT</th>
                <th>MSSV</th>
                <th>Họ tên</th>
                <th>Tuổi</th>
                <th>Giới tính</th>
                <th>Địa chỉ</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
                <c:forEach items="${lstSV}" var="sv" varStatus="i">
                    <tr>
                        <td>${i.index+1}</td>
                        <td>${sv.mssv}</td>
                        <td>${sv.ten}</td>
                        <td>${sv.tuoi}</td>
                        <td>${sv.gioiTinh}</td>
                        <td>${sv.diaChi}</td>
                        <td>
                            <a href="/sinh-vien/detail?mssv=${sv.mssv}">Detail</a>
                            <a href="/sinh-vien/view-update?mssv=${sv.mssv}">Update</a>
                            <a href="/sinh-vien/remove?mssv=${sv.mssv}">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
        </tbody>
    </table>
</body>
</html>
