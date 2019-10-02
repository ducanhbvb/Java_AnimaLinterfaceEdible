        public class AbstractAndInterfaceTests {
            public static void main(String[] args) {
                Animal[] animals = new Animal[2];
                animals[0] = new Tiger();
                animals[1] = new Chicken();
                for (Animal animal : animals) {
                    System.out.println(animal.makeSound());
                }
                Animal animal=new Tiger();
                Tiger animal1=(Tiger)animal;
                double abc=1.0d;
                int abc1=(int)abc;
                System.out.println(animal1.abc());
            }
        }