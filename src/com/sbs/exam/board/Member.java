package com.sbs.exam.board;

public class Member {
  int id;
  String loginId;
  String loginPw;

  Member(int id, String loginId, String loginPw) {
    this.id = id;
    this.loginId = loginId;
    this.loginPw = loginPw;
  }

  @Override
  public String toString() {
    return String.format("{id: %d, loginId: \"%s\", loginPw: \"%s\"}", id, loginId, loginPw);
  }
}
