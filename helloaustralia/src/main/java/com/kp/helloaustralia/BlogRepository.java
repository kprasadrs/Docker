package com.kp.helloaustralia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
	List<Blog> findByTitleContainingOrContentContaining(String text, String textAgain);
	
	Blog findById(int id);

}
