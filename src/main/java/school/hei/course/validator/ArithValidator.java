package school.hei.course.validator;

import org.springframework.stereotype.Component;

@Component
public class ArithValidator {

  public void validateAddition(Long a, Long b) {
    if (a < 0 || b < 0) {
      throw new RuntimeException("Can not add negative number");
    }
  }

  public void validateSubtraction(Long a, Long b) {
    if (a < b && b > 0) {
      throw new RuntimeException("a should be greater than b");
    } else if (a < b && b < 0) {
      throw new RuntimeException("a and b should be positive");
    } else if (a < 0 && b < 0) {
      throw new RuntimeException("a and b should be positive");
    }
  }

  public void validateMultiplication(Long a, Long b) {
    if (a < 0 || b < 0) {
      throw new RuntimeException("a and b should be positive");
    }
  }

  public void validateDivision(Long a, Long b) {
    if (a < 0 || b < 0) {
      throw new RuntimeException("a and b should be positive");
    }
    if (a < b) {
      throw new RuntimeException("a should be greater than b");
    }
    if (b == 0) {
      throw new RuntimeException("Cannot divide by zero");
    }
  }
}
