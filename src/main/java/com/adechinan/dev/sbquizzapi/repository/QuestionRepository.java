package com.adechinan.dev.sbquizzapi.repository;

import com.adechinan.dev.sbquizzapi.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
