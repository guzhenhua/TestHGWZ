import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.NullString;


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

    @ParameterizedTest
    @EnumSource
    void testPramDemo2(int argus){
        Assertions.assertTrue(argus>=0);
    }
}
