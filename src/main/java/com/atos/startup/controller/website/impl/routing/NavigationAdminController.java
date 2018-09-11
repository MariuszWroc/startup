package com.atos.startup.controller.website.impl.routing;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author mariusz
 */
@Controller
@RequestMapping(value = {"/admin"})
public class NavigationAdminController {
    
    /* This method will list all existing tests.
     */
	@Secured(value = {"ROLE_ADMIN"})
    @RequestMapping(value = {"/panel"}, method = RequestMethod.GET)
    public String getAdminPanel() {
        return "admin/menu";
    }
	

    
}
