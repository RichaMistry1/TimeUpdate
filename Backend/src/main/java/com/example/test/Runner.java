package com.example.test;

import com.example.test.entity.User;
import com.example.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
            List<User> users = new ArrayList<>();
            LocalDateTime localDateTime = LocalDateTime.now();
            User u1 = new User(1, null, null, null, null, null, null);
            users.add(u1);
            User u2 = new User(2, null, null, null,null, null, null);
            users.add(u2);
            userRepository.saveAll(users);
    }
}
