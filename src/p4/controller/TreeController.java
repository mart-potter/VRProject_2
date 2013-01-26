package p4.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import p4.dao.RiikDao;

@Controller
public class TreeController {

    @Resource
    private RiikDao riikDao;

    @RequestMapping(value = "/index")
    public String personTree(ModelMap model) {
        return "index";
    }
}