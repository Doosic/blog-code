package com.doosic.domain.entity;

import com.doosic.domain.enums.AdminStatusCode;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "admin")
public class Admin{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long roleId;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private AdminStatusCode status;
}
