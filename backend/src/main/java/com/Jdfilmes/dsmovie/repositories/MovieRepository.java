package com.Jdfilmes.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jdfilmes.dsmovie.entities.Movie;

public interface  MovieRepository extends JpaRepository<Movie, Long> {

}
