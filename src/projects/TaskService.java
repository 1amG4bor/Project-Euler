package projects;

public class TaskService {
    private static TaskService instance = new TaskService();
    private int numberOfProjects = 0;

    private TaskService() {
        this.numberOfProjects += ProjectsTo10.getInstance().getSize();
        this.numberOfProjects += ProjectsTo20.getInstance().getSize();
    }

    public static TaskService getInstance() {
        return instance;
    }

    public int getNumberOfProjects() {
        return numberOfProjects;
    }


    public void getProject(int option) {
        int getClass = (option-1) / 10;
        switch (getClass) {
            case 0:
                ProjectsTo10.getInstance().getProject(option);
                break;
            case 1:
                ProjectsTo20.getInstance().getProject(option);
                break;
        }
    }
}
