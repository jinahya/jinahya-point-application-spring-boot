package com.github.jinahya.data.jpa.repository;

import io.github.jinahya.point.server.persistence.mapped.__MappedPointEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PointRepository<T extends __MappedPointEntity>
        extends JpaRepository<T, Long>,
                JpaSpecificationExecutor<T> {
}
