package practice09;

public class Teacher extends Person{
    Klass klass;
    Teacher(int id,String name,int age,Klass klass){
        super(id,name,age);
        this.klass = klass;
    }

    Teacher(int id,String name,int age){
        super(id,name,age);
    }

    public String introduce(){
        if(this.klass!=null)
            return super.basicIntroduce()+" I am a Teacher. I teach Class "+this.klass.number+".";
        else
            return super.basicIntroduce()+" I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student){
        if(student.klass.number==this.klass.number)
            return "My name is "+this.name+". I am "+this.age+" years old. I am a Teacher. I teach "+student.name+".";
        else
            return "My name is "+this.name+". I am "+this.age+" years old. I am a Teacher. I don't teach "+student.name+".";
    }


    public Klass getKlass() {
        return klass;
    }
}
