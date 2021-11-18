package com.rudess.crud.example.repository;

import com.rudess.crud.example.entity.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Integer> {

}
