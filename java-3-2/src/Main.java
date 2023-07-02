public class Main {
    public static void main(String[] args) {
        int startingBalance = 100; // начальная сумма на счету
        int addBalance = 300; // на какую сумму пополняем счет

        int bonus = 0; // количество бонусных рублей
        int resultBalance = startingBalance + addBalance; // итоговый баланс

        if (addBalance >= 1000) { // если на счет положили больше 1000р, то
            // рассчитываем бонусы (1 бонус за каждые 100 рублей)
            bonus = addBalance / 100;

            // добавляем бонусы к итоговому балансу
            resultBalance += bonus;
        }

        System.out.println("Итоговый баланс: " + resultBalance);
        System.out.println("Бонусные рубли: " + bonus);
    }
}