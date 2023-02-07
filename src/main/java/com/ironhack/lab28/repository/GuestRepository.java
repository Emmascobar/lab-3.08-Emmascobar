package com.ironhack.lab28.repository;

import com.ironhack.lab28.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}