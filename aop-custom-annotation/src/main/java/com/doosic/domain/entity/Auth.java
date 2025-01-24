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
    private String authCd;

    private String authParent;

    private String authName;

    @Enumerated(EnumType.STRING)
    private MenuTypeCode menuTypeCode;

}
