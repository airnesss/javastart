package pl.sda.javastart.Queue;

public class Task {
    private String nameTask;
    private String descriptionTask;
    private String priority;

    public Task(String nameTask, String descriptionTask, Priority priority) {
        this.nameTask = nameTask;
        this.descriptionTask = descriptionTask;
     //   this.priority = priority;
    }

    public String getNameTask() {
        return nameTask;
    }

    public void setNameTask(String nameTask) {
        this.nameTask = nameTask;
    }

    public String getDescriptionTask() {
        return descriptionTask;
    }

    public void setDescriptionTask(String descriptionTask) {
        this.descriptionTask = descriptionTask;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return nameTask + "-" + descriptionTask;
    }

    public int compareTo(Task o) {
        return priority.compareTo(o.priority);
    }

    public enum Priority {
        HIGHT, MODERATE, LOW;
    }
}
