package com.task_tracker.dev.env.repositories;

import com.task_tracker.dev.env.enitities.TaskStateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskStateRepository extends JpaRepository<TaskStateEntity, Long> {
}
