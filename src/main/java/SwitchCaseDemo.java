public class SwitchCaseDemo {
    public static void main(String[] args) {
        int month =4;
        switch (month) {
                case 2:
                    System.out.println("Co 28 ngay");
                    break;
                    case 4:
                        case 6:
                    case 9:
                    case 11:
                    System.out.println("Thang co 30 ngay");
                        break;

            default:
                System.out.println("Thang co 31 ngay");
                        break;
        }
    }
}
