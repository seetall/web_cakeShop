package com.systemplant.cake_web_system.Entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "plant")
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "namep", nullable = false)
    private String namep;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id",nullable = true)
    private Category category;

    @Column (name = "description",length = 600, nullable = false)
    private String description;

    @Column(name = "image")
    private String image;

//    @Transient
//    private String imageBase64;
}
