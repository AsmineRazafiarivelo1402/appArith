package school.hei.course.endpoint.arithEndpoint;

import java.util.Map;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import school.hei.course.service.ArithService;

@AllArgsConstructor
@RestController
public class ArithController {
  private final ArithService arithService;

  @GetMapping("/add")
  public ResponseEntity<?> add(Long a, Long b) {
    try {
      Long result = arithService.add(a, b);
      return ResponseEntity.ok(result);
    } catch (RuntimeException e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", e.getMessage()));
    }
  }

  @GetMapping("/minus")
  public ResponseEntity<?> minus(Long a, Long b) {
    try {
      Long result = arithService.minus(a, b);
      return ResponseEntity.ok(result);
    } catch (RuntimeException e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", e.getMessage()));
    }
  }

  @GetMapping("/multiply")
  public ResponseEntity<?> multiply(Long a, Long b) {
    try {
      Long result = arithService.multiply(a, b);
      return ResponseEntity.ok(result);
    } catch (RuntimeException e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", e.getMessage()));
    }
  }

  @GetMapping("/divide")
  public ResponseEntity<?> divide(Long a, Long b) {
    try {
      Long result = arithService.divide(a, b);
      return ResponseEntity.ok(result);
    } catch (RuntimeException e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("error", e.getMessage()));
    }
  }
}
