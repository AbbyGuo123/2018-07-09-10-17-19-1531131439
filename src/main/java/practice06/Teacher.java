package practice06;

public class Teacher extends Person {
    int klass;
    Teacher(String name,int age,int klass){
        super(name,age);
        this.klass = klass;
    }

    Teacher(String name,int age){
        super(name,age);
    }

    public String introduce(){
        if(this.klass!=0)
            return super.basicIntroduce()+" I am a Teacher. I teach Class "+this.klass+".";
        else
            return super.basicIntroduce()+" I am a Teacher. I teach No Class.";
    }

    public int getKlass() {
        return klass;
    }
}
