package practice09;

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
    public void assignLeader(Student student){
        if(student.klass.equals(this))
            this.leader = student;
        else
            System.out.print("It is not one of us.\n");

    }
    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Klass){
            return ((Klass)obj).number ==this.number;
        }
        return super.equals(obj);
    }
}
