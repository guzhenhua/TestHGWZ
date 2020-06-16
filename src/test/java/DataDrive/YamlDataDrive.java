package DataDrive;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
//import io.restassured.mapper.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class YamlDataDrive {


    @ParameterizedTest()
    @MethodSource
    void getYamlDataDrive(User user) {
        assertTrue(user.name.length() > 3);
    }

    static List<User> getYamlDataDrive() throws IOException {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(1, "张三23"));
        list.add(new User(2, "李四"));
        return list;
    }
}
