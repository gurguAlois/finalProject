package com.sda.auction.repository;

import com.sda.auction.model.Role;
import com.sda.auction.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

	Role findByRole(String role);
}
