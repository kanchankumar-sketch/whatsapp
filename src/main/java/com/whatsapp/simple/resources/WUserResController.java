package com.whatsapp.simple.resources;

import com.whatsapp.simple.model.WUser;
import com.whatsapp.simple.services.WUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/whatsapp/api/v1/user")
public class WUserResController {
    @Autowired
    private WUserService userService;

    @PostMapping
    public WUser saveUser(@RequestBody WUser user) {
        return userService.save(user);
    }
    @GetMapping
    public List getUsers() {
        return userService.getUsers();
    }
    @DeleteMapping
    public void deleteAllUser() {
        userService.deleteAll();
    }
}
