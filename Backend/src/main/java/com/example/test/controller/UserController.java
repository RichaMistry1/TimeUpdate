package com.example.test.controller;


import com.example.test.entity.User;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("http://localhost:4200")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping(value = "/finduser/{Id}")
    User findUser(@PathVariable int Id){
        return userService.getUser(Id);
    }

    // shift start time
    @PutMapping(value = "/updatestarttime")
    User updateStartTime(@RequestBody User user){
        return userService.updateStart(user);
    }

    // shift end time
    @PutMapping(value = "/updateendtime")
    User updateEndTime(@RequestBody User user){
        return userService.updateEnd(user);
    }

    //
    @PutMapping(value = "/updatebreakstart")
    User updateBreakS(@RequestBody User user){
        return userService.updateBreakStart(user);
    }

    @PutMapping(value = "/updatebreakend")
    User updateBreakE(@RequestBody User user){
        return userService.updateBreakEnd(user);
    }

    @PutMapping(value = "/updatelunchstart")
    User updateLunchS(@RequestBody User user){
        return userService.updateLunchStart(user);
    }

    @PutMapping(value = "/updatelunchend")
    User updateLunchE(@RequestBody User user){
        return userService.updateLunchEnd(user);
    }

    @PostMapping(value = "/saveuser")
    User saveUser(@RequestBody User user){
        return userService.saveNewUser(user);
    }

}
