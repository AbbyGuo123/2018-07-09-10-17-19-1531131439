package practice13;

import java.util.LinkedList;

public class test {
    public static void main(String[] args){
        Klass klass2 = new Klass(2);
        LinkedList<Klass> linkedList = new LinkedList<Klass>();
        linkedList.add(klass2);
        Teacher tom = new Teacher(1, "Tom", 21, linkedList);
        Student jerry = new Student(1, "Jerry", 8, new Klass(3));
        Computer com = new Computer("com",klass2);
        klass2.appendMember(jerry);
        klass2.assignLeader(jerry);

        System.out.print("\nI am Tom. I know Jerry has joined Class 2.\nI am Computer. I know Jerry has joined Class 2.\nI am Tom. I know Jerry become Leader of Class 2.\nI am Computer. I know Jerry become Leader of Class 2.\n");
    }
}
