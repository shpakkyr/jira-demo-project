package com.task_tracker.dev.env.repositories;

import com.task_tracker.dev.env.enitities.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository takes 2 parameters: Entity + ID of entity
public interface ProjectRepository extends JpaRepository<ProjectEntity, Long> {
}
