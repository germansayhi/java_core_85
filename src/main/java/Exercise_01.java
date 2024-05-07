public class Exercise_01 {
    void Question01() {
        Account account = new Account();
        if (account.Department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: " + account.Department.name);
        }
    }

    void Question03() {
        Department department = new Department();
        department.name = "CEO";

        Account account = new Account();
        account.Department = department;

        String mess = (account.Department == null)
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là: " + account.Department.name;
        System.out.println(mess);

    }

    void Question04() {
        Position position10 = new Position();
        position10.Position = PositionName.Dev;
        Position position11 = new Position();
        position10.Position = PositionName.PM;

        Account account10 = new Account();
        account10.Position = position10;

        String cu_phap = (account10.Position == position10)

                ? "Đây là Developer"
                : "Người này không phải là Developer";
        System.out.println(cu_phap);

    }

    void Question07() {
        Position position10 = new Position();
        position10.Position = PositionName.PM;

        Account account10 = new Account();
        account10.Position = position10;
        System.out.println(account10.Position.Position.name());
        switch (account10.Position.Position.name()) {
            case "Dev":
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
                break;


        }
    }
}


