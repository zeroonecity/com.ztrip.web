package com.ztrip.web.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.ztrip.web.domain.Permission;

public interface PermissionRepository extends CrudRepository<Permission, Long> {
	Page<Permission> findAll(Pageable pageable);
}
