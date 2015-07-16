package com.ztrip.web.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.ztrip.web.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
	Page<User> findAll(Pageable pageable);
}
