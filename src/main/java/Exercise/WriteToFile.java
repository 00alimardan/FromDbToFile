package Exercise;

import java.io.*;

public class WriteToFile {
    public static void PersonDataToFile() throws IOException{
        FileOutputStream fos = new FileOutputStream("src/main/resources/PersonData.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(Application.getPeople());
        oos.flush();
    }

    public static void PersonDataFromFile() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("src/main/resources/PersonData.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        System.out.println(ois.readObject());
    }
}