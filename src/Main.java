//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int account = 200;
        int refill = 1001;
        int bonus = refill / 100;
        int newaccount = account + refill + bonus;
        int newaccount1 = account + refill;
        if (refill >= 1000) {
            System.out.println("Итоговая сумма на счету клиента " + newaccount + " рубля (ей)," + "  бонусы " + bonus + " рубля (ей)");
        } else {
            System.out.println("Итоговая сумма на счету клиента " + newaccount1 + " рубля (ей), " + " бонусы 0 рублей");
        }
        ;
    }
}