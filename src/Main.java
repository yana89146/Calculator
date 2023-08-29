
import java.util.Scanner;



public class Main {


    public static void main(String[] args) throws Exception {

// Создать do while для бесконечного цикла:
        int i=0;

        do{

 //       1. Читать пример:
            Scanner scanner = new Scanner(System.in);
            System.out.println("напишите пример:");
            String line = scanner.nextLine();
//        2. проверить на неправильные знаки
      Mistakes MisExample=new Mistakes(line);
      String newline=MisExample.check();


//       3. создать массив
        CreateArray createArrayEx=new CreateArray();
         String[] array=createArrayEx.action(newline);


//         4. раздилить на 2 и 3 слагаемых
//        4.1 ПЕРВЫЙ ВАРИАНТ: ЕСЛИ ДВА ЧИСЛА
        if(array.length==3) {


//  1) получить числа из массива при двух числах
            Nums nums = new Nums();
            Nums newnums=nums.limit2(array);
            int number1=newnums.num1;
            int number2=newnums.num2;

//  2) проверить от 0 до 10 при двух числах
            Limit10 limit=new Limit10();
            Limit10 limitEx=limit.number2(number1,number2);
            int checkedNum1=limitEx.a1;
            int checkedNum2=limitEx.a2;


//       3)  посчитать два числа
            ForTwo forTwoExample=new ForTwo(array);
            float result=forTwoExample.action();
            System.out.println("ОТВЕТ: "+result);
        }



//       4.2 ВТОРОЙ ВАРИАНТ :ЕСЛИ ТРИ ЧИСЛА
        else if(array.length==5) {

//  1) получили числа из массива при трех числах
            Nums nums = new Nums();
            Nums newnums= nums.limit3(array);
            int number1=newnums.num1;
            int number2=newnums.num2;
            int number3=newnums.num3;


//  2) проверили от 0 до 10 при трех числах

            Limit10 limit=new Limit10();
            Limit10 limitEx=limit.number3(number1,number2,number3);
            int checkedNum1=limitEx.a1;
            int checkedNum2=limitEx.a2;
            int checkedNum3=limitEx.a3;



//      3) посчитать три числа
            ForThree forThreeExample=new ForThree(array);
            float result=forThreeExample.step2();
            System.out.println("ОТВЕТ: "+result);

        }
        else{
        throw new Exception("НЕПРАВИЛЬНОЕ УРАВНЕНИЕ");
         }


       }while (i!=1);
    }


}






