import java.util.regex.Matcher;
import java.util.regex.Pattern;

//класс который проверяет массив на неправильные знаки
public class Mistakes {
    String line;
    String newline;


    public Mistakes(String line) {

        this.line = line;
    }


    String check() throws Exception {

        Pattern pattern1 = Pattern.compile("^[0-9-]+[+-\\/*]{1}+[0-9]*$");
        Matcher matcher1 = pattern1.matcher(line);
        boolean matches1 = matcher1.matches();


        if (matches1 == true) {
            String[] oper = {"+", "-", "/", "*"};
            for (int i = 0; i < oper.length; i++) {
                boolean isExist;
                if (isExist = line.endsWith(oper[i])) {
                    throw new Exception(" В КОНЦЕ НЕПРАВИЛЬНЫЙ СИМВОЛ");
                } else {
                    newline = line;
                }
            }
        } else {
            Pattern pattern2 = Pattern.compile("^[0-9-]*+[+-\\/*]{1}+[0-9]*+[+-\\/*]{1}+[0-9]*$");
            Matcher matcher2 = pattern2.matcher(line);
            boolean matches2 = matcher2.matches();


            if (matches2 == true) {
                String[] oper = {"+", "-", "/", "*"};

                for (int i = 0; i < oper.length; i++) {
                    boolean isExist;
                    if (isExist = line.endsWith(oper[i])) {
                        throw new Exception("В КОНЦЕ НЕПРАВИЛЬНЫЙ СИМВОЛ");
                    } else {
                        newline = line;
                    }
                }
            } else {
                throw new Exception("НЕПРАВИЛЬНОЕ КОЛИЧЕСТВО СИМВОЛОВ");
            }
        }


        return newline;

    }
}
