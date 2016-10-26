/**
 * Created by BFD-308 on 2016/10/26.
 */
public class M_OO {
    public class Animal {
        public Animal() {
           System.out.println(123);
        }
        public Animal(int arg) {
            System.out.println(arg);
        }
    }

    public class Cat extends Animal {
        public Cat() {
//            default invoke:
//            super();
            System.out.println(456);
        }
        public Cat(int arg) {
//            default invoke:
//            super();
            System.out.println(arg);
        }
    }

    public class Dog extends Animal {
        public Dog() {
            super(812);
            System.out.println(789);
        }
        public Dog(int arg) {
            super(612);
            System.out.println(arg);
        }
    }

    public void run() {
        // output: 123 456
        Cat cat = new Cat();
        // output: 123 1024
        Cat cat1 = new Cat(1024);
        // output: 812 789
        Dog dog = new Dog();
        // output: 612 2048
        Dog dog1 = new Dog(2048);
    }

    public static void main(String[] arg) {
        M_OO m_oo = new M_OO();
        m_oo.run();
    }
}
