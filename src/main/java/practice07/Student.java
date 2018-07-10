package practice07;

public class Student extends Person{
    Klass klass;
    Student(String name,int age ,Klass klass){
        super(name, age);
        this.klass = klass;
    }
    public String introduce(){
        return super.basicIntroduce()+" I am a Student. I am at Class "+this.klass.number+".";
    }
    public Klass getKlass(){
        return this.klass;
    }
}
