package com.Jdfilmes.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jdfilmes.dsmovie.entities.Score;
import com.Jdfilmes.dsmovie.entities.ScorePK;

public interface  ScoreRepository extends JpaRepository<Score, ScorePK> {

}
