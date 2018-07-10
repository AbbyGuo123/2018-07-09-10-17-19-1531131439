package practice08;

public class Student extends Person{
    Klass klass;
    Student(int id,String name,int age ,Klass klass){
        super(id,name, age);
        this.klass = klass;
    }
    public String introduce(){
        if(this.klass.leader!=this)
            return super.basicIntroduce()+" I am a Student. I am at Class "+this.klass.number+".";
        return super.basicIntroduce()+" I am a Student. I am Leader of Class "+this.klass.number+".";
    }
    public Klass getKlass(){
        return this.klass;
    }
}
