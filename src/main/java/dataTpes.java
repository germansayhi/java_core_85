public class dataTpes {
        public static void main(String[] args) {
            System.out.println("Hello world!");
            // cu phap khoi tao
            // [kie_du_lieu] [ten_bien] =[gia_tri_khoi_tao]

            // kieu so nguyen: byte(1), short (2),int, long(8)
            int age = 18;
            System.out.println(" tuoi = "+ age);
            // kieu dl float(4) , double(8)
            float pi = 3.14f;
            System.out.println(" pi = " + pi);

            // kieu logic: boolen
            boolean isLoading = true;
            System.out.println(isLoading);

            // kieu ki tu: char (2)
            char ch = 'A';
            System.out.println(" ch ="+ ch);

            // kieu xau ki tu String
            String name = "D";
            System.out.println("ten = "+name);
            // kieu enum
            Gender gender = Gender.MALE;
            System.out.println("gender = "+gender);

            // class & object
            Dog Dog1 = new Dog();
            Dog1.name = "Shiba";
            Dog1.age = 2;
            Dog1.gender = gender.FEMALE;
            Dog1.bark();
            int sum = Dog1.sum(1,10);
            System.out.println("sum = "+ sum);

            Dog Dog2 = new Dog();
            Dog2.name = "Pitbull";
            Dog2.age = 2;
            Dog2.gender = gender.MALE;
            Dog2.bark();
            int sum1 = Dog2.sum(11,10);
            System.out.println("sum = "+ sum1);



        }
    }

