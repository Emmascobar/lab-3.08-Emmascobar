package com.ironhack.lab28.repository;

import com.ironhack.lab28.model.Association;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssociationRepository extends JpaRepository<Association, Integer> {
}