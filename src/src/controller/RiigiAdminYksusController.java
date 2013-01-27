package src.controller;

import javax.servlet.http.HttpServletRequest;

import model.RiigiAdminYksus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DAO.RiigiAdminYksusDAO;

@Controller
public class RiigiAdminYksusController {
	@Autowired
    private RiigiAdminYksusDAO riigiAdminYksusDao;
 
    @RequestMapping(value="/riigiAdminYksus")
    public ModelAndView guestbook(HttpServletRequest request) {
        // Handle a new guest (if any):
        String name = request.getParameter("nimetus");
        if (name != null)
        	riigiAdminYksusDao.persist(new RiigiAdminYksus());
 
        // Prepare the result view (guest.jsp):
        return new ModelAndView("riigiadminyksus.jsp", "riigiAdminYksusDao", riigiAdminYksusDao);
    }
}
