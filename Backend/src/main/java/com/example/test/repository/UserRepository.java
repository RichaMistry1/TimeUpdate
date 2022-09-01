package com.example.test.repository;

import com.example.test.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("http://localhost:4200")
public interface UserRepository extends JpaRepository<User, Integer> {
    User findById(int Id);
}
