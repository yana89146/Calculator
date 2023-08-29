// Класс с функцией выводящей строку в число
public class Nums {
    int num1;
    int num2;
    int num3;

    public Nums(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Nums(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public Nums() {

    }


    public static Nums limit2(String[] nums) {

        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[2]);

        return new Nums(num1, num2);

    }

    public static Nums limit3(String[] nums) {

        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[2]);
        int num3 = Integer.parseInt(nums[4]);

        return new Nums(num1, num2, num3);
    }


}
