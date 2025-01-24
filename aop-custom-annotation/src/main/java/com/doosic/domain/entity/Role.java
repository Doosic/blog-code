package com.doosic.domain.entity;

import com.doosic.domain.enums.RoleType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    private Long regUserId;

    private String authName;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;
}
