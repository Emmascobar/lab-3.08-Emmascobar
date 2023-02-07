package com.ironhack.lab28.repository;

import com.ironhack.lab28.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}