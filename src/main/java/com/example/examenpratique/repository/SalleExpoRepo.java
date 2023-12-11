package com.example.examenpratique.repository;

import com.example.examenpratique.entity.SalleExpo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.beans.JavaBean;

@Repository
public interface SalleExpoRepo extends JpaRepository<SalleExpo,Long> {
}
