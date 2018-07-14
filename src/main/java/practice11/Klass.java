package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    int number;
    List<Student> students;
    Student leader;
    OutPutListen outPutListen;
    Klass(int number){
        this.number = number;
        students = new ArrayList<>();
    }
    public String getDisplayName(){
        return "Class "+this.number;
    }
    public void appendMember(Student student){
        student.klass = this;
        students.add(student);
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
