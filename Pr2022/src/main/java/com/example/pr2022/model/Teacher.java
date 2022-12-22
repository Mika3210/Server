package com.example.pr2022.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@Accessors
@NoArgsConstructor
@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idteacher;

    @Column(name = "familiya", nullable=false)
    private String familiya;

    @Column(name = "imya", nullable=false)
    private String imya;

    @Column(name = "otchestvo", nullable=false)
    private String otchestvo;

    @Column(name = "Vyz", nullable=false)
    private String vyz;


    @JoinColumn(name = "titul", referencedColumnName = "idTitul")
    @ManyToOne(targetEntity = Titul.class, fetch = FetchType.LAZY)
    @NotNull
    @JsonIgnore
    private Titul titul;

    @Column(name = "titul", insertable = false, updatable = false)
    private Integer titulId;
}
