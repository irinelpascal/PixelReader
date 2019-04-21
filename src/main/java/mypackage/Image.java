package mypackage;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 8/10/2016.
 */
public class Image {

    private BufferedImage image;
    private File file;
    private int pixelValue;
    private Random rand;
    private int width;
    private int height;
    private File readfile;
    private int container[][];

    public Image() {

        rand = new Random();

        this.image = null;
        this.file = null;
//        this.pixelValue = rand.nextInt();
//      this.pixelValue = -1314892588;
        this.width = 1920;
        this.height = 1080;
        this.readfile = null;
        container = new int[width][height];


    }

    public void processingImage() throws Exception, InterruptedException {

        BufferedImage desktopImage = null;

        try {


//            for(int y = 0; y < 1080; y++) {
//
//                for(int x = 0; x < 1920; x++) {
//
//                    Color color = new Color(desktopImage.getRGB(y, x));
//
//                }
//
//            }

        } catch (Exception e) {

            System.out.println(e);

        }

        try {

            file = new File("output.jpg");
            image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

            for (int y = 0; y < height; y++) {

                for (int x = 0; x < width; x++) {

                    int random = rand.nextInt();
//                  pixelValue = rand.nextInt();
                    image.setRGB(x, y, ((int) random / 65536) + ((int) random / 255) + 1);
                    container[x][y] = pixelValue;


                }

            }


            for (int y = 0; y < 160; y++) {

                for (int x = 0; x < 320; x++) {

                    image.setRGB(x, y, pixelValue - 50);

                }

            }

            for (int y = 160; y < 320; y++) {

                for (int x = 320; x < 640; x++) {

                    image.setRGB(x, y, pixelValue + 50);

                }

            }


            ImageIO.write(image, "jpg", file);
            System.out.println("Image writen.");


        } catch (IOException e) {

            System.out.println(e);

        }

    }

}
