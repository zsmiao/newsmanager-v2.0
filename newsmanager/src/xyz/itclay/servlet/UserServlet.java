package xyz.itclay.servlet;

import xyz.itclay.domain.User;
import xyz.itclay.service.UserService;
import xyz.itclay.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 用户登录表现层
 *
 * @author ZhangSenmiao
 * @date 2021/1/26 21:29
 **/
@WebServlet("/user/*")
public class UserServlet extends BaseServlet {
    private final UserService userService = new UserServiceImpl();

    /**
     * 获取用户登录页面的用户名和密码
     * 将用户名和密码传递给业务层
     * 获取用户信息做判断
     */
    protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = userService.login(username, password);
        if (user!=null){
            HttpSession session = req.getSession();
            session.setAttribute("user",user);
            resp.sendRedirect(req.getContextPath()+"/main.html");
        }else {
            resp.sendRedirect(req.getContextPath()+"/login.html");
        }
    }
}
