package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/** Tests for App. */
class AppTest {

  @Test
  void shouldAnswerWithTrue() {
    assertTrue(true);
  }

  @Test
  void getGreetingReturnsCorrectString() {
    assertEquals("Hello World 3!", App.getGreeting());
  }

  @Test
  void mainExecutesWithoutError() {
    // Runs main lines (coverage only)
    App.main(new String[0]);
  }
}
