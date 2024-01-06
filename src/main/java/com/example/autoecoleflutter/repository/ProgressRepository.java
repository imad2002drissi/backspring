package com.example.autoecoleflutter.repository;

import com.example.autoecoleflutter.entity.Progress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProgressRepository extends JpaRepository<Progress, Integer> {
    Optional<Progress> findByUserId(int idUser );
}
