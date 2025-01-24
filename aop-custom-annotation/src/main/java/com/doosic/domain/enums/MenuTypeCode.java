package com.doosic.domain.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MenuTypeCode {

  // 현재 Blog 포스팅에서는 TREE 의 기능을 필요로 하지 않음
  // TREE("TREE"),

  ITEM("ITEM");

  private final String status;
}
