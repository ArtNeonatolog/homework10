public class Main {
    public static void main(String[] args) {
        task1();
        task2a();
        task2b();
        task3a();
        task3b();
    }
    private static void task3b() {
        System.out.println("Задание 3 - вариант 2");
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }
    private static void task3a() {
        System.out.println("Задание 3 - вариант 1");
        String fullName = "Иванов Семён Семёнович";
        StringBuilder fullName1 = new StringBuilder("Иванов Семён Семёнович");
        fullName1.setCharAt(10, 'е');
        fullName1.setCharAt(16, 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName1);
        System.out.println();
    }
    private static void task2b() {
        System.out.println("Задание 2 - 2 вариант решения");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        String fullName1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);
        System.out.println();
    }
    private static void task2a() {
        System.out.println("Задание 2 - 1 вариант решения");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace ("Ivanov Ivan Ivanovich", "IVANOV IVAN IVANOVICH" );
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
        System.out.println();
    }
    private static void task1() {
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
        System.out.println();
    }
}