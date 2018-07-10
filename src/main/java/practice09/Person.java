package practice09;

public class Person {
    int id;
    String name;
    int age;
    Person(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public String introduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }

    public String basicIntroduce(){
        return "My name is "+this.name+". I am "+this.age+" years old.";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            return ((Person)obj).id ==this.id;
        }
        return super.equals(obj);
    }
}
