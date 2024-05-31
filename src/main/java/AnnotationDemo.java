public class AnnotationDemo {
    public static void main(String[] args) {
        // Annotation: Chu thich
        //@Override
        class Dog{
            @Override
            public String toString() {
                return "Dog{}";
            }
        }
        Dog dog = new Dog();
    }
}
