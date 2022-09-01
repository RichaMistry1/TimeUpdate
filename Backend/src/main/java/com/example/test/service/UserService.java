package com.example.test.service;


import com.example.test.entity.User;
import com.example.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User getUser(int Id){
        return userRepository.findById(Id);
    }

    public User updateStart(User user){
        User userFromDB = userRepository.findById(user.getId());
        userFromDB.setStartTiming(LocalDateTime.now());
        return userRepository.save(userFromDB);
    }

    public User updateEnd(User user){
        User userFromDB = userRepository.findById(user.getId());
        if(userFromDB.getBreakStart() != null){
            userFromDB.setBreakEnd(LocalDateTime.now());
        }
        if(userFromDB.getLunchStart() != null){
            userFromDB.setLunchEnd(LocalDateTime.now());
        }
        userFromDB.setEndTiming(LocalDateTime.now());
        return userRepository.save(userFromDB);
    }

    public User updateBreakStart(User user){
        User userFromDB = userRepository.findById(user.getId());
        userFromDB.setBreakStart(LocalDateTime.now());
        return userRepository.save(userFromDB);
    }

    public User updateBreakEnd(User user){
        User userFromDB = userRepository.findById(user.getId());
        userFromDB.setBreakEnd(LocalDateTime.now());
        return userRepository.save(userFromDB);
    }

    public User updateLunchStart(User user){
        User userFromDB = userRepository.findById(user.getId());
        userFromDB.setLunchStart(LocalDateTime.now());
        return userRepository.save(userFromDB);
    }

    public User updateLunchEnd(User user){
        User userFromDB = userRepository.findById(user.getId());
        userFromDB.setLunchEnd(LocalDateTime.now());
        return userRepository.save(userFromDB);
    }

    public User saveNewUser(User user){
        //User user = new User(id, null, null, null, null, null, null);
        User userFromDB = userRepository.findById(user.getId());
        System.out.println(userFromDB);
        if(userFromDB != null){
            return userFromDB;
        }
        return userRepository.save(user);
    }


}
