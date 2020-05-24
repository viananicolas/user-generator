package com.easyidentitygenerator.usergenerator.services.interfaces;

import com.easyidentitygenerator.usergenerator.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name= "users", url = "https://randomuser.me/api/?nat=br&inc=login,email")
@Service
public interface UserService {
    @GetMapping
    User getUser();
}
