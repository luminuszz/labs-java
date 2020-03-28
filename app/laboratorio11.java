package app;

import java.util.Scanner;

public class laboratorio11 {
  public static void main(final String[] args) throws Exception {
    Scanner learn = new Scanner(System.in);
    int v1, v2, v3, local;
    System.out.println("Iforme os valores");
    v1 = learn.nextInt();
    v2 = learn.nextInt();
    v3 = learn.nextInt();
    learn.close();
    local = v3;
    if (v1 > local) {
      local = v1;
    }

    if (v2 > local) {
      local = v2;
    }

    System.out.println("O número maior é:"+ local);
    local = v3;
    if (v1 < local) {
      local = v1;
    }

    if (v2 < local) {
      local = v2;
    }
    System.out.println("O número menor é:" + local);
  }
}
