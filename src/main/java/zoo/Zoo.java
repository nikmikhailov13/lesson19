package zoo;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import zoo.animal.Animal;
import zoo.animal.ZooException;

@Getter
public class Zoo {

  private List<Animal> animals;

  public Zoo() {
    animals = new ArrayList<>();
  }

  public void addNewAnimal(Animal animal) throws ZooException {
    if(animals.contains(animal)){
      throw new ZooException("already in zoo");
    }
    animals.add(animal);

  }

  public void showAnimals() {
    for (Animal animal : animals) {
      System.out.println(animal);
    }
  }
}
