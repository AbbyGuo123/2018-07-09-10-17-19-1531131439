package practice07;

public class Klass {
    int number;
    Klass(int number){
        this.number = number;
    }
    public String getDisplayName(){
        return "Class "+this.number;
    }

    public int getNumber() {
        return number;
    }
}
