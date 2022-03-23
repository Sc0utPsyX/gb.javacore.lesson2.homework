public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println(CheckSum(5,15)); // вывод булевой переменной для проверки первого задания
        PosOrNegNumber(-10);
        System.out.println(CheckNumber(1)); // вывод метода для проверки третьего задания
        PrintStrings("Тестовый текст для печати", 2);
        System.out.println(LeapYear(1900)); // вывод булевой переменной для проверки пятого задания
    }

    public static boolean CheckSum(int first, int second){
        boolean a = (first + second)>10 && (first + second)<=20; // в условиях было указано что только 20 включительно
        return a;
    }

    public static void PosOrNegNumber(int number){
        System.out.println((number >= 0) ? "Число положительное" : "Число отрицательное");
    }

    public static boolean CheckNumber(int number){
        return number<0; // ноль считаю положительным числом
    }

    public static void PrintStrings(String text, int i){
        for (int j = 0; j < i; j++) {
            System.out.println(text);
        }
    }

    public static boolean LeapYear(int Year){
        return (Year % 400 == 0) ? true : (Year % 100 == 0) ? false : Year % 4 == 0;
        // тут как просили в одну строчку!
    }

}


