package workintech.s15d2.model.setchallenge;

import java.util.Objects;

public class Task {
    private String project;
    private String assignee;
    private String description;

    private Priority priority;
    private Status status;

    public Task(String project, String assignee, String description, Priority priority, Status status) {
        this.project = project;
        this.assignee = assignee;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    public String getProject() {
        return project;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getDescription() {
        return description;
    }

    public Priority getPriority() {
        return priority;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return project.equals(task.project) && description.equals(task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(project, description);
    }

    @Override
    public String toString() {
        return "Task{" +
                "project='" + project + '\'' +
                ", assignee='" + assignee + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                ", status=" + status +
                '}';
    }
}
