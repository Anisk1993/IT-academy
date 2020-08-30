package HomeWork12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainPlaner {


    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat s = new SimpleDateFormat("d-M-yyyy", Locale.ENGLISH);

        List<Planer> Tasks = new ArrayList<>();
        Planer Task;
        for (int i = 0; i < 10; i++) {

            System.out.print("Дата(в формате d-m-yyyy): ");
            String strdate = scanner.nextLine();
            Date date = s.parse(strdate);

            System.out.print("Задача: ");
            String TaskName = scanner.nextLine();

            System.out.print("Приоритет NON_URGENT - не срочное, URGENTLY - срочное: ");

            Task = new Planer(TaskName, date, PriorityEnum.valueOf(scanner.nextLine().toUpperCase()));

            Tasks.add(Task);


            System.out.println("Продолжить ввод задач? n - для выхода: ");
            String answer = scanner.nextLine();


            if (answer.toLowerCase().equals("n")) {
                break;
            }

        }
        Tasks.forEach(System.out::println);
        System.out.println();
        Tasks.sort(Comparator.comparing(Planer::getDate));

        Tasks.forEach(System.out::println);
        System.out.println("Редактирование задачи № ");

        Planer task = Tasks.get(scanner.nextInt());
        System.out.println("Новое название задачи: ");
        String newName = scanner.nextLine();
        task.setName(newName);

        System.out.println("Новая дата(в формате d-m-yyyy): ");
        String newDate = scanner.nextLine();
        Date newDateInDate = s.parse(newDate);
        task.setDate(newDateInDate);

        Tasks.forEach(System.out::println);

        System.out.println("Удаление задачи: ");
        Planer taskDelete = Tasks.get(scanner.nextInt());

        Tasks.remove(taskDelete);



    }

}
