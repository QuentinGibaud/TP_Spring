/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.prweb.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.centrale.prweb.items.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Quentin GIBAUD
 */
@Controller
public class HelloController {
    
    public HelloController(){
        
    }
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView handleHello(HttpServletRequest request, HttpServletResponse response){
        /*
        HashMap<String,String> theMap = new HashMap<String,String>();
        theMap.put("FirstName","Quentin");
        theMap.put("LastName","Gibaud");
        return new ModelAndView("hello",theMap);
        */
        
        /*
        List<Object> theList = new LinkedList<Object>();
        theList.add("item 1");
        theList.add(123);
        ModelAndView result = new ModelAndView("hello");
        result.addObject("FirstName","Nicolas");
        result.addObject("LastName","Najburg");
        result.addObject("liste",theList);
        return result;
        */
        User anUser = new User();
        anUser.setLogin("myLogin");
        anUser.setPassw("myPasswd");
        ModelAndView result = new ModelAndView("hello");
        
        result.addObject("aUser", anUser);
        
        return result;
    }
}
