package DataDrive;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import java.io.IOException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JsonDataDrive {
    @ParameterizedTest()
    @MethodSource
    void getJsonDataDrive(User user) {
        assertTrue(user.name.length() > 3);
    }

    static List<User> getJsonDataDrive() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<User>> typeReference = new TypeReference<List<User>>() {
        };
        List<User> users = mapper.readValue(
                JsonDataDrive.class.getResourceAsStream("/user.json"),
                typeReference
        );
        return users;
    }
}
