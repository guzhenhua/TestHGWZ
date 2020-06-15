package testcase2;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMethodgu {
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
    @Tag("huigui")
    void Test01(){
        System.out.println("Test01");
        assertEquals(1,1);
    }


    @Test
    @DisplayName("测试方法2")
    @Tag("xitong")
    void Test02(){
        System.out.println("Test02");
        assertEquals(1,1);
    }

    @Test
    @EnabledOnOs(OS.MAC)
    @DisplayName("测试方法3")
    @Tag("maoyan")
    void Test03(){
        System.out.println("Test03");
        assertEquals(1,1);
    }

    @Test
    @DisplayName("测试方法4")
    @Tag("maoyan")
    @Disabled
    void Test04(){
        System.out.println("Test04");
        assertEquals(1,1);
    }
}
