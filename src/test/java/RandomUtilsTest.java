import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomUtilsTest {

  @Test
  public void shouldContainResult() {
    //Given
    List<String> studentList = List.of("Евгений Грицик", "Иван Ермол", "Влад Романенко",
        "Влад Скворцов", "Денис Доманчук");

    //When
    String student = RandomUtils.choseStudent(studentList);

    //Then
    Assertions.assertThat(student).isIn(studentList);
  }
}
