import java.util.Objects;

// Класс который считает ДВА числа
public class ForTwo {
    String[] data;
    float res;

    public ForTwo(String[] data) {
        this.data = data;
    }

    public float action()throws Exception {

        if (data[1].equals("+")) {
            res = Float.parseFloat(data[0]) + Float.parseFloat(data[2]);
        }
        else if (data[1].equals("-")) {
            res = Float.parseFloat(data[0]) - Float.parseFloat(data[2]);
        }
        else if (data[1].equals("*")) {
            res = Float.parseFloat(data[0]) * Float.parseFloat(data[2]);
        }
       else if (data[1].equals("/")) {
            res = Float.parseFloat(data[0]) / Float.parseFloat(data[2]);
        }
       else{
           throw new Exception("НЕТ ЗНАКА: +,-,/ или *");
        }


        return res;
    }

}
