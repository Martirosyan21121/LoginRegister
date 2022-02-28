package com.epam.loginregistration.servlet;


import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet(urlPatterns = "/register")
public class ServletRegister extends HttpServlet {
String name, lastName, email, password;
Integer age;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

       name = req.getParameter("name");
       lastName = req.getParameter("lastName");
       email = req.getParameter("email");
       password = req.getParameter("password");
       age = Integer.parseInt(req.getParameter("age"));
       PrintWriter out = resp.getWriter();


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_register?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root2000");
            String query = "insert into users(name, lastName, age, email, password) values(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, lastName);
            ps.setString(3, email);
            ps.setInt(4, age);
            ps.setString(5, password);

            ps.executeUpdate();

            out.println("Data is insert Successfully !!! ");
        }catch (Exception ignored){
            System.out.println(ignored);
        }

    }
}
