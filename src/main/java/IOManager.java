import java.io.*;

public class IOManager {
    public static void writeByte(String path, byte[] bytes, boolean append) throws IOException {
        try(FileOutputStream fos = new FileOutputStream(path, append);){
            fos.write(bytes);
        }
    }
    public static byte[] readByte(String path) throws IOException {
        try(FileInputStream fis = new FileInputStream(path);){
           return fis.readAllBytes();
        }
    }
    public static void writeObject(String path, Object obj, boolean append) throws IOException {
        try(FileOutputStream fos = new FileOutputStream(path, append);
            ObjectOutputStream oos = new ObjectOutputStream(fos);){
            oos.writeObject(obj);
        }
    }
    public static Object readObject(String path) throws IOException, ClassNotFoundException {
        try(FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);){
           return ois.readObject();
        }
    }
}
