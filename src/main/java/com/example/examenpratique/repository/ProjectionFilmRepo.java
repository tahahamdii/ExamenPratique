package com.example.examenpratique.repository;

import com.example.examenpratique.entity.ProjectionFilm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectionFilmRepo extends JpaRepository<ProjectionFilm,Long> {
}
