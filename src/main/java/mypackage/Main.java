package mypackage;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;//comment
import java.util.Random;
//comment below import

//1
//2
//3

public class Main {

    private static Map<String, Map<String, Object>> stringMapMap = new HashMap<String, Map<String, Object>>();

    public static void main(String[] args)  {


        Image image = new Image(); //added comment newar image

        try {

            image.processingImage();

        } catch (Exception e) {

            System.out.println(e);

        }

        ReadPixel pixel = new ReadPixel();

        try {

            pixel.processingReadImage();
            Comparing comp = new Comparing();
            comp.test();
            comp.comparing();

        } catch (Exception e) {

            System.out.println(e);

        }

        System.out.println("\nfinished !");

        Map<String, String> stringStringMap = new HashMap<String, String>();
        stringStringMap.put("thirdKey", "value1");
        stringStringMap.put("fourthKey", "value2");

        Map<String, Object> stringObjectMap = new HashMap<String, Object>();
        stringObjectMap.put("secondaryKey", stringStringMap);
        Map<String, Object> primarykey = stringMapMap.put("primarykey", stringObjectMap);

    }

}
