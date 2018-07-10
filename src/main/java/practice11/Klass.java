package practice11;

public class Klass {
    int number;
    Student leader;
    Teacher appendTeacher;
    Klass(int number){
        this.number = number;
    }
    public String getDisplayName(){
        return "Class "+this.number;
    }
    public void appendMember(Student student){
        student.klass = this;
        if(this.appendTeacher!=null)
            System.out.print("I am "+this.appendTeacher.name+". I know "+student.name+" has joined Class "+this.number+".\n");
    }
    public void assignLeader(Student student){
        if(student.klass.equals(this)) {
            this.leader = student;
            if(this.appendTeacher!=null)
                System.out.print("I am "+this.appendTeacher.name+". I know "+student.name+" become Leader of Class "+this.number+".\n");
        }
        else
            System.out.print("It is not one of us.\n");

    }
    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    //注册添加学生的监听事件
    public void addAgisterAppendTeacher(Teacher teacher){
        this.appendTeacher = teacher;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Klass){
            return ((Klass)obj).number ==this.number;
        }
        return super.equals(obj);
    }
}
