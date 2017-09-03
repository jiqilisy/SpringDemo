package org.baby.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created with Intellij IDEA.
 * Description: Spring MVC 控制器
 * User: baby
 * Date: 2017/8/28
 * Time: 9:22
 */
@Controller
@RequestMapping("/")
public class HomeController  {

    @RequestMapping(method = GET)
    public String home(){
        return "home";
    }
}
