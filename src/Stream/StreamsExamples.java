package Stream;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Comparator.comparing;
import java.util.List;
import static java.util.stream.Collectors.toList;
public class StreamsExamples {
    public static void main(String[] args) {
        List<String> listofstudents = new ArrayList<>();
        listofstudents.add("Eric");
        listofstudents.add("Ethan");
        listofstudents.add("Carrie");
        listofstudents.add("Long");
        listofstudents.add("Tree");
        listofstudents.add("Van");
        listofstudents.add("Jack");
        listofstudents.add("Howard");
        listofstudents.add("Julia");
        listofstudents.add("Jason");
        List<String> listStu1= listofstudents.stream().filter(d-> d.contains("E")||d.contains("e")).collect(toList());
        List<String> listStu2= listofstudents.stream().sorted(comparing(String::length)).collect(toList());
        for (String stu:listStu2){System.out.println(stu);}
    }
}