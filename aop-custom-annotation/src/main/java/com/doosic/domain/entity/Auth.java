package com.doosic.domain.entity;

import com.doosic.domain.enums.MenuTypeCode;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "auth")
public class Auth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long authParent;

    private String authName;

    private Integer authLevel;

    private Integer authOrder;

    @Enumerated(EnumType.STRING)
    private MenuTypeCode menuTypeCode;

}
