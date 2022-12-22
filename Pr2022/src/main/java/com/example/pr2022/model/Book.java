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
public class Book {
    @Id
    @Column(name = "id_book", nullable=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "book_name", nullable=false)
    private String bookName;

    @JoinColumn(name = "book_type", referencedColumnName = "id_book_type")
    @ManyToOne(targetEntity = BookType.class, fetch = FetchType.LAZY)
    @NotNull
    @JsonIgnore
    private BookType bookType;

    @Column(name = "book_type", insertable = false, updatable = false)
    private Integer bookTypeId;

    @Column(name = "section_name", nullable=false)
    private String sectionName;

    @JoinColumn(name = "author", referencedColumnName = "idteacher")
    @ManyToOne(targetEntity = Teacher.class, fetch = FetchType.LAZY)
    @NotNull
    @JsonIgnore
    private Teacher author;

    @Column(name = "author", insertable = false, updatable = false)
    private Integer authorId;

        @Column(name = "publisher", nullable=false)
    private String publisher;

    @Column(name = "publish_year", nullable=false)
    private Integer publishYear;

    @Column(name = "publish_city", nullable=false)
    private String publishCity;
}
