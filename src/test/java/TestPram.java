import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class TestPram {
    @ParameterizedTest
    @ValueSource(ints={1,2,3})
    void testPramDemo(int argus){
        Assertions.assertTrue(argus>=0);
    }

}
