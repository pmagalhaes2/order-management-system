package com.example.order_management_system.config;

import com.example.order_management_system.entities.User;
import com.example.order_management_system.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(1L, "Maria", "maria@email.com", "11978456213", "abc123", null);
        User u2 = new User(2L, "Alex Green", "alex@gmail.com", "977777777", "123456", null);

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
