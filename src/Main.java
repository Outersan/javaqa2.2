public class Main {
    public static void main(String[] args) {

        int currentBalance = 100;
        int payment = 700;
        int bonusTrigger = 1000;
        boolean bonusCheck;
        int bonus;
        if (payment >= bonusTrigger) {
            bonusCheck = true;
            bonus = payment / 100;
        } else {
            bonusCheck = false;
            bonus = 0;
        }


        int finalBalance = currentBalance + payment + bonus;


        if (bonus > 1) {
            System.out.println("Клиент пополнил счёт на " + payment + " рублей - бонус равен " + bonus + " рублям, итоговая сумма на счету клиента - " + finalBalance + " рублей");
        } else {
            System.out.println("Клиент пополнил счёт на " + payment + " рублей - бонусов нет, итоговая сумма на счету клиента - " + finalBalance + " рублей");
        }
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете превысила ли
        // сумма пополнения порог и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}