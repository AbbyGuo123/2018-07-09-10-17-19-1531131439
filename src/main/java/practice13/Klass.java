package practice13;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    int number;
    Student leader;
    List<OutPutListen> outPutListens = new ArrayList<>();
    List<OutPutListen> outPutLeaderListens = new ArrayList<>();
    Klass(int number){
        this.number = number;
    }
    public String getDisplayName(){
        return "Class "+this.number;
    }
    public void appendMember(Student student){
        student.klass = this;
        for(int i=0;i<this.outPutListens.size();i++){
            this.outPutListens.get(i).outputAppendlog(student);
        }
    }
    public void assignLeader(Student student){
        if(student.klass.equals(this)) {
            this.leader = student;
            for(int i=0;i<this.outPutLeaderListens.size();i++){
                this.outPutLeaderListens.get(i).outputLeaderlog(student);
            }

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
    public void addAgisterAppendListener(OutPutListen outPutListen){
        outPutListens.add(outPutListen);
    }

    //注册添加学生的监听事件
    public void addAgisterLeaderListener(OutPutListen outPutListen){
        outPutLeaderListens.add(outPutListen);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Klass){
            return ((Klass)obj).number ==this.number;
        }
        return super.equals(obj);
    }
}
