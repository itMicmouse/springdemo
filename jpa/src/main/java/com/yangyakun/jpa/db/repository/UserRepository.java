package com.yangyakun.jpa.db.repository;


import com.yangyakun.jpa.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByNickName(String nickName);
}