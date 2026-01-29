import java.io.*;
public class newMain {
    public static void main(String[] args) {
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\HP\\Downloads\\Capg\\Java\\Java2\\employee.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Downloads\\Capg\\Java\\Java2\\validEmp.txt"));
            BufferedWriter ew = new BufferedWriter(new FileWriter("C:\\Users\\HP\\Downloads\\Capg\\Java\\Java2\\errorlog.txt"));

            String line;
            while ((line = br.readLine())!= null) {
                String [] data = line.split(",");
                try {
                    int id = Integer.parseInt(data[0]);
                String name = data[1];
                float salary = Float.parseFloat(data[2]);
                float bonus = salary * 0.05f;
                bw.write(id + "," + name + "," + salary + "," + bonus);
                bw.newLine();
                } catch (NumberFormatException nf) {
                     ew.write("Invalid employee data " + line);
                    ew.newLine();
                }

            }
            ew.close();bw.close();br.close();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
