package com.doosic.domain.repository;

import com.doosic.domain.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Auth, Integer> {
    
}
