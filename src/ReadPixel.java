import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

/**
 * Created by Administrator on 8/10/2016.
 * @Author: Irinel Pascal
 */
public class ReadPixel extends Photos {

    private File file;
    private BufferedImage selectedImage;
    private final int width = 640;
    private final int height = 320;
    private int pixelColor[][];
    private String selection;
    private StringBuilder sb;
    private String photos[];
    private String nextPhoto;
    private boolean done;
    private File files[];
    private final int size = 20;
    private File nextFile;
    private BufferedImage selectedImages[];
    private File selectedRandomFile;
    private static int similarity;
    private File output;
    private int flag;


    public ReadPixel() {

        this.file = null;
        this.selectedImage = null;
        pixelColor = new int[width][height];
        this.selection = null;
        this.sb = null;
        this.photos = null;
        this.nextPhoto = null;
        this.done = false;
        this.files = null;
        this.nextFile = null;
        this.selectedRandomFile = null;
        this.selectedImages = null;
        similarity = 0;
        this.output = null;
        flag = 1;

    }

    public int getWidth() {

        return width;
    }

    public int getHeight() {

        return height;
    }

    public void processingReadImage() throws Exception {

        try {

            sb = new StringBuilder();
            selectedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);


            Photos photo = new Photos();
            photo.randomPhoto();

            selection = new String();
            selection = photo.selectPhoto();

            photos = getData(); //next photo to be compared

//            if(index == (getData().length-1)) {
//
//                nextPhoto = new String(photos[0]);
//
//            } else {
//
//                nextPhoto = photos[++index];
//
//            }
//
//            System.out.println(selection+" vs "+nextPhoto);

            files = new File[getData().length];
            selectedImages = new BufferedImage[getData().length];

            for (int i = 0; i < getData().length; i++) {

                files[i] = new File("C:\\Users\\Administrator\\Desktop\\640x320_pictures\\" + photos[i]);
                selectedImages[i] = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
                selectedImages[i] = ImageIO.read(files[i]);

            }

            int number = new Random().nextInt(getData().length);
//            int number = 3;

            selectedRandomFile = files[number];

            System.out.println("k is: " + number);

            while (!done) {

                if (number >= 0/*(getData().length - 1)*/) {

                    nextFile = files[0];
//                    System.out.println(selectedRandomFile + " vs " + nextFile);

                    for (int k = 0; k < getData().length; k++) {

                        for (int y = 0; y < height; y++) {

                            for (int x = 0; x < width; x++) {

                                Color firstColor = new Color(selectedImages[number].getRGB(x, y));
                                Color secondColor = new Color(selectedImages[k].getRGB(x, y));

                                int firstR = firstColor.getRed();
                                int firstG = firstColor.getGreen();
                                int firstB = firstColor.getBlue();

                                int secondR = secondColor.getRed();
                                int secondG = secondColor.getGreen();
                                int secondB = secondColor.getBlue();

                                int range = (int) (Math.pow((firstR - secondR), 2) + Math.pow((firstB - secondB), 2) + Math.pow((firstG - secondG), 2)); //intensity of color - the distance from the original to the next photo
//                                System.out.println(firstR+"."+firstG+"."+firstG+":"+range);

//                                int increasedRange = range + 2500;
//                                int decreasedRange = range - 2500;
//
//                                int increasedSecondR = secondR += 19; //red color
//                                int decreasedSecondR = secondR -= 17;
//
//                                int increasedSecondG = secondG += 12; //green
//                                int decreasedSecondG = secondG -= 10;
//
//                                int increasedSecondB = secondB += 35; //blue
//                                int decreasedSecondB = secondB -= 32;

//                                int increasedSecondR = secondR += 37; //red color
//                                int decreasedSecondR = secondR -= 37;
//
//                                int increasedSecondG = secondG += 32; //green
//                                int decreasedSecondG = secondG -= 30;
//
//                                int increasedSecondB = secondB += 17; //blue
//                                int decreasedSecondB = secondB -= 17;

//                                if ((firstR == secondR) || ((firstR <= increasedSecondR) && (firstR >= decreasedSecondR))) {
//
//                                    similarity++;
//
//                                }
//
//                                if ((firstG == secondG) || ((firstG <= increasedSecondG) && (firstG >= decreasedSecondG))) {
//
//                                    similarity++;
//
//                                }
//
//                                if ((firstB == secondB) || ((firstB <= increasedSecondB) && (firstB >= decreasedSecondB))) {
//
//                                    similarity++;
//
//                                }

                                if ((firstR == secondR) || (firstG == secondG) || (firstB == secondB) || (range <= 2500)) {

                                    similarity++;

                                }

//                                if ((firstR == secondR) || (range <= 1000)) {
//
//                                    similarity++;
//
//                                }
//
//                                if ((firstG == secondG) || (range <= 1000)) {
//
//                                    similarity++;
//
//                                }
//
//                                if ((firstB == secondB) || (range <= 1000)) {
//
//                                    similarity++;
//
//                                }

                                // abolute similarity

//                                if ((firstR == secondR)) {
//
//                                    similarity++;
//
//                                }
//
//                                if ((firstG == secondG)) {
//
//                                    similarity++;
//
//                                }
//
//                                if ((firstR == secondR)) {
//
//                                    similarity++;
//
//                                }

                            }

                        }

                        int j = k;

                        if (k == number) {

                            similarity = 0;
                            continue;

                        }

                        nextFile = files[k];

                        double precision = (double) (Count() * 100) / 204800;

                        System.out.print("Similiarity between " + selectedRandomFile + " and " + nextFile + " is: " + Count() + " pixels" + " ~ ");
                        System.out.printf("%.2f %c", precision, '%');
                        System.out.println("");

                        Desktop desktop = Desktop.getDesktop();

                        switch (flag) {

                            case 1:

                                desktop.open(selectedRandomFile);
                                flag++;

                                break;

                        }

                        if (precision >= 23.27) {  // percentage

                            if (Desktop.isDesktopSupported()) {

                                try {

                                    Thread.sleep(2000);

                                } catch (InterruptedException e) {

                                    System.out.println(e);

                                }

                                desktop.open(files[k]);

                            }

                        }

                        similarity = 0; //reset count;

                    }

                }

                System.out.println("\nin while");

                done = true;

            }

            sb.append(selection);
            String t = sb.toString();

            file = new File("C:\\Users\\Administrator\\Desktop\\640x320_pictures\\" + t);

            System.out.println("----------------------------------------------------------------------------------------------------------------");

            selectedImage = ImageIO.read(file);

            for (int y = 0; y < height; y++) {

                for (int x = 0; x < width; x++) {

                    Color color = new Color(selectedImage.getRGB(x, y));

                    int r = color.getRed();
                    int g = color.getGreen();
                    int b = color.getBlue();

//                    System.out.print("[" + x + "][" + y + "]:");
//                    System.out.print(r + "." + g + "." + b + ".");

                    pixelColor[x][y] = r * 0xffff + g * 0xff + b; //selected photo data pixel

//                    return;

                }

//                System.out.println("");

            }

            System.out.println("Pixels data for " + t + " have been saved !");

        } catch (Exception e) {

            System.out.println(e);

        }

    }

    public static int Count() {

        return similarity;

    }

}
