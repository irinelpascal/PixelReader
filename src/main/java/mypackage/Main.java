package mypackage;
import java.util.*;
import java.util.Random;
//comment below import

//1
//2
//3

public class Main {

    private static Map<String, Map<String, Object>> stringMapMap = new HashMap<String, Map<String, Object>>();
    private static int SIZE = 3;
    public static void main(String[] args)  {

        String text = "Irinel";
        System.out.println(text.length());
        System.out.println(text.charAt(4));

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


        int  []integers = new int[SIZE];
        for(int i = 0; i < SIZE; i++) {
            integers[i] = (new Random().nextInt(100));
        }
        //unsorted collection
        for (int i : integers) {
            System.out.print(i + " ");
        }

        int sorted[] = sort(integers);

        System.out.println();

        for (int number : sorted) {
            System.out.print(number + " ");
        }

        System.out.println(reverseText("Irinel"));

    }

    private static int[] sort(int[] integers) {
        int temp;
        boolean swapped;

        while (true) {

            swapped = false;
            for (int i = 0; i < SIZE - 1; i++) {

                if (integers[i] > integers[i + 1]) {
                    temp = integers[i + 1];
                    integers[i + 1] = integers[i];
                    integers[i] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return integers;
            }
        }
    }  //Blandiana

    private static String reverseText(String text) {
        System.out.println("\n" + text.length());
        String reversedText = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(text.length() - i - 1);
            reversedText += c;
        }

        return reversedText;
    }

}
