import java.util.List;
import java.util.Random;

public class RandomUtils {

  public static String choseStudent(List<String> studentList) {
    Random random = new Random();
    return studentList.get(random.nextInt(studentList.size()));
  }

  public static void main(String[] args) {
    List<String> studentList = List.of("Евгений Грицик", "Иван Ермол", "Влад Романенко",
        "Влад Скворцов", "Денис Доманчук");

    System.out.println(RandomUtils.choseStudent(studentList));
  }
}
