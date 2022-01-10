package zoo;

import java.util.List;
import java.util.stream.Collectors;
import zoo.animal.Animal;
import zoo.animal.Flamingo;
import zoo.animal.ZooException;

public class Main {

  public static void main(String[] args) {
    var flamingo1 = new Flamingo("Pink", 4, 2, 2);
    var flamingo2 = new Flamingo("Black", 4, 1, 2);
    var zoo = new Zoo();

    try {
      zoo.addNewAnimal(flamingo1);
      zoo.addNewAnimal(flamingo1);
      zoo.addNewAnimal(flamingo2);
      zoo.showAnimals();
    } catch (ZooException e) {
      e.printStackTrace();
    } finally {
      System.out.println("Falmingo equal? Answer: " + flamingo1.equals(flamingo2));
    }

    List<Animal> animals = zoo.getAnimals();

    List<Flamingo> flamingos = animals.stream()
        .map(animal -> (Flamingo) animal)
        .filter(flamingo -> flamingo.getLegs() > 1)
        .sorted((f1, f2) -> f1.getAge() - f1.getAge())
        .collect(Collectors.toList());

    flamingos.forEach(System.out::println);
  }
}
