package buoi2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
//value = {"/login", "/ket-qua"}: Đây là một mảng các URL patterns mà servlet này sẽ xử lý.
// Khi người dùng truy cập vào một trong các URL này, servlet loginServlet sẽ được gọi để xử lý yêu cầu.
@WebServlet(name="login-servlet", value = {"/login","/ket-qua"})
public class LoginServlet extends HttpServlet {
    //doGet + phím tab
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "HuyenNK6";
        req.setAttribute("name", name);
        req.getRequestDispatcher("/buoi2/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //lấy dữ liệu từ form login
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        //set thuộc tính
        req.setAttribute("username",username);
        req.setAttribute("password",password);
        //chuyển dữ liệu sang trang kết quả
        req.getRequestDispatcher("/buoi2/ket-qua.jsp").forward(req,resp);
    }
}
