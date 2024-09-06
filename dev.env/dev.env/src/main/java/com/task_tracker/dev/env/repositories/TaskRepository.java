package com.task_tracker.dev.env.repositories;

import com.task_tracker.dev.env.enitities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Long> {
}
