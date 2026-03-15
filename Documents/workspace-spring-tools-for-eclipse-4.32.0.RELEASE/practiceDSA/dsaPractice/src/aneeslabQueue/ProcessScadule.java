package aneeslabQueue;

public class ProcessScadule {
    private Process[] queue;
    private int size;
    private int capacity;

    public ProcessScadule(int capacity) {
        this.capacity = capacity;
        queue = new Process[capacity];
        size = 0;
    }

    // Add process based on priority
    public void addProcess(Process process) {
        if (size == capacity) {
            System.out.println("Process queue is full!");
            return;
        }

        int i = size - 1;

        // Higher priority comes first
        while (i >= 0 && queue[i].getPriority() < process.getPriority()) {
            queue[i + 1] = queue[i];
            i--;
        }

        queue[i + 1] = process;
        size++;

        System.out.println("Process added successfully.");
    }

    // Execute highest priority process
    public void executeNextProcess() {
        if (size == 0) {
            System.out.println("No process to execute.");
            return;
        }

        Process executed = queue[0];
        System.out.println("Executing Process:");
        executed.display();

        // Shift remaining processes
        for (int i = 1; i < size; i++) {
            queue[i - 1] = queue[i];
        }

        size--;
    }

    // View pending processes
    public void viewPendingProcesses() {
        if (size == 0) {
            System.out.println("No pending processes.");
            return;
        }

        System.out.println("Pending Processes:");
        for (int i = 0; i < size; i++) {
            queue[i].display();
        }
    }
}
