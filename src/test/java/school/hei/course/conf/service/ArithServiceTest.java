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

    int a = 5;
    int b = 10;

    int result = arithService.add(a, b);

    assertEquals(15, result);
  }

  @Test
  void addServiceTest_NegativeNumber_ThrowsException() {
    assertThrows(
        RuntimeException.class,
        () -> {
          arithService.add(-5, 10);
        });
  }

  @Test
  void minus_service_test_ok() {
    int a = 5;
    int b = 3;

    int result = arithService.minus(a, b);
    assertEquals(2, result);
  }

  @Test
  void minus_service_test_b_greater_a() {
    assertThrows(
        RuntimeException.class,
        () -> {
          arithService.minus(3, 5);
        });
  }

  @Test
  void minus_service_test_a_and_b_negative_b_greater_a() {
    assertThrows(
        RuntimeException.class,
        () -> {
          arithService.minus(-5, -3);
        });
  }

  @Test
  void minus_service_test_a_and_b_negative() {
    assertThrows(
        RuntimeException.class,
        () -> {
          arithService.minus(-2, -3);
        });
  }

  @Test
  void multiply_service_test_a_and_b_negative() {
    assertThrows(
        RuntimeException.class,
        () -> {
          arithService.minus(-2, -3);
        });
  }

  @Test
  void multiply_service_test_OK() {
    int a = 5;
    int b = 3;

    int result = arithService.multiply(a, b);
    assertEquals(15, result);
  }

  @Test
  void divide_service_test_a_and_b_negative() {
    assertThrows(
        RuntimeException.class,
        () -> {
          arithService.divide(-2, -3);
        });
  }

  @Test
  void divide_service_test_OK() {
    int a = 15;
    int b = 3;

    int result = arithService.divide(a, b);
    assertEquals(5, result);
  }

  @Test
  void divide_service_test_not_OK() {
    assertThrows(
        RuntimeException.class,
        () -> {
          arithService.divide(-1, 3);
        });
  }
}
