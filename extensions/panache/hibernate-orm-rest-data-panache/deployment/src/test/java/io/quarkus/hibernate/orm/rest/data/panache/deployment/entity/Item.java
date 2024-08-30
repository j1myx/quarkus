package io.quarkus.hibernate.orm.rest.data.panache.deployment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@NamedQuery(name = "Item.containsInName", query = "from Item where name like CONCAT('%', CONCAT(:name, '%'))")
@JsonView(EntityView.AllFields.class)
public class Item extends AbstractItem<Long> {

}
