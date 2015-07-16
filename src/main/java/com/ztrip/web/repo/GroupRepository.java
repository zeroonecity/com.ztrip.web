package com.ztrip.web.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.ztrip.web.domain.Group;

public interface GroupRepository extends CrudRepository<Group, Long> {
	Page<Group> findAll(Pageable pageable);

}
