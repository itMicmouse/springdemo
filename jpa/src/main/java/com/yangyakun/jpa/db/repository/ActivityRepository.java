package com.yangyakun.jpa.db.repository;

import com.yangyakun.jpa.db.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {
}