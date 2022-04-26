package inh;
//class Demo123{
//    String d ;
//    void demo(){
//        System.out.println("Demo123");
//    }
//}
// class Example  extends Demo123{
//    String name;
//    String email;
//    void getData(){
//        System.out.println("Base");
//        System.out.println(name);
//    }
//    @Override
//     void demo() {
//         super.demo();
//         System.out.println("Example");
//     }
// }
//public class Base  extends  Example{
//    @Override
//    void getData() {
//        super.getData();
//        name="Kamlesh";
//        System.out.println("Example");
//        System.out.println(name);
//    }
//    @Override
//    void demo() {
//        System.out.println("Base");
//        super.demo();
//    }
//    public static void main(String[] args) {
//        Base base = new Base();
////        String name = null;
////        System.out.println(name);
////        base.getData();
//        base.demo();
//    }
//}

class Employee {
    int id;
    String name;

}

class Developer extends Employee {
    void display() {
        id = 123;
        name = "Kamlesh";
        System.out.println(id);
        System.out.println(name);
    }
}

class Trainer extends Employee {
    void display() {
        id = 456;
        name = "XYZ";
        System.out.println(id);
        System.out.println(name);
    }
}

public class Base {

    public static void main(String[] args) {
        Trainer trainer = new Trainer();
        Developer developer = new Developer();
//        System.out.println("Trainer id no. "+trainer.id);
//        System.out.println("Developer "+developer.id);
        developer.display();
        trainer.display();
    }
}