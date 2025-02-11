package com.taskmanager.saas.Repositories;

import com.taskmanager.saas.Entity.Plan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanRepository extends JpaRepository<Plan, Long> {
}