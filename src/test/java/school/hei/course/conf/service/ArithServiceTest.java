package school.hei.course.conf.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import school.hei.course.service.ArithService;

class ArithServiceTest {

  private ArithService arithService;

  @BeforeEach
  void setUp() {
    arithService = new ArithService();
  }

  @Test
  void addServiceTest_PositiveNumbers_ReturnsSum() {

    Long a = 5L;
    Long b = 10L;

    Long result = arithService.add(a, b);

    assertEquals(15, result);
  }

  @Test
  void addServiceTest_NegativeNumber_ThrowsException() {
    assertThrows(
        RuntimeException.class,
        () -> {
          arithService.add(-5L, 10L);
        });
  }

  @Test
  void minus_service_test_ok() {
    Long a = 5L;
    Long b = 3L;

    Long result = arithService.minus(a, b);
    assertEquals(2, result);
  }

  @Test
  void minus_service_test_b_greater_a() {
    assertThrows(
        RuntimeException.class,
        () -> {
          arithService.minus(3L, 5L);
        });
  }

  @Test
  void minus_service_test_a_and_b_negative_b_greater_a() {
    assertThrows(
        RuntimeException.class,
        () -> {
          arithService.minus(-5L, -3L);
        });
  }

  @Test
  void minus_service_test_a_and_b_negative() {
    assertThrows(
        RuntimeException.class,
        () -> {
          arithService.minus(-2L, -3L);
        });
  }

  @Test
  void multiply_service_test_a_and_b_negative() {
    assertThrows(
        RuntimeException.class,
        () -> {
          arithService.minus(-2L, -3L);
        });
  }

  @Test
  void multiply_service_test_OK() {
    Long a = 5L;
    Long b = 3L;

    Long result = arithService.multiply(a, b);
    assertEquals(15, result);
  }

  @Test
  void divide_service_test_a_and_b_negative() {
    assertThrows(
        RuntimeException.class,
        () -> {
          arithService.divide(-2L, -3L);
        });
  }

  @Test
  void divide_service_test_OK() {
    Long a = 15L;
    Long b = 3L;

    Long result = (long) arithService.divide(a, b);
    assertEquals(5L, result);
  }

  @Test
  void divide_service_test_not_OK() {
    assertThrows(
        RuntimeException.class,
        () -> {
          arithService.divide(-1L, 3L);
        });
  }
}
