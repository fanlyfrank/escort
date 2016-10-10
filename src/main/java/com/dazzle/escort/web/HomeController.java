package com.dazzle.escort.web;


import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dazzle.escort.facility.model.User;

/**
 * @author trgoofi
 */

@Controller
public class HomeController {


	@Autowired
	private MongoTemplate mongoTemplate;
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody String home(User user) {
    		
    	user.setCreatedAt(new Date());
    	user.setUpdatedAt(new Date());
    	
    	mongoTemplate.save(user);
    	
        return "You are home. User insert to Users on mongodb!";
    }

}
