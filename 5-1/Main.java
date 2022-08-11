import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		{
//      問① 下記の配列はString型しか格納できないように修正してください。
//		   現状は全てのクラスの継承元であるObject型を指定しているので、Integerもintも格納可能になっています。
	       //List<Object> array = new ArrayList<>();
//	    <以下記述>
           List<String> array = new ArrayList<String>();

//      問② 前から二つ目の要素を"bar"にしましょう。
//	　<以下記述>
           array.add("abc");
           array.add("bar");
           array.add("foo");

//      問③ fooが格納されているインデックスを出力してください。
//	　<以下記述>
           
           int firstfooIndex = array.indexOf("foo");
           System.out.println(array.get(2) + "のインデックス：" + firstfooIndex);

		}

		{
//      問④ キーがString型、バリューがObject型の要素を三つ格納しましょう。
		Map<String, Object> map = new HashMap<>();
//	　<以下記述>
        map.put("adress", "/////");
        map.put("name", "kosuke");
        map.put("age", "29");

//      問⑤上記で格納したキーを繰り返し文で出力しましょう。
//	    <以下記述>
        for (String m1 : map.keySet()) {
            System.out.println("key：" + m1);
        }

//      問⑥上記で格納したバリューを繰り返し文で出力しましょう。
//	    <以下記述>
        for (Object m2 : map.values()) {
            System.out.println("value：" + m2);
        }

		}
		{
//      問⑦ 配列arrayDateに今の年・月・日を入れてください。
           Calendar cal = Calendar.getInstance();
//	    <以下記述>
           int[] arrayDate = new int[3];

           arrayDate[0] = cal.get(Calendar.YEAR);
           arrayDate[1] = cal.get(Calendar.MONTH) + 1;
           arrayDate[2] = cal.get(Calendar.DATE);

//      問⑧ 配列arrayDateをList型に変更しましょう。
//	    <以下記述>
            ArrayList<Integer> Datelist = new  ArrayList<Integer>(arrayDate.length);


//      問⑨ 上記で格納した要素を繰り返しで出力しましょう。
//	    <以下記述>
    for (int i : arrayDate) {
            Datelist.add(i);
        }
    Datelist.forEach(System.out::println);
    
}

	}

}
