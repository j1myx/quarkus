package io.quarkus.hibernate.orm.rest.data.panache.deployment.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonView;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@MappedSuperclass
public abstract class AbstractEntity<IdType extends Number> extends PanacheEntityBase {

    @Id
    @GeneratedValue
    @JsonView(EntityView.AllFields.class)
    private IdType id;

    public IdType getId() {
        return id;
    }

    public void setId(IdType id) {
        this.id = id;
    }
}
