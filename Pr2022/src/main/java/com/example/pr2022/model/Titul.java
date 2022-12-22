package com.example.pr2022.model;

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
@Table (name = "titul")
public class Titul {
    @Id
    @Column(name = "idtitul", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTitul;

    @Column(name = "name_titul", nullable=false)
    private String nameTitul;
}
