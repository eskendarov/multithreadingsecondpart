package ru.eskendarov.ea;

import lombok.Getter;

@Getter
public abstract class Stage {
  
  int length;
  String description;
  public abstract void go(Car c);
}
