package com.sbs.exam.board;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor
@ToString
@NoArgsConstructor
@Data
public class Article {
  int id;
  String title;
  String body;

}
