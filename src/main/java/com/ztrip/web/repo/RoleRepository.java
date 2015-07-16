package com.ztrip.web.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.ztrip.web.domain.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Page<Role> findAll(Pageable pageable);

}
