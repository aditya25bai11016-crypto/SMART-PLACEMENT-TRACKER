import java.util.ArrayList;

public class Subject {

    private String name;
    private ArrayList<String> topics;
    private ArrayList<Boolean> completed;

    // Constructor
    public Subject(String name) {
        this.name = name;
        this.topics = new ArrayList<>();
        this.completed = new ArrayList<>();
    }

    // Add a topic
    public void addTopic(String topic) {
        topics.add(topic);
        completed.add(false);
    }

    // Mark topic as completed
    public boolean markTopicCompleted(int topicNumber) {

        if (topicNumber < 1 || topicNumber > topics.size()) {
            return false;
        }

        completed.set(topicNumber - 1, true);
        return true;
    }

    // Calculate progress percentage
    public double getProgress() {

        if (topics.isEmpty()) {
            return 0;
        }

        int completedTopics = 0;

        for (boolean status : completed) {
            if (status) {
                completedTopics++;
            }
        }

        return ((double) completedTopics / topics.size()) * 100;
    }

    // Display subject and topics
    public void displaySubject() {

        System.out.println("\nSubject: " + name);

        if (topics.isEmpty()) {
            System.out.println("No topics added.");
            return;
        }

        for (int i = 0; i < topics.size(); i++) {

            String status;

            if (completed.get(i)) {
                status = "Completed";
            } else {
                status = "Pending";
            }

            System.out.println(
                    (i + 1) + ". " + topics.get(i) + " - " + status
            );
        }

        System.out.printf("Progress: %.1f%%\n", getProgress());
    }

    // Get subject name
    public String getName() {
        return name;
    }
}