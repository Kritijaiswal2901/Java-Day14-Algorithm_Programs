import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Task {
    int deadline;
    int duration;

    public Task(int deadline, int duration) {
        this.deadline = deadline;
        this.duration = duration;
    }
}

public class Problem_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tasks: ");
        int n = scanner.nextInt();

        Task[] tasks = new Task[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the deadline and duration for task " + (i + 1) + ": ");
            int deadline = scanner.nextInt();
            int duration = scanner.nextInt();
            tasks[i] = new Task(deadline, duration);
        }

        Arrays.sort(tasks, Comparator.comparingInt(task -> task.deadline));

        int[] completionTimes = new int[n];
        completionTimes[0] = tasks[0].duration;

        for (int i = 1; i < n; i++) {
            completionTimes[i] = completionTimes[i - 1] + tasks[i].duration;
        }

        int[] overshoots = new int[n];
        for (int i = 0; i < n; i++) {
            overshoots[i] = Math.max(0, completionTimes[i] - tasks[i].deadline);
        }

        System.out.println("Maximum overshoots for each task:");
        for (int i = 0; i < n; i++) {
            System.out.println(overshoots[i]);
        }

        scanner.close();
    }
}

