import buissnes_objects.UserJSON;
import util.Converter;
import util.Lambda;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LearnClass {

    public static void main(String[] args) throws IOException {

        // stream and lambda
        List<String> list = new ArrayList<>();
        for(int i = 0; i < args.length; i++){
            list.add(args[i]);
        }
        list.stream().map(input-> new StringBuilder(input).reverse().toString());

        Lambda.showList(list);

        //jSon object
        UserJSON userJSON = new UserJSON();
        userJSON.setId(10);
        userJSON.setLevel("Level");
        userJSON.setName("Name");
        userJSON.setPhone("87212");

// convert to file
        Converter.toJSON(userJSON);
        Converter.toJavaObject();

// convert to String for DB
        String jSon = Converter.objectToJson(userJSON);
        System.out.println(jSon);
        Converter.jsonToObject(jSon);
        System.out.println(Converter.jsonToObject(jSon));
        Converter.addJsonObjectToList(jSon);

    }
}
