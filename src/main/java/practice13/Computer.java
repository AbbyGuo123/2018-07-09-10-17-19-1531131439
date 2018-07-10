package practice13;

public class Computer implements OutPutListen {
    String name;
    Klass klass;
    Computer(String name,Klass klass){
        this.name = name;
        this.klass = klass;
        this.klass.addAgisterAppendListener(this);
        this.klass.addAgisterLeaderListener(this);
    }
    public String outputAppendlog(Student student){
        System.out.print("I am Computer. I know "+student.name+" has joined Class "+student.klass.number+".\n");
        return "I am Computer. I know "+student.name+" has joined Class "+student.klass.number+".\n";
    }
    public void outputLeaderlog(Student student){
        System.out.print("I am Computer. I know "+student.name+" become Leader of Class "+student.klass.number+".\n");
    }
}
