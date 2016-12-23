package tutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hivisonmoura on 2016-12-23.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index(){
        return "index.html";
    }
}
