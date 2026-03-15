package aneeslabQueue;

public class Process {
    private String processName;
    private int priority;

    public Process(String processName, int priority) {
        this.processName = processName;
        this.priority = priority;
    }

    public String getProcessName() {
        return processName;
    }

    public int getPriority() {
        return priority;
    }

    public void display() {
        System.out.println("Process Name: " + processName + " | Priority: " + priority);
    }
}
