abstract class Animals {
    public abstract void sound();
    
}
class Dog extends  Animals{
    public void sound(){
        System.out.println("Bark");
    }

}
class Cat extends Animals{
    public void sound(){
        System.out.println("Purr");
    }
}
class Cow extends Animals{
    public void sound(){
        System.out.println("Moo!!!");
    }
}

public class NewAnimals{
    public static void main(){
        Animals a1 = new Dog();
        a1.sound();
        Animals a2 = new Cat();
        a2.sound();
        Animals a3 = new Cow();
        a3.sound();
        
    }   
}