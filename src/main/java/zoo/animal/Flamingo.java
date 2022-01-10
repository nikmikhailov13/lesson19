package zoo.animal;

import lombok.Getter;

@Getter
public class Flamingo extends Animal implements Flyable, Swimmable, Walkable {

  private int legs;
  private int wings;

  public Flamingo(String color, int age, int legs, int wings) {
    super(color, age);
    this.legs = legs;
    this.wings = wings;
  }

  @Override
  public void voice() {
    System.out.println("I am flamingo!");
  }

  @Override
  public void fly() {
    System.out.println("I have " + wings + " wings");
  }

  @Override
  public void swim() {
    System.out.println("I have " + legs + " legs");
  }

  @Override
  public void walk() {
    System.out.println("I have " + legs + " legs");
  }

  @Override
  public String toString() {
    return "Flamingo{" +
        "legs=" + legs +
        ", wings=" + wings +
        ", age=" + super.getAge() +
        ", color=" + super.getColor() +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Flamingo)) {
      return false;
    }
    Flamingo flamingo = (Flamingo) o;
    return legs == flamingo.legs && wings == flamingo.wings && super.getAge() == flamingo.getAge();
  }

  @Override
  public int hashCode() {

    return 29 * legs + 31 * wings;
  }

}
