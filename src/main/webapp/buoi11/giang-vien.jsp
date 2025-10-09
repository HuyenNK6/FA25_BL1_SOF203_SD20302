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
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Mã GV</th>
                <th>Họ Tên</th>
                <th>Tuổi</th>
                <th>Giới tính</th>
                <th>Quê quán</th>
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
                </tr>
            </c:forEach>
        </tbody>
    </table>

</body>
</html>
