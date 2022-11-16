package com.gitpher.prac4brains;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudRepository extends JpaRepository<Company, Long> {
}
