package com.arisglobal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arisglobal.command.LoginCommand;
import com.arisglobal.entity.User;
import com.arisglobal.service.UserService;
@Controller
public class LoginController {

	@Autowired
    private UserService userService;

    @RequestMapping(value = {"/", "/index"})
    public String index(Model m) {
        m.addAttribute("command", new LoginCommand());
        return "index"; //JSP - /WEB-INF/view/index.jsp
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLogin(@ModelAttribute("command") LoginCommand cmd, Model m, HttpSession session) {
     
            User loggedInUser = userService.login(cmd.getEmail(), cmd.getPassword());
            if (loggedInUser == null) {
                
                m.addAttribute("err", "Login Failed! Enter valid credentials.");
                return "index";
            } else 
            {
                if (loggedInUser.getRole_id()==(UserService.ROLE_ADMIN)) {
                   
                   addUserInSession(loggedInUser, session);
                    return "redirect:admin/dashboard";
                }else if (loggedInUser.getRole_id()==(UserService.ROLE_Librarian)) {
                    
                    addUserInSession(loggedInUser, session);
                    return "redirect:librarian/dashboard";
                }  else if (loggedInUser.getRole_id()==(UserService.ROLE_USER)) {
                    
                    addUserInSession(loggedInUser, session);
                    return "redirect:user/dashboard";
                } else {
                    
                    m.addAttribute("err", "Invalid User ROLE");
                    return "index";
                }
            }
        
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:index?act=lo";
    }

    @RequestMapping(value = "/user/dashboard")
    public String userDashboard() {
        return "dashboard_user"; //JSP
    }

    @RequestMapping(value = "/admin/dashboard")
    public String adminDashboard() {
        return "dashboard_admin"; //JSP
    }
    @RequestMapping(value = "/librarian/dashboard")
    public String LibrarianDashboard() {
        return "dashboard_librarian"; //JSP
    }
    
    private void addUserInSession(User u, HttpSession session) {
        session.setAttribute("user", u);
        session.setAttribute("userId", u.getId());
        session.setAttribute("role", u.getRole_id());
    }

}
