package club.banyuan;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

public class reflect {

  public static void printInfo(Object object) {
    Class aClass = object.getClass();
    Method[] methods = aClass.getMethods();
    Sort(methods, methods.length);

    Field[] field = aClass.getFields();
    Sort(field, field.length);

    for (Method m : methods) {
      System.out.println(m);
    }
    for (Field m : field) {
      System.out.println(m);
    }

  }

  private static <T extends Member> T[] Sort(T[] parameter, int n) {
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j + 1 < n - i; j++) {
        char[] temp1 = parameter[j].getName().toCharArray();
        char[] temp2 = parameter[j + 1].getName().toCharArray();
        if (String.valueOf(temp1[0]).compareTo(String.valueOf(temp2[0])) > 0) {
          T temp;
          temp = parameter[j];
          parameter[j] = parameter[j + 1];
          parameter[j + 1] = temp;
        }
      }
    }
    return parameter;
  }


  public static void main(String[] args) {
    printInfo(0);
  }
}
