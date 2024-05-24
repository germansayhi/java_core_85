import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "src/main/resources/abc.txt";

        String text = "High.core =1000";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        IOManager.writeByte(path, bytes,false);

        byte[] result = IOManager.readByte(path);
        String Content = new String(result, StandardCharsets.UTF_8);
        System.out.println("Content = " + Content);
        System.out.println("High.core = " + Content.split("=")[1]);

        Account s1 = new Account(1,"Bui Quang Duc","1234","Germany");
        IOManager.writeObject(path,s1,false);

        Object saveAccount = IOManager.readObject(path);
        System.out.println(saveAccount);
    }
}
