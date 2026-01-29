import java.io.*;
public class givenWord {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\HP\\Downloads\\Capg\\Java\\Java2\\employee.txt");
            BufferedReader br = new BufferedReader(fr);

            String l;
            while ((l = br.readLine())!= null) {
                if (l.contains("is")) {
                    System.out.println(l);
                }
           
            }
            fr.close();
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
