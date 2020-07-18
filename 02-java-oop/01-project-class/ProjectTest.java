public class ProjectTest {
    public static void main(String[] args){
        Project project = new Project();
        project.setName("Project Pat");
        System.out.println("Name: " + project.getName());
        project.setDescription("25 Lighters on the Dresser");
        System.out.println("Description: " + project.getDescription());

        Project elevatorProject = new Project("Swang", "Pop, pop, my trunk");
        System.out.println("Name: " + elevatorProject.getName());
        System.out.println("Description: " + elevatorProject.getDescription());

        System.out.println(elevatorProject.elevatorPitch());
    }
}