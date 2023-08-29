//создать массив из строки
public class CreateArray {


    //    конструктор
    public CreateArray() {


    }

    public static String[] action(String line) throws Exception {
        String[] newArray = new String[0];
        int ArrayLength = line.length();
        if (ArrayLength >= 3) {
            String[] data = line.split("[+-\\/*]+");
            String[] chars = line.split("[0-9]+");


            if (data.length == 3 && chars.length == 2) {
                if (data[0].isEmpty() && chars[0].equals("-")) {

                    String a1 = "-" + data[1];
                    String a2 = chars[1];
                    String a3 = data[2];
                    newArray = new String[]{a1, a2, a3};

                }

            } else if (data.length == 2 && chars.length == 2) {

                String a1 = data[0];
                String a2 = chars[1];
                String a3 = data[1];
                newArray = new String[]{a1, a2, a3};
            } else if (data.length == 3 && chars.length == 3) {

                String a1 = data[0];
                String a2 = chars[1];
                String a3 = data[1];
                String a4 = chars[2];
                String a5 = data[2];
                newArray = new String[]{a1, a2, a3, a4, a5};
            } else if (data.length == 4 && chars.length == 3 && data[0].isEmpty() && chars[0].equals("-")) {

                String a1 = "-" + data[1];
                String a2 = chars[1];
                String a3 = data[2];
                String a4 = chars[2];
                String a5 = data[3];
                newArray = new String[]{a1, a2, a3, a4, a5};
            } else {
                throw new Exception("СЛИШКОМ МНОГО ИЛИ МАЛО ДЕЙСТВИЙ");

            }

        }

        return newArray;
    }


}
