 public class Anime implements Printable {
     private int age;
     private String name;
     private String warrior;

     public int getAge() {
         return age;
     }

     public String getName() {
         return name;
     }

     public String getWarrior() {
         return warrior;
     }

     public Anime(int age, String name, String warrior) {
         this.age = age;
         this.name = name;
         this.warrior = warrior;
     }

     @Override
     public void printable() {
         System.out.println("Age: " + getAge() + " Name: " + getName() + " Warrior: " + getWarrior());
     }
 }
