package com.example.examenpratique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.examenpratique.entity.Cinema;

@Repository
    public interface CinemaRepo extends JpaRepository<Cinema,Long> {

}
