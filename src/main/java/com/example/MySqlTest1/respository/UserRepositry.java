package com.example.MySqlTest1.respository;

import com.example.MySqlTest1.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositry extends JpaRepository<Users, Integer> {

}
