public class Main {
    public static void main(String[] args) {

        int amountTicket = 15000; // стоимость билета
        int milePerAmount = 50; // стоимость мили

        int miles; // объявление переменной для количества миль
        if (amountTicket < 0) {
            System.out.println("Стоимость билета не может быть отрицательной!"); // проверка неверных входных данных
        } else {
            miles = amountTicket / milePerAmount; // подсчет кол-ва миль
            System.out.println("Ваше количество миль: " + miles + ". Спасибо за покупку!"); // вывод результата
    }
    }
}