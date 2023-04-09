public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        task1();
        task2();
        task3();

    }


    private static void task3() {
        System.out.println(" Задача 3 ");
        String fullName = "Иванов Семён Семёнович";
        String rep = fullName.replace('ё', 'e');
        System.out.println(rep);
    }


    private static void task2() {
        System.out.println(" Задача 2 ");
        String firstName = "Ivan" ;
        String middleName = "Ivanovich";
        String lastName = "Ivanov" ;
        String fullName = String.format("Данные ФИО сотрудника для заполнения отчета — %s %s %s", lastName, firstName, middleName );
        System.out.println(fullName);

    }


    private static void task1() {
        System.out.println( "Задача 1");
        String firstName = "Ivan" ;
        String middleName = "Ivanovich";
        String lastName = "Ivanov" ;
        String fullName = "ФИО сотрудника —" + lastName + " " + firstName + " " + middleName;

        System.out.println(fullName);

    }



}