import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class PersistantArrayList{
    public static void newFile(){
        try {
            File myObj = new File("data");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void get(int i ){
        ArrayList xyz = FileHandler.readFromFile("data");
        System.out.println();

    }
}
