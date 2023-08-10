package com.systemplant.cake_web_system;

import com.systemplant.cake_web_system.Entity.User;
import com.systemplant.cake_web_system.repo.cake_management.UserRepo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CustomerRepositoryTests {

    @Autowired
    private UserRepo userRepo;

    @Test
    @Order(1)
    @Rollback(value = false)
    public  void saveUserTest(){
        User user = User.builder()
                .fullname("seetal shakya")
                .email("hehe@gmail.com")
                .username("hehe")
                .password("hehe121")
                .build();
        userRepo.save(user);
        Assertions.assertThat(user.getId()).isGreaterThan(1);
    }
}
