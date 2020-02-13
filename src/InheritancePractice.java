public class InheritancePractice {
//    public String name;
//
//    public InheritancePractice(String name) {
//        this.name = name;
//    }
//
//    public void sayHello() {
//        System.out.println("Hello from " + name + "!");
//    }
//
//    static class Employees extends InheritancePractice {
//
//        public Employees(String name) {
//            super(name);
//        }
//    }

    public void sayHello() {
        System.out.println("Hello, World!");
    }

    static class Employee extends InheritancePractice {
        private double salary;
        public void doWork() {
            System.out.println("Work, work...");
        }

// method overriding
public void sayHello() {
    System.out.println("How can I help you?");
}
    }



    public static void main(String[] args) {
//        Employees john = new Employees("John");
//        john.sayHello();
    InheritancePractice p = new InheritancePractice();
    Employee e = new Employee();

    p.sayHello();
//    e.doWork();
    e.sayHello();









}


}