package api;

import JdbcUtils.JDBCUtils;
import domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/text")
public class text extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDatasource());
//        List<User> query = template.query("select * from user", new BeanPropertyRowMapper<>(User.class));
//        request.setAttribute("allUser", query);
//        try {
//            request.getRequestDispatcher("/showAllUser.jsp").forward(request, response);
//        } catch (ServletException e) {
//            e.printStackTrace();
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
