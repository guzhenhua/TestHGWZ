import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;


public class TestPram {
    @ParameterizedTest
    @ValueSource(ints={1,2,3})
    void testPramDemo(int argus){
        assertTrue(argus>=0);
    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings={"3"})
    void testPramDemo1(String argus){
        assertTrue(argus.equals("3"));
    }

    //MethodSource更加灵活,如果参数stringProvider不传,系统默认会找与方法同名的方法testPramDemo2()
    @ParameterizedTest
    @MethodSource("stringProvider")
    void testPramDemo2(String argus){
        assertTrue(argus.equals("123"));
    }

    static Stream<String> stringProvider(){
        return Stream.of("123","456");
    }


    static Stream<Arguments> stringProvider1(){
        return Stream.of(
                arguments("numbe1",1, Arrays.asList("123","456")),
                arguments("numbe2",2, Arrays.asList("567","896"))
        );
    }
    @ParameterizedTest
    @MethodSource("stringProvider1")
    void testPramDemo3(String str,int num,List<String> list){
        assertTrue(str.equals("numbe1"));
        assertTrue(num==1);
        assertTrue(list.size()>1);
    }


}
