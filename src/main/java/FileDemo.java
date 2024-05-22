import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path= "src/main/resources/abc.txt";

        boolean createNewFile = Filemanager.createFile(path);
        System.out.println("createNewFile= "+createNewFile);

        boolean delete = Filemanager.deleteFile("src/main/resources/abc.txt");
        System.out.println("delete "+delete);

        boolean mkdirs = Filemanager.mkdirs("E:ra-86");
        System.out.println("mkdirs"+ mkdirs);

        boolean delete1 = Filemanager.deleteFile("E:ra-86");
        System.out.println("delete "+delete);



    }
}
