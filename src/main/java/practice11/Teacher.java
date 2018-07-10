package practice11;

import java.util.LinkedList;

public class Teacher extends Person{
    LinkedList<Klass> klass;
    Teacher(int id,String name,int age,LinkedList<Klass> klass){
        super(id,name,age);
        this.klass = new LinkedList<Klass>();
        for(int i=0;i<klass.size();i++) {
            this.klass.add(klass.get(i));
            this.klass.get(i).addAgisterAppendTeacher(this);
        }

    }

    Teacher(int id,String name,int age){
        super(id,name,age);
    }

    public String introduce(){
        String klassesToString="";
        if(this.klass!=null){
            for(int i=0;i<this.klass.size();i++){
                klassesToString += this.klass.get(i).number+", ";
            }
            klassesToString = klassesToString.substring(0,klassesToString.length()-2);
            return super.basicIntroduce()+" I am a Teacher. I teach Class "+klassesToString+".";
        }

        return super.basicIntroduce()+" I am a Teacher. I teach No Class.";
    }

    public String introduceWith(Student student){
        for(int i=0;i<this.klass.size();i++) {
            if (student.klass.number == this.klass.get(i).number)
                return "My name is " + this.name + ". I am " + this.age + " years old. I am a Teacher. I teach " + student.name + ".";
        }
        return "My name is "+this.name+". I am "+this.age+" years old. I am a Teacher. I don't teach "+student.name+".";
    }
    public boolean isTeaching(Student student){
        for(int i=0;i<this.klass.size();i++){
            if(this.klass.get(i).equals(student.klass))
                return true;
        }
        return false;
    }


    public LinkedList<Klass> getClasses() {
        return klass;
    }

}
