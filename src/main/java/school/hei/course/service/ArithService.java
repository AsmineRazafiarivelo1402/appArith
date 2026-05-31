package school.hei.course.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.course.validator.ArithValidator;

@AllArgsConstructor
@Service
public class ArithService {

  private final ArithValidator validator;

  public Long add(Long a, Long b) {
    validator.validateAddition(a, b);
    return a + b;
  }

  public Long minus(Long a, Long b) {
    validator.validateSubtraction(a, b);
    return a - b;
  }

  public Long multiply(Long a, Long b) {
    validator.validateMultiplication(a, b);
    return a * b;
  }

  public Long divide(Long a, Long b) {
    validator.validateDivision(a, b);
    return a / b;
  }
}
