import java.util.Random;

public class Main {

    public static void main(String[] args)  {


        Image image = new Image();

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
