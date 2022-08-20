package Number;

        // 1、文件名必須和類名相同；
        // 2、Java是區分大小寫的；
        // 3、包聲明一個Java應用程序是由若干個類組成的；

public class First {
    static String s1 = "你好";  
        //class類體中的主方法 ：public是main方法的權限修飾符、static是main方法的靜態修飾符、void是main方法的返回值修飾符
        //Java程序中的main方法必須聲明爲public static void main。
        //String[] args是一個字符串類型組，是main方法的參數 
    public static void main(String[] args){ 
      
        String s2 = "Java";
        System.out.println(s1);
        System.out.println(s2);
    }
}

//變量的本質：“可操作性的存儲空間”，通過變量名來訪問"對應的操作空間",從而操作這個"存儲空間"存儲的值。
//變量需要聲明，並且初始化後才能被使用：int 變量類型  後面跟的是變量名稱。如：int name 其中int是變量類型，name是變量名稱。



/**
 * 變量是有作用域的，故而可以被分為三類：局部變量、成員變量、靜態變量。
 * 1、局部變量使用時必須  先 聲明 後初始化（賦值）才可以被使用，可以從屬於  語句塊  或者是  方法；
 * 2、成員變量：位於方法外部、類內部定義的變量，從屬於對象，生命週期伴隨對象始終。  成員變量會自動被初始化。
 * 3、靜態變量：使用static定義，從屬於類，生命週期伴隨類始終，從類加載到卸載。
*/


/** 
 * 常量：使用 final修飾的常量被稱為符號常量。如：final int name = "lab"; 
 * 常量一旦被初始化後，其值是不能再被更改的。
 * 凡是不可被更改的都被稱為常量，書寫原則：大寫字母和下劃線_。
*/

/**
 * 1、數據類型分為： 基本數據類型  和 引用數據類型。
 * 2、基本數據類型分為：數值型（整數類型<byte、short、int、long> 和 浮點類型<float、double>）、字符型（char） 和 布爾型（Boolean）。
 * 3、引用數據類型分為：類（class）、接口（interface） 和 數組。
 * 
 * 1、以0開頭的是八進制。如：int b = 015；
 * 2、以0x開頭的是十六進制。如：int c = 0x15；
 * 3、以0b開頭的是二進制。如：int d = 0b1101。
 * 
 * 使用精確浮點運算，推薦使用BigDecimal。
 */


 /**
  * 字符類型：char。如：char b = 'lab'；
  * 字符串：String就是字符序列，即一串字符組成的。
  */

  
  /**
   * 轉義字符：
   * System.out.println(""+'a'+'\n'+'b');
   * System.out.println(""+'a'+'\t'+'b');
   */
