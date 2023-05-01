import java.util.*;

public class Group {
    private Student groupLeader;
    private final ArrayList<Student> students;
    private final ArrayList<String> tasksForGroup;
    private final Map<String,ArrayList<Student>> completedTaskStudents;


    public Group(Student groupLeader) {
        this.groupLeader = groupLeader;
        this.students = new ArrayList<Student>();
        this.tasksForGroup = new ArrayList<String>();
        this.completedTaskStudents = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void renameStudent(Student student, String newName, String newLastName) {
        student.setFirstName(newName);
        student.setLastName(newLastName);
    }

    public void setGroupLeader(Student groupLeader) {
        this.groupLeader = groupLeader;
    }

    public void addTasksForGroup(String task) {
        this.tasksForGroup.add(task);
        this.completedTaskStudents.put(task, new ArrayList<Student>());
    }

    public void setCompletedTaskStudents(String task, Student student) {
        ArrayList<Student> studentsList = this.completedTaskStudents.get(task);
        studentsList.add(student);
    }

    public void printGroupLeader() {
        System.out.println("Group leader: " + groupLeader.getFirstName() + " " + groupLeader.getLastName());
    }

    public void printStudents() {
        System.out.println("Students in the group:");
        for (Student student : this.students) {
            System.out.println("- " + student.getFirstName() + " " + student.getLastName());
        }
    }

    public void printTasks() {
        System.out.println("Tasks for the group:");
        for (String task : tasksForGroup) {
            System.out.println("- " + task);
        }
    }
    public void printCompletedTaskStudents(String task) {
        System.out.println("Students which completed " + task + ":");
        for (Student student : this.completedTaskStudents.get(task)) {
            System.out.println("- " + student.getFirstName() + " " + student.getLastName());
        }
    }
}
