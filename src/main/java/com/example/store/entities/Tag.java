package com.example.store.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tags")
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Tag {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
