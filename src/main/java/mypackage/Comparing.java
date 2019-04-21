package mypackage;


import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DecimalFormat;
import java.util.Random;

public class Comparing extends ReadPixel {


    private StringBuilder sb;
    private static int similarity;
    private int dataPixelNextPhoto[][];
    private File nextPhotoToCompare;
    private String pics[];
    private BufferedImage firstImage;
    private BufferedImage secondImage;
    private double precision;

    public Comparing() throws Exception {

        sb = new StringBuilder();
        similarity = 0;
        dataPixelNextPhoto = new int[getWidth()][getHeight()];
        this.nextPhotoToCompare = null;
        this.secondImage = null;
        this.precision = 0.00;

    }

    public void comparing() throws Exception {

        try {

            File firstFile = new File("C:\\Users\\Administrator\\Desktop\\640x320_pictures\\1.jpg");
            File secondFile = new File("C:\\Users\\Administrator\\Desktop\\640x320_pictures\\13.jpg");

            firstImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
            secondImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);

            firstImage = ImageIO.read(firstFile);
            secondImage = ImageIO.read(secondFile);

            for (int y = 0; y < getHeight(); y++) {

                for (int x = 0; x < getWidth(); x++) {



                    Color firstColor = new Color(firstImage.getRGB(x, y));
                    Color secondColor = new Color(secondImage.getRGB(x, y));

                    int firstR = firstColor.getRed();
                    int firstG = firstColor.getGreen();
                    int firstB = firstColor.getBlue();

                    int secondR = secondColor.getRed();
                    int secondG = secondColor.getGreen();
                    int secondB = secondColor.getBlue();

//                    int increasedSecondR = secondR += 50; //red color
//                    int decreaseSecondR = secondR -= 50;
//
//                    int increasedSecondG = secondG += 50; //green
//                    int decreasedSecondG = secondG -= 40;
//
//                    int increasedSecondB = secondB +=30; //blue
//                    int decreasedSecondB = secondB -=30;

//                    int increasedSecondR = secondR += 100; //red color
//                    int decreaseSecondR = secondR -= 100;
//
//                    int increasedSecondG = secondG += 100; //green
//                    int decreasedSecondG = secondG -= 80;
//
//                    int increasedSecondB = secondB += 60; //blue
//                    int decreasedSecondB = secondB -= 60;

                    int increasedSecondR = secondR += 10; //red color
                    int decreasedSecondR = secondR -= 10;

                    int increasedSecondG = secondG += 10; //green
                    int decreasedSecondG = secondG -= 10;

                    int increasedSecondB = secondB += 30; //blue
                    int decreasedSecondB = secondB -= 30;


                    if ((firstR == secondR) || ((firstR <= increasedSecondR) && (firstR >= decreasedSecondR))) {

                        similarity++;

                    }

                    if ((firstG == secondG) || ((firstG <= increasedSecondG) && (firstG >= decreasedSecondG))) {

                        similarity++;

                    }

                    if ((firstB == secondB) || ((firstB <= increasedSecondB) && (firstB >= decreasedSecondB))) {

                        similarity++;

                    }

                      // abolute similarity

//                    if ((firstR == secondR) ) {
//
//                        similarity++;
//
//                    }
//
//                    if((firstG == secondG)) {
//
//                        similarity++;
//
//                    }
//
//                    if ((firstR == secondR)) {
//
//                        similarity++;
//
//                    }

                }

            }

//            System.out.println("\nSimilar pixels: "+Count()/2);

            precision = (double)(Count()*100)/204800;

//            System.out.printf("Similarity between %s and %s is ~%.2f %c\n", firstFile.toString(), secondFile.toString(), precision, '%');

            if(precision > 60.00) {

                File file = new File("output2.jpg");
                BufferedImage outputImage = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
                ImageIO.write(outputImage, "jpg", file);

            }


        } catch (Exception e) {

            System.out.println();

        }

    }

    public void test() {


        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {

            array[i] = new Random().nextInt(10);
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "."));

        }

    }

    public static int Count() {

        return similarity;

    }

}
