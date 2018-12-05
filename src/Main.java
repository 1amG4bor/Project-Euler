import projects.TaskService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskService service = TaskService.getInstance();
        Scanner input = new Scanner(System.in);
        int option = 0;

        System.out.println("\"Euler Project\"");
        System.out.println("---------------\n");
        System.out.println("This is the storage of my completed ' Euler Projects'!");
        System.out.println("The number of completed projects is currently: " + service.getNumberOfProjects());
        while (true) {
            System.out.print("\nChoose a number from '1' up to '" + service.getNumberOfProjects() + "'  OR '0' to EXIT: ");
            option = input.nextInt();
            if (option==0) break;
            service.getProject(option);
            System.out.println();
        }
        input.close();
        System.out.println("\n\n\t\t\t G o o d   b y e !\n\n");
    }
}
