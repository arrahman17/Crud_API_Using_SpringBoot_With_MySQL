package com.example.MySqlTest1.resource;

import com.example.MySqlTest1.model.Users;
import com.example.MySqlTest1.respository.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UserResource {
    @Autowired
    UserRepositry userRepositry;

    @GetMapping(value = "all")
    public List<Users> getAll(){
       return userRepositry.findAll();
    }

    @PostMapping(value = "/load")
    public List<Users> persist(@RequestBody final Users users) {
        userRepositry.save(users);
        return  userRepositry.findAll();
    }
}
