package com.hack23.riksdagsmonitor.data.service;

import com.hack23.riksdagsmonitor.data.entity.User;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, UUID> {

    User findByUsername(String username);
}