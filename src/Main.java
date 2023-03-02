public class Main {
    public static void main(String[] args) {

        int point = 600;
        int add = 1450;
        int bonus;

        if (add > 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }

        int summaryaccount = point + add + bonus;
        System.out.println("Итоговый счёт:" + summaryaccount);
        System.out.println("Бонус:" + bonus);
    }
}