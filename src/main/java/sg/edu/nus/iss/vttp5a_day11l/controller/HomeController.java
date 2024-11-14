package sg.edu.nus.iss.vttp5a_day11l.controller;

import org.slf4j.Logger;    //use slf4j
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // to annotate as a controller class.
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @ResponseBody // what is this? without this, when you access the endpoint will crash(?), give you error page basically
    // @RequestMapping(path="/log", method=RequestMethod.GET)// what is RequestMethod.GET? (any method post over internet is a GET method? but actually optional)
    @RequestMapping("/log")
    public String home() {

        logger.info("This is info msg");
        logger.warn("This is warning msg");
        logger.error("This is error msg");
        logger.debug("This is debug msg");
        logger.trace("This is trace msg");

        return "Log in HomeController called...";
        
    }

    @RequestMapping(path="/home", method=RequestMethod.GET)// what is RequestMethod.GET? (any method post over internet is a GET method? but actually optional)
    public String homePage() {

        return "home";
        
    }

    
}
