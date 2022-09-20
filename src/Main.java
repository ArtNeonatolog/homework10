public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    private static void task3() {
        System.out.println("Задание 3");
        String fullName = "Иванов Семён Семёнович";
        StringBuilder sb = new StringBuilder("Иванов Семён Семёнович");
        sb.setCharAt(10, 'е');
        sb.setCharAt(16, 'е');
        System.out.println("Данные ФИО сотрудника — " + sb);
        System.out.println();
    }
    private static void task2() {
        System.out.println("Задание 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        fullName = fullName.replace ("v", "V" );
        fullName = fullName.replace ("a", "A" );
        fullName = fullName.replace ("n", "N" );
        fullName = fullName.replace ("o", "O" );
        fullName = fullName.replace ("i", "I" );
        fullName = fullName.replace ("c", "C" );
        fullName = fullName.replace ("h", "H" );
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
