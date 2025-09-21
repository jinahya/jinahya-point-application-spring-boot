package com.github.jinahya.data.jpa.entity;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.util.ReflectionUtils;

import java.time.Instant;

public interface _MappedPointEntity {

    @CreatedDate
    default Instant getCreatedAt() {
        final var field = ReflectionUtils.findField(
                getClass(),
                _MappedPointEntityConstants.ATTRIBUTE_NAME_CREATED_AT,
                Instant.class
        );
        if (field == null) {
            return null;
        }
        ReflectionUtils.makeAccessible(field);
        return (Instant) ReflectionUtils.getField(field, this);
    }

    @LastModifiedBy
    default Instant getUpdatedAt() {
        final var field = ReflectionUtils.findField(
                getClass(),
                _MappedPointEntityConstants.ATTRIBUTE_NAME_UPDATED_AT,
                Instant.class
        );
        if (field == null) {
            return null;
        }
        ReflectionUtils.makeAccessible(field);
        return (Instant) ReflectionUtils.getField(field, this);
    }

    @CreatedBy
    default Instant getCreatedBy() {
        final var field = ReflectionUtils.findField(
                getClass(),
                _MappedPointEntityConstants.ATTRIBUTE_NAME_CREATED_BY,
                Instant.class
        );
        if (field == null) {
            return null;
        }
        ReflectionUtils.makeAccessible(field);
        return (Instant) ReflectionUtils.getField(field, this);
    }

    @LastModifiedBy
    default Instant getUpdatedBy() {
        final var field = ReflectionUtils.findField(
                getClass(),
                _MappedPointEntityConstants.ATTRIBUTE_NAME_UPDATED_BY,
                Instant.class
        );
        if (field == null) {
            return null;
        }
        ReflectionUtils.makeAccessible(field);
        return (Instant) ReflectionUtils.getField(field, this);
    }
}
