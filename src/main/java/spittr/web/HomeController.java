package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/28
 * Time: 9:22
 */
@Controller
public class HomeController  {

    @RequestMapping(value = "/", method = GET)
    public String home(){
        return "home";
    }
}
