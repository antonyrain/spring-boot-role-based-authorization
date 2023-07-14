package com.antonyrain.springauth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.antonyrain.springauth.model.EnumRole;
import com.antonyrain.springauth.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(EnumRole name);
};