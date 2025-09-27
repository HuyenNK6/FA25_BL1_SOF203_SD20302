package buoi3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "signin-servlet", value = {"/signin", "/ket-qua-signin"})
public class SigninServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/buoi3/signin.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String hoTen = req.getParameter("hoTen");
            String ngaySinh = req.getParameter("ngaySinh");
            String sdt = req.getParameter("sdt");
            String gioiTinh = req.getParameter("gioiTinh");
            String diaChi = req.getParameter("diaChi");
            String quocGia = req.getParameter("quocGia");
            String[] arrMonHocs = req.getParameterValues("monHoc");
            String[] arrSoThichs = req.getParameterValues("soThich");

            req.setAttribute("hoTen",hoTen);
            req.setAttribute("ngaySinh",ngaySinh);
            req.setAttribute("sdt",sdt);
            req.setAttribute("gioiTinh",gioiTinh);
            req.setAttribute("diaChi",diaChi);
            req.setAttribute("quocGia",quocGia);
            req.setAttribute("arrMonHocs",arrMonHocs);
            req.setAttribute("arrSoThichs",arrSoThichs);

            req.getRequestDispatcher("/buoi3/ket-qua-signin.jsp").forward(req,resp);

    }
}
