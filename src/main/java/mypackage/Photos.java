package mypackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 8/10/2016.
 */
public class Photos {

    protected String strings[];
    protected static int index;
    private String data[];

    public Photos() {

        this.index = 0;

    }

    public void randomPhoto()   {

        index = new Random().nextInt(20);

        strings = new String[20];

        strings[0] = new String("1.jpg");
        strings[1] = new String("2.jpg");
        strings[2] = new String("3.jpg");
        strings[3] = new String("4.jpg");
        strings[4] = new String("5.jpg");
        strings[5] = new String("6.jpg");
        strings[6] = new String("7.jpg");
        strings[7] = new String("8.jpg");
        strings[8] = new String("9.jpg");
        strings[9] = new String("10.jpg");
        strings[10] = new String("11.jpg");
        strings[11] = new String("12.jpg");
        strings[12] = new String("13.jpg");
        strings[13] = new String("14.jpg");
        strings[14] = new String("15.jpg");
        strings[15] = new String("16.jpg");
        strings[16] = new String("17.jpg");
        strings[17] = new String("18.jpg");
        strings[18] = new String("19.jpg");
        strings[19] = new String("20.jpg");

    }

    public String selectPhoto() {

        return strings[index];

    }

    public String selectNextPhoto() {

        return strings[++index];

    }

    public String selectFirstPhoto() {

        return strings[0];

    }

    public int getIndex() {

        return index;
    }

    public String[] getData() {

        data = new String[20];

        data[0] = new String("1.jpg");
        data[1] = new String("2.jpg");
        data[2] = new String("3.jpg");
        data[3] = new String("4.jpg");
        data[4] = new String("5.jpg");
        data[5] = new String("6.jpg");
        data[6] = new String("7.jpg");
        data[7] = new String("8.jpg");
        data[8] = new String("9.jpg");
        data[9] = new String("10.jpg");
        data[10] = new String("11.jpg");
        data[11] = new String("12.jpg");
        data[12] = new String("13.jpg");
        data[13] = new String("14.jpg");
        data[14] = new String("15.jpg");
        data[15] = new String("16.jpg");
        data[16] = new String("17.jpg");
        data[17] = new String("18.jpg");
        data[18] = new String("19.jpg");
        data[19] = new String("20.jpg");

        return data;

    }
}
