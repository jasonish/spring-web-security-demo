package ca.unx.spring.websecuritydemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DefaultController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        return "this is the home page";
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @RequestMapping(value = "/adminOnly")
    @ResponseBody
    public String adminOnly() {
        return "this message for admins only";
    }

}
