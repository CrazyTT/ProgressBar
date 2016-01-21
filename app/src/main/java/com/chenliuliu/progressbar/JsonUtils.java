package com.chenliuliu.progressbar;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

@SuppressWarnings("ALL")
public class JsonUtils {
    private static JsonUtils jsonUtil = new JsonUtils();
    private static ObjectMapper mapper;

    private JsonUtils() {
        mapper = new ObjectMapper();
        mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static JsonUtils getInstance() {
        return jsonUtil;
    }

    public final String object2Json(Object object) {
        String temp = null;
        try {
            temp = mapper.writeValueAsString(object);
        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return temp;
    }

    public final <T> T json2object(String content, Class<T> valueType) {
        try {
            return mapper.readValue(content, valueType);
        } catch (JsonParseException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
