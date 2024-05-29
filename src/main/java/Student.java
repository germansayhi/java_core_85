public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void showInfo(){
        System.out.println(" studentId:" +id);
        System.out.println("Name: "+ name);
    }
    public class Gender{
        private String value;

        public Gender(String value) {
            this.value = value;
        }
    }


}
