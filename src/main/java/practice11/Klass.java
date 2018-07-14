package practice11;

public class Klass {
    int number;
    Student leader;
    OutPutListen outPutListen;
    Klass(int number){
        this.number = number;
    }
    public String getDisplayName(){
        return "Class "+this.number;
    }
    public void appendMember(Student student){
        student.klass = this;
        if(this.outPutListen!=null)
        this.outPutListen.outAppendListen(student);
    }
    public void assignLeader(Student student){
        if(student.klass.equals(this)) {
            this.leader = student;
            if(this.outPutListen!=null)
                this.outPutListen.outLeaderListen(student);

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
        this.outPutListen = teacher;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Klass){
            return ((Klass)obj).number ==this.number;
        }
        return super.equals(obj);
    }
}
