package practice08;

public class Klass {
    int number;
    Student leader;
    Klass(int number){
        this.number = number;
    }
    public String getDisplayName(){
        return "Class "+this.number;
    }
    public void appendMember(Student student){
        student.klass = this;
    }
    public String assignLeader(Student student){
        if(student.klass==this)
            this.leader = student;
        else
            return "It is not one of us.";
        return "";
    }
    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }
}
