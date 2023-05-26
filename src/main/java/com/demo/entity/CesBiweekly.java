package com.demo.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="biweekly")
public class CesBiweekly implements Serializable {

    @EmbeddedId
    private CesBiweeklyPkId cesBiweeklyPkId;

    private Integer nearshore;

    @Column(name = "id", unique = true)
    private int projectUniqueId;

    @OneToOne(mappedBy = "cesBiweekly",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private StatusGovernance statusGovernance;

    private String goGreenPlan;

}
