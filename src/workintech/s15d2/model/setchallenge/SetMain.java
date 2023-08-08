package workintech.s15d2.model.setchallenge;

import java.util.*;

public class SetMain {
    public static void main(String[] args) {

        Task task1 = new Task("Java Collections", "Write List",
                "Ann", Priority.LOW, Status.ASSIGNED);
        Task task2 = new Task("Java Collections", "Write Set",
                "Bob", Priority.LOW, Status.ASSIGNED);
        Task task3 = new Task("Java Collections", "Write Set",
                "Carol", Priority.LOW, Status.ASSIGNED);
        Task task4 = new Task("Java Collections", "Write Map",
                "Bob", Priority.LOW, Status.ASSIGNED);
        Task task5 = new Task("Java Collections", "Write Set",
                "Ann", Priority.LOW, Status.ASSIGNED);
        Task task6 = new Task("Java Collections", "Write List in Set",
                "", Priority.MED, Status.IN_QUEUE);
        Task task7 = new Task("Java Collections", "Write ArrayList",
                "Bob", Priority.MED, Status.IN_QUEUE);

        Set<Task> totalTasks = new HashSet<>();
        totalTasks.add(task1);
        totalTasks.add(task2);
        totalTasks.add(task3);
        totalTasks.add(task4);
        totalTasks.add(task5);
        totalTasks.add(task6);

        Set<Task> annsTask = new LinkedHashSet<>();
        annsTask.add(task1);
        annsTask.add(task5);

        Set<Task> bobsTask = new LinkedHashSet<>();
        bobsTask.add(task2);
        bobsTask.add(task4);

        Set<Task> carolsTask = new LinkedHashSet<>();
        carolsTask.add(task3);
        carolsTask.add(task7);

        Set<Task> unassignedTasks = new HashSet<>();
        unassignedTasks.add(task6);

        TaskData taskData = new TaskData(annsTask, bobsTask, carolsTask, unassignedTasks);


        System.out.println("All tasks: ");
        System.out.println(taskData.getTasks("all"));
        System.out.println("***********************");

        System.out.println("Ann's task: ");
        System.out.println(taskData.getTasks("ann"));
        System.out.println("***********************");

        System.out.println("Bob's task: ");
        System.out.println(taskData.getTasks("bob"));
        System.out.println("***********************");

        System.out.println("Carol's task: ");
        System.out.println(taskData.getTasks("carol"));
        System.out.println("***********************");

        System.out.println("*******Ataması yapılmamış tasklar*********");

        System.out.println(taskData.getDifference(totalTasks, taskData.getTasks("all")));

        System.out.println("*******Birden fazla çalışana atanmış tasklar*********");

        System.out.println("Ann + Carol: " + taskData.getIntersect(annsTask, carolsTask));
        System.out.println("Bob + Carol: " + taskData.getIntersect(bobsTask, carolsTask));
        System.out.println("Ann + Bob: " + taskData.getIntersect(annsTask, bobsTask));

    }
}
