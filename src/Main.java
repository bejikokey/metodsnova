public class Main {

    public static void isYearLeap (int leapYear) {
        if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
            System.out.println(leapYear + " yes, true");
        } else {
            System.out.println(leapYear + " no, false");
        }
    }

    public static void whatWeNeed (int phone, int ourYear ) {
       if (phone == 1 && ourYear >=2015) {
           System.out.println("Установите версию для вашего Iphone по ссылке");
       } else if (phone == 1 && ourYear <2015){
           System.out.println("Установите lite версию для вашего Iphone по ссылке");
       } else if (phone == 0 && ourYear >=2015) {
           System.out.println("Установите версию для вашего Android по ссылке");
       } else if (phone == 0 && ourYear < 2015){
           System.out.println("Установите lite версию для вашего Android по ссылке");
        }

    }
    public static void deliveryDays (int distance) {
        if (distance <= 20) {
            System.out.println("Доставка будет в течение 1 дня");
        }
        else if (distance >20 && distance <=60) {
            System.out.println("Доставка будет в течение 2-х дней");
        } else if (distance >60 && distance <=100) {
            System.out.println("Доставка будет в течение 3-х дней");
        }
    }

    public static void main(String[] args) {
            int thisYear = 1553;
        isYearLeap(thisYear);

        int clientOS = 0;
        int currentYear = 2018;
        whatWeNeed(clientOS, currentYear);

        int deliveryDistance = 95;
        deliveryDays(deliveryDistance);

        }


    }
