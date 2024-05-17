import java.util.Scanner;

public class Exsecise06 {
    public void Question_01(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay chon 1 con so: ");
        Phone vietNamesePhone = new Phone();
        while(true){
            System.out.println("1. insertContact");
            System.out.println("2. removeContact");
            System.out.println("3. updateContact");
            System.out.println("4. searchContact");
            System.out.println("5. exit");
            System.out.println("Hay chon 1 chuc nang");
            int choice = sc.nextInt();
            if (choice == 5){
                return;
            }
            System.out.println("Nhap vao ten");
            String name = sc.next();
            switch (choice) {
                case 1:
                    System.out.println("Nhap vao so phone: ");
                    int phone = sc.nextInt();
                    //vietNamesePhone.insertContact(name,phone);
                    break;
                    case 2:
                        //vietNamesePhone.removeContact
                        break;;
                        case 3:
                            System.out.println("Nhap vao new phone: ");
                            String newPhone = sc.next();
                            //vietNamesePhone.updateContact(name,newPhone);
                            break;
                            case 4:
                            //vietNamesePhone.searchContact(name);
                            break;
            }

        }

    }
}
