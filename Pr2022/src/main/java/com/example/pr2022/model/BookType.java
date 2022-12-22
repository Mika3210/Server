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
@Table (name = "type_of_book")
public class BookType {
    @Id
    @Column(name = "id_book_type", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBookType;

    @Column(name = "type_name", nullable=false)
    private String typeName;
}
