import java.io.*;

public class ioImg {
    public static void main(String[] args) {
        try {

            FileInputStream fr = new FileInputStream("C:\\Users\\HP\\OneDrive\\Pictures\\Saved Pictures\\victus.png");
            FileOutputStream fo = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Pictures\\Saved Pictures\\victus.png");
        BufferedInputStream bif = new BufferedInputStream(fr);
        BufferedOutputStream bof = new BufferedOutputStream(fo);

        int ch;
            while ((ch = bif.read())!= -1) {
                bof.write(ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
