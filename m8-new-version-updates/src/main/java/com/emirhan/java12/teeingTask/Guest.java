package com.emirhan.java12.teeingTask;

class Guest {
  private String name;
  private boolean participating;
  private Integer participantsNumber;

  public Guest(String name, boolean participating,
   Integer participantsNumber) {
    this.name = name;
    this.participating = participating;
    this.participantsNumber = participantsNumber;
  }

  public String getName() {
    return name;
  }

  public boolean isParticipating() {
    return participating;
  }

  public Integer getParticipantsNumber() {
    return participantsNumber;
  }
}