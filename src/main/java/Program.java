import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        // Department
            Department department1 = new Department();
            department1.departmentid = 1;
            department1.name = "Giam Doc";
            System.out.println("Tên phòng ban 1 " + department1.name);

            Department department2 = new Department();
            department2.departmentid = 2;
            department2.name = "Nhan su";
            System.out.println("Tên phòng ban 2 " + department2.name);

            Department department3 = new Department();
            department3.departmentid = 3;
            department3.name = "Marketing";
            System.out.println("Tên phòng ban 3 " + department3.name);
        System.out.println("----------");

           // Position
            Position position1 = new Position();
            position1.id = 1;
            position1.Position = PositionName.PM;
            System.out.println("Chức vụ id " + position1.id + position1.Position);

            Position position2 = new Position();
            position2.id = 2;
            position2.Position = PositionName.Dev;
            System.out.println("Chức vụ id "+ position2.id +  position2.Position);

            Position position3 = new Position();
            position3.id = 3;
            position3.Position = PositionName.Test;
            System.out.println("Chức vụ id "+ position3.id + position3.Position);
        System.out.println("----------");

            // Account
        Account account1 = new Account();
        account1.Accountid = 1;
        account1.email = "test@gmail.com";
        account1.username= "a";
        account1.Fullname = "Nguyễn Văn A";
        account1.DepartmentID = 1;
        account1.PositionID = 1;
        LocalDate Datetime = LocalDate.of(2024, 5, 5);
        System.out.println("Tên nv" + account1.Accountid + " là : " + account1.username + " tên đầy đủ là: " + account1.Fullname );
        System.out.println("Phòng ban nhân viên là: "+ account1.DepartmentID + " PositionID là: " +account1.PositionID);
        System.out.println("Ngày tao tài khoản là: "+ Datetime);

        Account account2 = new Account();
        account2.Accountid = 2;
        account2.email = "abc@gmail.com";
        account2.username= "B";
        account2.Fullname = "Nguyễn Văn B";
        account2.DepartmentID = 2;
        account2.PositionID = 2;
        LocalDate Datetime2 = LocalDate.of(2022, 1, 5);
        System.out.println("Tên nv" + account2.Accountid + " là : " + account2.username + " tên đầy đủ là: " + account2.Fullname );
        System.out.println("Phòng ban nhân viên là: "+ account2.DepartmentID + " PositionID là: " +account2.PositionID);
        System.out.println("Ngày tao tài khoản là: "+ Datetime2);

        Account account3 = new Account();
        account3.Accountid = 3;
        account3.email = "cdf@gmail.com";
        account3.username= "C";
        account3.Fullname = "Ngyen Van C";
        account3.DepartmentID = 3;
        account3.PositionID = 3;
        LocalDate Datetime3 = LocalDate.of(2023, 11, 10);
        System.out.println("Tên nv" + account3.Accountid + " là : " + account3.username + " tên đầy đủ là: " + account3.Fullname );
        System.out.println("Phòng ban nhân viên là: "+ account3.DepartmentID + " PositionID là: " +account3.PositionID);
        System.out.println("Ngày tao tài khoản là: "+ Datetime3);
        System.out.println("----------");

        //Group
        Group group1 = new Group();
        group1.GroupID =1;
        group1.GroupName = "Nhóm Anpha";
        group1.CreateID =2;
        LocalDate CreateDate1 = LocalDate.of(2020, 10, 5);
        System.out.println("GroupID: " + group1.GroupID+ " tên nhóm là: " + group1.GroupName );
        System.out.println("Mã nhân viên tạo nhóm là: " + group1.CreateID);
        System.out.println("Ngày tao group: "+ CreateDate1);

        Group group2 = new Group();
        group2.GroupID =2;
        group2.GroupName = "Nhóm Beta";
        group2.CreateID =3;
        LocalDate CreateDate2 = LocalDate.of(2023, 1, 12);
        System.out.println("GroupID: " + group2.GroupID+ " tên nhóm là: " + group2.GroupName );
        System.out.println("Mã nhân viên tạo nhóm là: " + group2.CreateID);
        System.out.println("Ngày tao group: "+ CreateDate2);

        Group group3 = new Group();
        group3.GroupID =3;
        group3.GroupName = "Nhóm Penta";
        group3.CreateID =3;
        LocalDate CreateDate3 = LocalDate.of(2019, 10, 12);
        System.out.println("GroupID: " + group3.GroupID+ " tên nhóm là: " + group3.GroupName );
        System.out.println("Mã nhân viên tạo nhóm là: " + group3.CreateID);
        System.out.println("Ngày tao group: "+ CreateDate3);
        System.out.println("----------");

         //GroupAccount
        GroupAccount GroupAccount1 = new GroupAccount();
        GroupAccount1.GroupID =1;
        GroupAccount1.AccountID =1;
        LocalDate JoinDate = LocalDate.of(2021,2,2);
        System.out.println("ID của nhóm là: " + GroupAccount1.GroupID + " và ID của User là: "+ GroupAccount1.AccountID);
        System.out.println("Ngày user tham gia: "+ JoinDate);

        GroupAccount GroupAccount2 = new GroupAccount();
        GroupAccount2.GroupID =2;
        GroupAccount2.AccountID =3;
        LocalDate JoinDate1 = LocalDate.of(2021,2,3);
        System.out.println("ID của nhóm là: " + GroupAccount2.GroupID + " và ID của User là: "+ GroupAccount2.AccountID);
        System.out.println("Ngày user tham gia: "+ JoinDate1);

        GroupAccount GroupAccount3 = new GroupAccount();
        GroupAccount3.GroupID =3;
        GroupAccount3.AccountID =4;
        LocalDate JoinDate2 = LocalDate.of(2021,12,3);
        System.out.println("ID của nhóm là: " + GroupAccount3.GroupID + " và ID của User là: "+ GroupAccount3.AccountID);
        System.out.println("Ngày user tham gia: "+ JoinDate2);
        System.out.println("----------");

        //TypeQuestion
        TypeQuestion TypeQuestion1 = new TypeQuestion();
        TypeQuestion1.TypeQuestion =1;
        TypeQuestion1.typeName = TypeName.Essay;
        System.out.println("Mã câu hỏi là: " +TypeQuestion1.TypeQuestion + " loại câu hỏi là: " + TypeQuestion1.typeName);

        TypeQuestion TypeQuestion2 = new TypeQuestion();
        TypeQuestion2.TypeQuestion =2;
        TypeQuestion2.typeName = TypeName.Multiple_Choice;
        System.out.println("Mã câu hỏi là: " +TypeQuestion2.TypeQuestion + " loại câu hỏi là: " + TypeQuestion2.typeName);

        TypeQuestion TypeQuestion3 = new TypeQuestion();
        TypeQuestion3.TypeQuestion =10;
        TypeQuestion3.typeName = TypeName.Essay;
        System.out.println("Mã câu hỏi là: " +TypeQuestion3.TypeQuestion + " loại câu hỏi là: " + TypeQuestion3.typeName);
        System.out.println("----------");

        // CategoryQuestion
        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.CategoryID =1;
        categoryQuestion1.CategoryName = "Java";
        System.out.println("Id của câu hỏi là: " + categoryQuestion1.CategoryID + ". Đề tài là: " + categoryQuestion1.CategoryName);


        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.CategoryID =10;
        categoryQuestion2.CategoryName =".NET" ;
        System.out.println("Id của câu hỏi là: " + categoryQuestion2.CategoryID + ". Đề tài là: " + categoryQuestion2.CategoryName);


        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.CategoryID =3;
        categoryQuestion3.CategoryName = "C++";
        System.out.println("Id của câu hỏi là: " + categoryQuestion3.CategoryID + ". Đề tài là: " + categoryQuestion3.CategoryName);
        System.out.println("----------");

        //Question
        Question Question1 = new Question();
        Question1.QuestionID =1;
        Question1.Content = "Câu hỏi số 1";
        Question1.CategoryID =1;
        Question1.TypeID =1;
        Question1.CreatorID =1;
        LocalDate CreateDat1 = LocalDate.of(2022,1,1);
        System.out.println("ID câu hỏi là: "+ Question1.QuestionID +". Nội dung câu hỏi là: "+ Question1.Content);
        System.out.println("ID của câu hỏi là: "+ Question1.CreatorID+ ". Đinh danh của nó là: "+ Question1.TypeID);
        System.out.println("ID người tao ra câu hỏi là: "+ Question1.CreatorID +" và ngày tao là: "+ CreateDat1);

        Question Question2 = new Question();
        Question2.QuestionID =101;
        Question2.Content = "Sở thích ";
        Question2.CategoryID =3;
        Question2.TypeID =4;
        Question2.CreatorID =3;
        LocalDate CreateDat2 = LocalDate.of(2022,12,12);
        System.out.println("ID câu hỏi là: "+ Question2.QuestionID +". Nội dung câu hỏi là: "+ Question2.Content);
        System.out.println("ID của câu hỏi là: "+ Question2.CreatorID+ ". Đinh danh của nó là: "+ Question2.TypeID);
        System.out.println("ID người tao ra câu hỏi là: "+ Question1.CreatorID +" và ngày tao là: "+ CreateDat2);

        Question Question3 = new Question();
        Question3.QuestionID =11;
        Question3.Content = "Du lich ";
        Question3.CategoryID =31;
        Question3.TypeID =14;
        Question3.CreatorID =1;
        LocalDate CreateDat3 = LocalDate.of(2020,7,7);
        System.out.println("ID câu hỏi là: "+ Question3.QuestionID +". Nội dung câu hỏi là: "+ Question3.Content);
        System.out.println("ID của câu hỏi là: "+ Question3.CreatorID+ ". Đinh danh của nó là: "+ Question3.TypeID);
        System.out.println("ID người tao ra câu hỏi là: "+ Question1.CreatorID +" và ngày tao là: "+ CreateDat3);
        System.out.println("----------");

        //Answer
        Answer Answer1 = new Answer();
        Answer1.AnswerID =1;
        Answer1.Content= "Đáp án 1";
        Answer1.QuestionID =1;
        Answer1.Iscorrect = isCorrect.TRUE;
        System.out.println("ID của câu 1: "+Answer1.AnswerID+" Content là: "+". Câu trả lời này: "+ Answer1.Iscorrect);

        Answer Answer2 = new Answer();
        Answer2.AnswerID =2;
        Answer2.Content= "Đáp án là ý trời";
        Answer2.QuestionID =2;
        Answer2.Iscorrect = isCorrect.FALSE;
        System.out.println("ID của câu 2: "+Answer2.AnswerID+" Content là: "+". Câu trả lời này: "+ Answer2.Iscorrect);

        Answer Answer3 = new Answer();
        Answer3.AnswerID =11;
        Answer3.Content= "tất cả các ý trên";
        Answer3.QuestionID =13;
        Answer3.Iscorrect = isCorrect.TRUE;
        System.out.println("ID của câu 3: "+Answer3.AnswerID+" Content là: "+". Câu trả lời này: "+ Answer3.Iscorrect);
        System.out.println("----------");

        //Exam
        Exam Exam1 =new Exam();
        Exam1.ExamID =11;
        Exam1.Code =12;
        Exam1.Title = " Câu hỏi về C++";
        Exam1.CategoryID =113;
        Exam1.Duration =40;
        Exam1.CreatorID=20;
        LocalDate CreateDate21 =LocalDate.of(2021,2,11);
        System.out.println("ID của đề thi là: "+ Exam1.ExamID+ ". Mã đề thi là: "+Exam1.Code);
        System.out.println("Tiêu đề là: "+Exam1.Title+". Đinh danh của chủ đề là: "+ Exam1.CategoryID );
        System.out.println("Thời gian thi: "+Exam1.Duration+". Ngày tao đề là: "+ CreateDate21);

        Exam Exam2 =new Exam();
        Exam2.ExamID =111;
        Exam2.Code =2;
        Exam2.Title = " Câu hỏi về java";
        Exam2.CategoryID =13;
        Exam2.Duration =41;
        Exam2.CreatorID=33;
        LocalDate CreateDate211 =LocalDate.of(2021,12,11);
        System.out.println("ID của đề thi là: "+ Exam2.ExamID+ ". Mã đề thi là: "+Exam2.Code);
        System.out.println("Tiêu đề là: "+Exam2.Title+". Đinh danh của chủ đề là: "+ Exam2.CategoryID );
        System.out.println("Thời gian thi: "+Exam2.Duration+". Ngày tao đề là: "+ CreateDate211);

        Exam Exam3 =new Exam();
        Exam3.ExamID =11;
        Exam3.Code =12;
        Exam3.Title = " Câu hỏi về .Net";
        Exam3.CategoryID =113;
        Exam3.Duration =40;
        Exam3.CreatorID=20;
        LocalDate CreateDate121 =LocalDate.of(2011,2,19);
        System.out.println("ID của đề thi là: "+ Exam3.ExamID+ ". Mã đề thi là: "+Exam3.Code);
        System.out.println("Tiêu đề là: "+Exam3.Title+". Đinh danh của chủ đề là: "+ Exam3.CategoryID );
        System.out.println("Thời gian thi: "+Exam3.Duration+". Ngày tao đề là: "+ CreateDate121);
        System.out.println("----------");


        //ExamQuestion
        ExamQuestion ExamQuestion1 = new ExamQuestion();
        ExamQuestion1.ExamID =1;
        ExamQuestion1.QuestionID =1;
        System.out.println("ID của đề thi: "+ExamQuestion1.ExamID+", đinh danh của câu hỏi: "+ExamQuestion1.QuestionID);

        ExamQuestion ExamQuestion2 = new ExamQuestion();
        ExamQuestion2.ExamID =2;
        ExamQuestion2.QuestionID =2;
        System.out.println("ID của đề thi: "+ExamQuestion2.ExamID+", đinh danh của câu hỏi: "+ExamQuestion2.QuestionID);

        ExamQuestion ExamQuestion3 = new ExamQuestion();
        ExamQuestion3.ExamID =3;
        ExamQuestion3.QuestionID =11;
        System.out.println("ID của đề thi: "+ExamQuestion3.ExamID+", đinh danh của câu hỏi: "+ExamQuestion3.QuestionID);

    }
}
