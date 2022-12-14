package com.spike.controller;

import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spike.entity.Tutorial;
import com.spike.repository.TutorialRepository;

@RestController
@RequestMapping("/v1")
public class TutorialController {
	@Autowired
	TutorialRepository tutorialRepository;

//	@PostMapping("/tutorials")
//	public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
//		Tutorial _tutorial = tutorialRepository
//				.save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), true, generateTrackerId()));
//		return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
//	}

	@GetMapping("/tutorials/{id}")
	public ResponseEntity<Optional<Tutorial>> getTutorialById(@PathVariable("id") long id) {
		Optional<Tutorial> tutorial = tutorialRepository.findById(id);
		return new ResponseEntity<Optional<Tutorial>>(tutorial, HttpStatus.OK);
	}

	private String generateTrackerId() {
		String trackId = "";
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(9999);
		String randomValue = String.format("%04d", randomNumber);

		trackId = randomValue;
		return trackId;
	}
}
