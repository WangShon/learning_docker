package com.sonkq.librarymanagement.library.repository;

import com.sonkq.librarymanagement.library.model.Magazine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagazineRepository extends JpaRepository<Magazine, Long> {
}
