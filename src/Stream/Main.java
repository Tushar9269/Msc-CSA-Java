package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(101,"Tushar",21,"Male"));
        students.add(new Student(102,"Kevin",22,"Male"));
        students.add(new Student(103,"Chris",20,"Male"));
        students.add(new Student(104,"Amala",23,"Female"));
        students.add(new Student(101,"Shruthi",25,"Female"));

        students.stream()
                .filter(e->e.getGender().equals("Male"))
                .forEach(Student::printStudent);

        List<Integer> idMale = students.stream()
                .filter(e->e.getGender().equals("Male"))
                .map(Student::getId)
                .toList();

        System.out.println("\nId of Males: "+idMale);

        List<Integer> idFemale = students.stream()
                .filter(e->e.getGender().equals("Female"))
                .map(Student::getId)
                .toList();
        System.out.println("\nId of females: "+idFemale);

//        .distinct() - to display distinct values
//        .sorted() - sorts the list

        List<Integer> integers = List.of(1,2,3,4,5,6,7,8,9,10);
        integers.stream().map(e->e*e).forEach(System.out::println);

        Map<Integer, Integer> collect = integers.stream()
                .filter(e->e%2==0)
                .collect(Collectors.toMap(e->e, e->e*e));
        System.out.println(collect);

        Map<Integer,Integer> collect1 = integers.stream()
                .map(e->e*e)
                .collect(Collectors.toMap(e->e, e->e*e));
        System.out.println(collect1);

        Optional<Integer> reduce = integers.stream()
                .reduce((a,b)->a+b);
        System.out.println(reduce.get());

        integers.stream().sorted((a,b)->b-a).limit(5).forEach(System.out::println);
        integers.stream().skip(5).forEach(System.out::println);

//        consumers
        integers.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        }).limit(5).forEach(System.out::println);

    }
}
