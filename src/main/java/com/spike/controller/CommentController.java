package com.spike.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spike.entity.Comment;
import com.spike.entity.Tutorial;
import com.spike.repository.CommentRepository;
import com.spike.repository.TutorialRepository;

@RestController
@RequestMapping("/{version}")
public class CommentController {
	@Autowired
	private TutorialRepository tutorialRepository;
	@Autowired
	private CommentRepository commentRepository;

	@PostMapping("/tutorials/{tutorialId}/comments")
	public ResponseEntity<Comment> createComment(@PathVariable(value = "tutorialId") String tutorialId,
			@RequestBody Comment commentRequest) {
		Tutorial tutorial = tutorialRepository.findByTrack(tutorialId);
		tutorial.setTitle(tutorial.getTitle() + "--" + "updated");
		Tutorial tutorial2 = tutorialRepository.save(tutorial);
		commentRequest.setTutorial(tutorial2);
		Comment comment = commentRepository.save(commentRequest);
		return new ResponseEntity<>(comment, HttpStatus.CREATED);
	}

	@GetMapping("/comments/{id}")
	public ResponseEntity<List<Comment>> getCommentsByTutorialId(@PathVariable(value = "id") String track) {
		Tutorial tutorial = tutorialRepository.findByTrack(track);
		List<Comment> comment = commentRepository.findByTutorialId(tutorial.getId());
		return new ResponseEntity<>(comment, HttpStatus.OK);
	}
}
