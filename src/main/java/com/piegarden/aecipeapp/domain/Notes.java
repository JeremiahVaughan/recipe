package com.piegarden.aecipeapp.domain;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne //dont want to cascade, if we delete the note, we dont want that to delete the recipe
    private Recipe recipe;

    @Lob //Clob for characters large objects or Blob for binary large objects. This will allow the recipe notes to consist of much
    // more than 255 characters (default value for most databases).
    private String recipeNotes;

}
