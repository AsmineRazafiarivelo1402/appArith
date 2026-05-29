package school.hei.course.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ArithService {
  public Long add(Long a, Long b) {
    if (a >= 0 && b >= 0) {
      return a + b;
    } else {
      throw new RuntimeException("Can not add negative number");
    }
  }

  public Long minus(Long a, Long b) {
    if (a < b && b > 0) {
      throw new RuntimeException("a should be greater than b");
    } else if (a < b && b < 0) {
      throw new RuntimeException("a and b should be positive");
    } else if (a < 0 && b < 0) {
      throw new RuntimeException("a and b should be positive");
    } else {
      return (a - b);
    }
  }

  public Long multiply(Long a, Long b) {
    if (a < 0 && b < 0) {
      throw new RuntimeException("a and b should be positive");
    } else {
      return (a * b);
    }
  }

  public Long divide(Long a, Long b) {
    if (a < 0 && b < 0) {
      throw new RuntimeException("a and b should be positive");
    }
    if (a < b) {
      throw new RuntimeException("a should be greater than be");
    } else {
      return (a / b);
    }
  }
}
