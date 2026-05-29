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
  public Long add(Long a, Long b) {
    return arithService.add(a, b);
  }

  @GetMapping("/minus")
  public Long minus(Long a, Long b) {
    return arithService.minus(a, b);
  }

  @GetMapping("/multiply")
  public Long multiply(Long a, Long b) {
    return arithService.multiply(a, b);
  }

  @GetMapping("/divide")
  public Long divide(Long a, Long b) {
    return arithService.divide(a, b);
  }
}
