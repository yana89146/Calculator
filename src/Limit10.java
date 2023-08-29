// Класс с проверкой чисел от 1 до 10
public class Limit10 {
    static int a1;
    static int a2;
    static int a3;

    public Limit10(int a1, int a2, int a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public Limit10(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    public Limit10() {

    }

    public static Limit10 number2(int b1, int b2) throws Exception {

        if (Math.abs(b1) >= 0 && Math.abs(b1) <= 10 && Math.abs(b2) >= 0 && Math.abs(b2) <= 10) {
            a1 = b1;
            a2 = b2;
        } else {
            throw new Exception("ОШИБКА! число должно быть от 0 до 10");

        }
        return new Limit10(a1, a2);
    }

    public static Limit10 number3(int b1, int b2, int b3) throws Exception {

        if (Math.abs(b1) >= 0 && Math.abs(b1) <= 10 && Math.abs(b2) >= 0 && Math.abs(b2) <= 10 && Math.abs(b3) >= 0 && Math.abs(b3) <= 10) {
            a1 = b1;
            a2 = b2;
            a3 = b3;
        } else {
            throw new Exception("ОШИБКА! число должно быть от 0 до 10");
        }
        return new Limit10(a1, a2, a3);
    }
}
