package DataDrive;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

//import io.restassured.mapper.ObjectMapper;

public class YamlDataDrive {


    @ParameterizedTest()
    @MethodSource
    void getYamlDataDrive(User user) {
        assertTrue(user.name.length() > 3);
    }

    static List<User> getYamlDataDrive() throws IOException {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        TypeReference typeReference = new TypeReference<List<User>>() {
        };
        List<User> users =mapper.readValue(
                YamlDataDrive.class.getResourceAsStream("/user.yaml")
                , typeReference);
        return users;
    }
}
