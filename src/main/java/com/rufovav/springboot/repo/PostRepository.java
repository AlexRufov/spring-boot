package com.rufovav.springboot.repo;

import com.rufovav.springboot.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
