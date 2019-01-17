package com.qa.ali.sonia.springboot.database.hello.mySpringBootDatabaseApp.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "film")
@EntityListeners(AuditingEntityListener.class)
public class MySpringBootDataModel implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="film_id")private Long filmId;
	@NotBlank
	@Column(name="title")private String filmTitle;
	@NotBlank
	@Column(name="description")private String filmDescription;
	@NotBlank
	@Column(name="release_year")private String releaseYear;
	@NotBlank
	@Column(name="length")private String filmLength;
	@NotBlank
	@Column(name="rating")private String filmRating;
		
	public MySpringBootDataModel(String filmTitle, String filmDescription, String releaseYear, String filmLength, String filmRating) {
		this.filmTitle = filmTitle;
		this.filmDescription = filmDescription;
		this.releaseYear = releaseYear;
		this.filmLength = filmLength;
		this.filmRating = filmRating;
	}
public MySpringBootDataModel(){
	
}
	
	public Long getFilmId() {
		return filmId;
	}


	public String getFilmTitle() {
		return filmTitle;
	}


	public String getFilmDescription() {
		return filmDescription;
	}


	public String getReleaseYear() {
		return releaseYear;
	}


	public String getFilmLength() {
		return filmLength;
	}


	public String getFilmRating() {
		return filmRating;
	}


	public void setFilmId(Long filmId) {
		this.filmId = filmId;
	}


	public void setFilmTitle(String filmTitle) {
		this.filmTitle = filmTitle;
	}


	public void setFilmDescription(String filmDescription) {
		this.filmDescription = filmDescription;
	}


	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}


	public void setFilmLength(String filmLength) {
		this.filmLength = filmLength;
	}


	public void setFilmRating(String filmRating) {
		this.filmRating = filmRating;
	}
}