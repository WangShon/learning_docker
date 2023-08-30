package com.sonkq.librarymanagement.library.repository;

import com.sonkq.librarymanagement.library.model.NewsPaper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsPaperRepository extends JpaRepository<NewsPaper, Long> {
}
