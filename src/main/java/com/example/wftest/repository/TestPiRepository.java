package com.example.wftest.repository;

import com.example.wftest.entity.TestPi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestPiRepository extends JpaRepository<TestPi, Integer> {

}