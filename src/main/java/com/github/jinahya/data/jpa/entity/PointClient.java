package com.github.jinahya.data.jpa.entity;

import io.github.jinahya.point.server.persistence.mapped._MappedPointClient;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = PointClient.TABLE_NAME)
public class PointClient extends _MappedPointClient implements _MappedPointEntity {

    public static final String TABLE_NAME = "point_client";

    // --------------------------------------------------------------------------------------------------------- id / id
    public static final String COLUMN_NAME_ID = "id";

    public static final String ATTRIBUTE_NAME_ID = "id";

    // -----------------------------------------------------------------------------------------------------------------
    @NotNull
    @Basic(optional = false)
    @Column(name = COLUMN_NAME_ID, nullable = false, insertable = true, updatable = false, unique = true)
    private String id;
}
