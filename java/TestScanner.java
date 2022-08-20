import java.util.Scanner;
/**
 * 測試獲得鍵盤輸入
 * @author lab
 * 
 */

 public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//System.in是IO流對象；
        System.out.println("請輸入名字：");
        String name = scanner.nextLine();//nextLine可以獲得輸入的這一行文字；
        System.out.println("請輸入你的愛好：");
        String favor = scanner.nextLine();
        System.out.println("請輸入你的年齡：");
        int age = scanner.nextInt();

        //打印輸入的內容
        System.out.println("====================");
        System.out.println("名字："+ name);
        System.out.println("愛好:"+ favor);
        System.out.println("年齡"+ age);
        System.out.println("====================");
    }
 }