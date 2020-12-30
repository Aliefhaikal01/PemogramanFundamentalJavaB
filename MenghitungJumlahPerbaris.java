import java.util.Scanner;

public class MenghitungJumlahPerbaris {
  public static void main(String[] args) {
    int i, j, m, n;
    int kubus[][] = new int[10][10];
    int hasil[][] = new int[10][10];
    Scanner scan = new Scanner(System.in);
    m = 5;
    n = 5;
    for (i = 0; i < m; i++) {
      for (j = 0; j < n; j++) {
        kubus[i][j] = scan.nextInt();
      }
    }
    System.out.println(kubus[0][0] + kubus[0][1] + kubus[0][2] + kubus[0][3] + kubus[0][4]);
    System.out.println(kubus[1][0] + kubus[1][1] + kubus[1][2] + kubus[1][3] + kubus[1][4]);
    System.out.println(kubus[2][0] + kubus[2][1] + kubus[2][2] + kubus[2][3] + kubus[2][4]);
    System.out.println(kubus[3][0] + kubus[3][1] + kubus[3][2] + kubus[3][3] + kubus[3][4]);
    System.out.println(kubus[4][0] + kubus[4][1] + kubus[4][2] + kubus[4][3] + kubus[4][4]);
  }
}