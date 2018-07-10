package practice13;

import org.junit.Before;
import org.junit.Test;
import practice13.Klass;
import practice13.Person;
import practice13.Student;
import practice13.Teacher;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;

import static org.fest.assertions.api.Assertions.assertThat;

public class Practice13Test {
    private Klass klass2;
    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setup() {
        klass2 = new Klass(2);
        System.setOut(new PrintStream(outContent));
    }
    private String systemOut() {
        return outContent.toString();
    }

    @Test
    public void should_teacher_be_notified_when_student_join_any_classes_it_teaches() throws Exception {
        LinkedList<Klass> linkedList = new LinkedList<Klass>();
        linkedList.add(klass2);
        Teacher tom = new Teacher(1, "Tom", 21, linkedList);
        Computer com = new Computer("com",klass2);
        Student jerry = new Student(1, "Jerry", 8, new Klass(3));
        klass2.appendMember(jerry);
        assertThat(systemOut().endsWith("I am Tom. I know Jerry has joined Class 2.\nI am Computer. I know Jerry has joined Class 2.\n")).isTrue();
    }

    @Test
    public void should_teacher_be_notified_when_any_class_it_teaches_assigned_a_leader() throws Exception {
        LinkedList<Klass> linkedList = new LinkedList<Klass>();
        linkedList.add(klass2);
        Teacher tom = new Teacher(1, "Tom", 21, linkedList);
        Student jerry = new Student(1, "Jerry", 8, new Klass(3));
        Computer com = new Computer("com",klass2);
        klass2.appendMember(jerry);
        klass2.assignLeader(jerry);

        assertThat(systemOut().endsWith("I am Tom. I know Jerry has joined Class 2.\nI am Computer. I know Jerry has joined Class 2.\nI am Tom. I know Jerry become Leader of Class 2.\nI am Computer. I know Jerry become Leader of Class 2.\n")).isTrue();
    }


}
