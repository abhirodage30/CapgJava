import java.io.*;
public class displayContent {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader("C:\\Users\\HP\\Downloads\\Capg\\Java\\Java2\\employee.txt");
            int c =0;
            int l=0;
            int w = 0;
            boolean inWord = false;


            int ch;
            while((ch = fr.read()) != -1){
                // System.out.print((char)ch);
                c++;
                if(c == '\n'){
                    l++;
                }
                 if (Character.isWhitespace(ch)) {
                    inWord = false;
                } else {
                    if (!inWord) {
                        w++;
                        inWord = true;
                    }
                }
                
            }
            fr.close();
            System.out.println("Characters :" +c);
            System.out.println("Lines :" +l);
            System.out.println("Words :" +w);
        }
        catch(IOException e){
            System.out.print(e.getMessage());
        }
    }
}
