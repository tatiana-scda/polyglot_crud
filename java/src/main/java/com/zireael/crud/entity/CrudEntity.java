package com.zireael.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CrudEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;
}
