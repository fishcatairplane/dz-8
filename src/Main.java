import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("1", "Veronika", "Dozhdzhanyk");
        Student student2 = new Student("2", "Yaroslav", "Vasylchenko");
        Student student3 = new Student("3", "Hanna", "Kuzina");
        Student student4 = new Student("4", "Dmytro", "Bat'kovich");

        Group group = new Group(student1);
        group.printGroupLeader();

        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.printStudents();

        group.setGroupLeader(student3);
        group.printGroupLeader();

        group.removeStudent(student1);
        group.printStudents();

        group.renameStudent(student3, "Anechka", "Motorna");
        group.printStudents();

        group.addTasksForGroup("Task 1");
        group.addTasksForGroup("Task 2");
        group.addTasksForGroup("Task 3");
        group.printTasks();

        group.setCompletedTaskStudents("Task 1", student1);
        group.setCompletedTaskStudents("Task 1", student2);
        group.setCompletedTaskStudents("Task 3", student3);
        group.printCompletedTaskStudents("Task 1");
        group.printCompletedTaskStudents("Task 3");
    }
}