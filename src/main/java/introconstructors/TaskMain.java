package introconstructors;

public class TaskMain {

    public static void main(String[] args) {
      Task task = new Task("Flowers plant", "Spring plant planting");

        System.out.println("Title:"+task.getTitle());
        System.out.println("Description:"+task.getDescription());

        task.start();
        task.setDuration(90);

        System.out.println("Started at"
             +task.getStartDataTime()
              +"and took"
              +task.getDuration()
              +"minutes to finish");
    }
}
