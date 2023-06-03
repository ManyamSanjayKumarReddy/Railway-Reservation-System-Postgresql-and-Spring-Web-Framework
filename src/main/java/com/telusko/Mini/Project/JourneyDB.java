package com.telusko.Mini.Project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyDB extends JpaRepository<JourneyDetails, Integer> {

}