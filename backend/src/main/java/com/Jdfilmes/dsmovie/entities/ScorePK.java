package com.Jdfilmes.dsmovie.entities;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable

public class ScorePK implements Serializable{

	private static final long serialVersionUID = 1L;

@ManyToOne
@JoinColumn(name = "movie_id")
	private Movie movie;
	
@ManyToOne
@JoinColumn(name = "user_id")
	private User User;
	
	public ScorePK() {
		
		
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUser() {
		return User;
	}

	public void setUser(User user) {
		User = user;
	}
}
