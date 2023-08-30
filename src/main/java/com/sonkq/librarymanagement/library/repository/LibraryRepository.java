package com.sonkq.librarymanagement.library.repository;

import com.sonkq.librarymanagement.library.model.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {
}
