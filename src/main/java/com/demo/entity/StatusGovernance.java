package com.demo.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "governance_mbr_qbr")
public class StatusGovernance implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int govId;
    private LocalDate janMbr;
    private LocalDate febMbr;
    private LocalDate marMbr;

    private String remarks;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="project_unique_id", referencedColumnName = "id", unique = true)

    private CesBiweekly cesBiweekly;

}
