package workintech.s15d2.model.setchallenge;
import java.util.*;
public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTask;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks, Set<Task> carolsTasks, Set<Task> unassignedTask) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTask = unassignedTask;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getUnassignedTask() {
        return unassignedTask;
    }

    public Set<Task> getTasks(String taskOwner){
        if(taskOwner.equals("ann")){
            return annsTasks;
        }
        if(taskOwner.equals("bob")){
            return bobsTasks;
        }
        if(taskOwner.equals("carol")){
            return carolsTasks;
        }
        if(taskOwner.equals("all")){
            List<Set<Task>> taskList = new ArrayList<>();
            taskList.add(annsTasks);
            taskList.add(carolsTasks);
            taskList.add(bobsTasks);
            return getUnion(taskList);
        }
        return new HashSet<>();
    }

    private Set<Task> getUnion(List<Set<Task>> allTasks) {
        Set<Task> totals = new LinkedHashSet<>();
        for(Set<Task> tasks: allTasks){
            totals.addAll(tasks);
        }
        return totals;
    }

    public Set<Task> getIntersect(Set<Task> allTasks, Set<Task> task2){
        Set<Task> intersection = new HashSet<>(allTasks);
        intersection.retainAll(task2);
        return intersection;
    }

    public Set<Task> getDifference(Set<Task> allTasks, Set<Task> task2) {
        Set<Task> difference = new HashSet<>(allTasks);
        difference.removeAll(task2);
        return difference;
    }

    public Set<Task> getUnion(Set<Task>... taskList){
        return null;
    }

}
