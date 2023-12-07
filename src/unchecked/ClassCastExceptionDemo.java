package unchecked;
/**
 * ClassCastException : <br>
 * &emsp;&emsp;
 * ClassCast Exception in Java is one of the unchecked exceptions that occur when we try to
 * convert one class type object into another class type.
 * */

public class ClassCastExceptionDemo {

    public static void run() {

        try{
            Dog dog = new Dog();
            dog.walk();

            Animal dog1 = new Dog();
//            dog.speak(); // It is not possible.

            Dog newDog = (Dog)dog1;
            dog.speak();

            Animal animal =  new Animal();
            animal.walk();
            Dog dog2 = (Dog)animal; // ClassCastException occur in this line.
            dog2.speak();
        }
        catch(ClassCastException e){

            System.out.println("Perant can not convert into child..");
        }
    }
}
