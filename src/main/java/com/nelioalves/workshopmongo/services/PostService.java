package com.nelioalves.workshopmongo.services;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.workshopmongo.domain.Post;
import com.nelioalves.workshopmongo.repository.PostRepository;
import com.nelioalves.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		try {
			Optional<Post> post = repo.findById(id);
			return post.get();
		}
		catch (NoSuchElementException e) {
			throw new ObjectNotFoundException("Objeto não encontrado para esse ID");
		 }
	}
}
