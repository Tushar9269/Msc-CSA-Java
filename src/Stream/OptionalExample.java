package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        College college = new College();

        college.generateStudents();

//        college.getStudents().stream()
//                        .map(Student::getId)
//                        .toList()
//                        .forEach(System.out::println);
//        gives a null pointer exception if no students exist.


        List<Integer> list = Optional.ofNullable(college.getStudents())
                .orElse(new ArrayList<>())
                .stream().map(Student::getId)
                .toList();

        Optional<ArrayList<Student>> studentsOptional = Optional.ofNullable(college.getStudents());

        if(studentsOptional.isPresent()){
            studentsOptional.get().stream()
                    .toList().forEach(System.out::println);
        }

        studentsOptional.ifPresent(students -> {
            studentsOptional.get().stream()
                    .toList().forEach(System.out::println);
            System.out.println("Completed");
        });
    }
}
