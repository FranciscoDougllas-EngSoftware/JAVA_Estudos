public class utilizando_switch {
    public static void main(String[] args) {
        int month = 3;
        int day;

        switch(month){
            case 1:
                day = 31;
                System.out.println("Janeiro tem " + day + " dias.");
                break;
            case 2:
                day = 28;
                System.out.println("Fevereiro tem " + day + " dias.");
                break;
            case 3:
                day = 31;
                System.out.println("Março tem " + day + " dias.");
                break;
            case 4:
                day = 30;
                System.out.println("Abril tem " + day + " dias.");
                break;
            case 5:
                day = 31;
                System.out.println("Maio tem " + day + " dias.");
                break;
            case 6:
                day = 30;
                System.out.println("Junho tem " + day + " dias.");
                break;
            case 7:
                day = 31;
                System.out.println("Julho tem " + day + " dias.");
                break;
            case 8:
                day = 31;
                System.out.println("Agosto tem " + day + " dias.");
                break;
            case 9:
                day = 30;
                System.out.println("Setembro tem " + day + " dias.");
                break;
            case 10:
                day = 31;
                System.out.println("Outubro tem " + day + " dias.");
                break;
            case 11:
                day = 30;
                System.out.println("Novembro tem " + day + " dias.");
                break;
            case 12:
                day = 31;
                System.out.println("Dezembro tem " + day + " dias.");
                break;
        }
    }
}
