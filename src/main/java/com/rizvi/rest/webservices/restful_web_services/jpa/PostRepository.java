package com.rizvi.rest.webservices.restful_web_services.jpa;

import com.rizvi.rest.webservices.restful_web_services.user.Post;
import com.rizvi.rest.webservices.restful_web_services.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer> {

}
