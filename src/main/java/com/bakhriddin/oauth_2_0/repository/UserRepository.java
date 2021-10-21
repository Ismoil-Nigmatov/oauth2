package com.bakhriddin.oauth_2_0.repository;

import com.bakhriddin.oauth_2_0.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "user")
public interface UserRepository extends JpaRepository<User, Integer> {

}
