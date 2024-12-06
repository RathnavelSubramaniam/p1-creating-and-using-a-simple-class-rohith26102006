class person
{
    String firstName;
    String lastName;
    int age;

    public person()
    {
        firstName= "";
        lastName= "";
        age=0;
    }
     public person(String firstName, String lastName,int age)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
     String getFullName() {
     return firstName + "" + lastName;
    }
}
    public class Practical1
    {
    public static void main(String[] args)
    {
        person person1 =new person("John", "Doe", 30);
        person person2 =new person("Alice", "Smith",25);
        System.out.println("person 1:" + person1.getFullName());
        System.out.println("person 2:" + person2.getFullName());
        double averageAge=(person1.age+ person2.age) / 2.0;
        System.out.println("Average Age: " + averageAge);
    }
}

