package springmvc.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import springmvc.springmvc.enums.HtmlTemplates;

import java.sql.Time;
import java.time.LocalDateTime;

@Controller
public class DemoController {
    //add mapping for "/hello"
    @GetMapping("/hello_backup")
    public String sayHello(Model model){
        model.addAttribute("currentDate", LocalDateTime.now());
        return HtmlTemplates.HELLO_BACKUP.getTemplate();
    }
}
