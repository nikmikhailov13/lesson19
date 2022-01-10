package zoo.animal;

import lombok.Getter;

@Getter
public abstract class Animal implements Comparable {

  private String color;
  private int age;

  public Animal(String color, int age) {
    this.color = color;
    this.age = age;
  }

  public abstract void voice();

  @Override
  public int compareTo(Object o) {

    var animal2 = (Animal) o;

    return age - animal2.getAge();
  }
}
