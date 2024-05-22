import java.io.File;
import java.io.IOException;

public class Filemanager {
    // Kiem tra file co toan tai hay khong
    public static boolean exists(String path){
        File file = new File(path);
        return file.exists();
    }
    // tao file
    public static boolean createFile(String path) throws IOException {
        File file = new File(path);
        return file.createNewFile();
    }
    // Xoa file
    public static boolean deleteFile(String path){
        File file =new File(path);
        return file.delete();
    }
    // kiem tra file hoac folder
    public static boolean isFile(String path){
        File file = new File(path);
        return file.isFile();
    }
    // Kiem tra folder
    public static boolean isFolder(String path) {
        File file = new File(path);
        return file.isDirectory();
    }
    // Lay ra danh sach ten file co trong thu muc
    public static String[] list(String path) {
        File file = new File(path);
        return   file.list();
    }
    public static boolean mkdirs(String path){
        File file= new File(path);
        return file.mkdirs();
    }


}
