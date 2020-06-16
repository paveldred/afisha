package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CinemaItem {
  private int id;
  private String cinemaName;
  private String cinemaPicture;
  private int cinemaGenre;
  private boolean isTomorrow;
}
