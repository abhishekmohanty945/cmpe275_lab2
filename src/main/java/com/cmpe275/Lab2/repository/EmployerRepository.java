package com.cmpe275.Lab2.repository;

import com.cmpe275.Lab2.models.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployerRepository extends JpaRepository<Employer, Long> {

}
