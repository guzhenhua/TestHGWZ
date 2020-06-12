import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMethod {
    @BeforeEach
    void init() {
        System.out.println("BeforeEach");
    }

    @BeforeAll
    static void initAll() {
        System.out.println("BeforeAll");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach");
    }
    @AfterAll
    static void tearDownAll() {
        System.out.println("AfterAll");
    }
    @Test
    @DisplayName("测试方法1")
    void Test01(){
        System.out.println("Test01");
        assertEquals(1,1);
    }
    @Test
    @DisplayName("测试方法2")
    void Test02(){
        System.out.println("Test02");
        assertEquals(1,1);
    }
}
