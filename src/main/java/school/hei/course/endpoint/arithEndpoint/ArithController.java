package school.hei.course.endpoint.arithEndpoint;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.course.service.ArithService;

@AllArgsConstructor
@RestController
public class ArithController {
  private final ArithService arithService;

  //    avec 4 endpoints : /add, /minus, (/soustrac), /multiply, /divide

  @GetMapping("/add")
  public int add(int a, int b) {
    return arithService.add(a, b);
  }

  @GetMapping("/minus")
  public int minus(int a, int b) {
    return arithService.minus(a, b);
  }

  @GetMapping("/multiply")
  public int multiply(int a, int b) {
    return arithService.multiply(a, b);
  }

  @GetMapping("/divide")
  public int divide(int a, int b) {
    return arithService.multiply(a, b);
  }
}
