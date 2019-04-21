package mypackage;
import java.util.Random;//comment
import java.util.Random;
//comment below import

public class Main {

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

    }

}
