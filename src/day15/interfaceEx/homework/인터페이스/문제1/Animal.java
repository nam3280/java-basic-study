package day15.interfaceEx.homework.인터페이스.문제1;

public abstract class Animal {
  protected int speed;
  private double distance;

  Animal(int speed){
    this.speed = speed;
  }

  abstract void run(int hours);

  public void setDistance(double distance) {
    this.distance = distance;
  }

  public double getDistance() {
    return distance;
  }
}
