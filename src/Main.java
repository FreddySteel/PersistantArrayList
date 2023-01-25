import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        PersistantArrayList.newFile();
        System.out.println( );
        ArrayList xx = CreateArrayList.xyz();
        FileHandler.writeToFile("data",xx,false);
    }
}
