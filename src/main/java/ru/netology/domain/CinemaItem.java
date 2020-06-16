package ru.netology.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CinemaItem {
  private int id;
  private String cinemaName;
  private String cinemaPicture;
  private int cinemaGenre;
  private boolean isTomorrow;
}
