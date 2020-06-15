import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.NullString;

import java.util.stream.Stream;


public class TestPram {
    @ParameterizedTest
    @ValueSource(ints={1,2,3})
    void testPramDemo(int argus){
        Assertions.assertTrue(argus>=0);
    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings={"3"})
    void testPramDemo1(String argus){
        Assertions.assertTrue(argus.equals("3"));
    }

    //MethodSource更加灵活
    @ParameterizedTest
    @MethodSource("stringProvider")
    void testPramDemo2(String argus){
        Assertions.assertTrue(argus.equals("123"));
    }

    static Stream<String> stringProvider(){
        return Stream.of("123","456");
    }
}
