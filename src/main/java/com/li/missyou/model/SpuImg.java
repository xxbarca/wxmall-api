package com.li.missyou.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class SpuImg extends BaseEntity {
    @Id
    private Long id;

    private String img;

    private Long spuId;
}
