package com.example;
import org.junit.Test;
import static org.junit.Assert.*;
public class AppTest {
@Test
public void testMessage() {
App app = new App();
assertEquals(&quot;Hello, Jenkins CI!&quot;, app.getMessage());
}
}