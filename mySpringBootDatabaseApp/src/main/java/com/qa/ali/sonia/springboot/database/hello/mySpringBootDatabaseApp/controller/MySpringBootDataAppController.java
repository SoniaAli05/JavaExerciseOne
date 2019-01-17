package com.qa.ali.sonia.springboot.database.hello.mySpringBootDatabaseApp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.ali.sonia.springboot.database.hello.mySpringBootDatabaseApp.exception.ResourceNotFoundException;
import com.qa.ali.sonia.springboot.database.hello.mySpringBootDatabaseApp.model.*;
import com.qa.ali.sonia.springboot.database.hello.mySpringBootDatabaseApp.repository.MySpringBootRepository;


@RestController
@RequestMapping("/api")
public class MySpringBootDataAppController {
	
	@Autowired
	MySpringBootRepository myRepository;
	
	//Method to create a person
	@PostMapping("/film")
	public MySpringBootDataModel createFilm(@Valid @RequestBody MySpringBootDataModel mSDM) {
		return myRepository.save(mSDM);
	}
	//Method to get a person
	@GetMapping("/film/{id}")
	public MySpringBootDataModel createPersonbyID(@PathVariable(value = "id")Long filmId) {
		return myRepository.findById(filmId).orElseThrow(()-> new ResourceNotFoundException("MySpringBootDataModel", "id",filmId));
	}
	//Method to get all people

	@GetMapping("/film")
	public List<MySpringBootDataModel>getAllFilm(){
		return myRepository.findAll();
	}
	//Method to update a person
	@PutMapping("/film/{id}")
	public MySpringBootDataModel update (@PathVariable(value = "id")Long FilmId, @Valid @RequestBody MySpringBootDataModel FilmDetails) {
		
		MySpringBootDataModel mSDM = myRepository.findById(FilmId).orElseThrow(()-> new ResourceNotFoundException("Film","id",FilmId));
		
		mSDM.setFilmTitle(FilmDetails.getFilmTitle());
		mSDM.setFilmDescription(FilmDetails.getFilmDescription());
		mSDM.setReleaseYear(FilmDetails.getReleaseYear());
		mSDM.setFilmLength(FilmDetails.getFilmLength());
		mSDM.setFilmRating(FilmDetails.getFilmRating());
		
		
		MySpringBootDataModel updateData = myRepository.save(mSDM);
		return updateData;
	}
	//method to remove a person
	@DeleteMapping("/film/{id}")
	public ResponseEntity<?> deleteFilm(@PathVariable(value = "id")Long filmId){
		MySpringBootDataModel mSDM = myRepository.findById(filmId).orElseThrow(()->new ResourceNotFoundException("Film","id",filmId));
		
		myRepository.delete(mSDM);
		return ResponseEntity.ok().build();

	}
	                                                                                                                                                                         
}
