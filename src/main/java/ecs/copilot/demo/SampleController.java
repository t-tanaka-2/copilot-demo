package ecs.copilot.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {

    private final String appName;

    public SampleController(@Value("${app.name:no name}") String appName) {
        this.appName = appName;
    }

    @GetMapping("/sample")
    public ModelAndView get() {
        var mav = new ModelAndView("index");
        mav.addObject("appName", appName);
        return mav;
    }
}
