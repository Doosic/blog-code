package com.doosic.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RoleType {

  // 현재 Blog 포스팅에서는 MENU 의 기능을 필요로 하지 않음
  // TREE("MENU"),

  AUTH("AUTH");


  private final String status;
}
