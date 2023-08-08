import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        List<Integer> ints = new ArrayList<>(Arrays.asList(2,4,3,1,5));

        int[] arr = {1,3,4,5,2};

        Student st1 = new Student("Emirhan",24,"Male");
        Student st2 = new Student("Kubra",21,"Female");
        Student st3 = new Student("Necibe",21,"Female");
        Student st4 = new Student("Mehmet",27,"Male");
        Student st5 = new Student("Enis",26,"Male");
        Student st6 = new Student("Samet",25,"Male");
        Student st7 = new Student("Özkan",50,"Male");
        Student st8 = new Student("Cüneyt",23,"Male");


        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        students.add(st6);
        students.add(st7);
        students.add(st8);

        Arrays.sort(arr);
        System.out.println("Arrays.toString(Arrays.sort(arr)) = " + Arrays.toString(arr));

        Collections.sort(ints);
        System.out.println(ints);


        System.out.println(students);
        Collections.sort(students, new AgeComparator());
        System.out.println(students);

        students.stream().sorted(Comparator.comparing(Student::getAge)).forEach(System.out::println);
        students.stream().sorted(Comparator.comparing(Student::getAge).thenComparing(Student::getName)).forEach(System.out::println);


    }
}
