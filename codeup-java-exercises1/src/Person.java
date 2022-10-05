public class Person {
private String Name;
public Person(String Name) {
    this.Name = Name;
}


    public String getName(){
//TODO: return the person's name
return this.Name;

    };

    public void setName(String Name){
//TODO: change the name field to the passed value
this.Name = Name;

    };
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.printf("Hello, my name is " + this.Name) ;

    };

    public static void main(String[] args) {

            Person bob = new Person("Bob");
            System.out.println("bob's name = " + bob.getName());
            bob.setName("Nick\n");
            bob.sayHello();

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        }


}
