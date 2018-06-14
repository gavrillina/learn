package util;

import buissnes_objects.UserJSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Converter {
    private final static String baseFile = "user.json";

    public static void toJSON(UserJSON user) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(baseFile), user);
        System.out.println("json created!");
    }

    public static UserJSON toJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.readValue(new File(baseFile), UserJSON.class));
        return mapper.readValue(new File(baseFile), UserJSON.class);
    }

    public static String objectToJson(Object obj) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonObject = mapper.writeValueAsString(obj);
        return jsonObject;
    }

    public static Object jsonToObject(String json) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Object obj = mapper.readValue(json, UserJSON.class);
        return obj;
    }
}
