package com.demo.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
@AllArgsConstructor
@Getter
@Setter
public class CesBiweeklyPkId implements Serializable {
    @Column(name = "client")
    private String client;
    @Column(name = "project")
    private String project;

}
