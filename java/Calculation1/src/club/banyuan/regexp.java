package club.banyuan;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.function.DoublePredicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexp {

  public static void main(String[] args) {
    double result = 0;
    boolean flag = true;
    //String inputRegexp="(\\d+(\\.\\d+)?)(\\[\\+-\\\\*/%])(^\\d+(\\.\\d+)?$ )";
    String inputRegexp = "(\\d+(\\.\\d+)?)([+\\-*/%])(\\d+(\\.\\d+)?)";
    Pattern pattern = Pattern.compile(inputRegexp);
    while (flag) {
      System.out.println("请输入表达式：");
      Scanner scan = new Scanner(System.in);
      String line = scan.nextLine();
      Matcher matcher = pattern.matcher(line);
      if (matcher.find()) {
//        System.out.println(matcher.group());
//        System.out.println(matcher.group(1));
//        System.out.println(matcher.group(2));
//        System.out.println(matcher.group(3));
//        System.out.println(matcher.group(4));
//        System.out.println(matcher.group(5));
        switch (matcher.group(3)) {
          case "+":
            //result = new BigDecimal(matcher.group(1)) + new BigDecimal(matcher.group(4));
            result = Double.parseDouble(matcher.group(1)) + Double.parseDouble(matcher.group(4));
            break;
          case "-":
            result = Double.parseDouble(matcher.group(1)) - Double.parseDouble(matcher.group(4));
            break;
          case "*":
            result = Double.parseDouble(matcher.group(1)) * Double.parseDouble(matcher.group(4));
            break;
          case "/":
            try {
              result = Double.parseDouble(matcher.group(1)) / Double.parseDouble(matcher.group(4));
            } catch (Exception e) {
              e.getStackTrace();
            }
            break;
          case "%":
            result = Double.parseDouble(matcher.group(1)) % Double.parseDouble(matcher.group(4));
            break;
          default:
            System.out.println("输入不合法，请重新输入：");
            break;

        }
        System.out.println(BigDecimal.valueOf(result));
      } else if ("quit".equals(line)) {
        flag = false;
      } else {

        System.out.println("输入不合法，请重新输入");

      }

    }
  }


}
