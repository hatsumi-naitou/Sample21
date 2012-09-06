import java.util.HashMap;


public class SampleClass {

	public static void main(String[] args){
		
		HashMap map = new HashMap();     //辞書。オブジェクト型なので、何でも入る。どんなときでも使える。
		
		map.put("hoge", new Integer(1));   //"hoge"は、newされたString型のインスタンス
		
		
		String foo = new String("test");  //
		Boolean boo = new Boolean(false);  //
		
		map.put(boo, foo);
		
		
		SampleClass sc = new SampleClass();
		
		map.put(map, sc);   //自分自身にmapを入れる。mapのアドレスを渡す。
				
		//オブジェクト型なので何でも入る。が、唯一、入らないものがある。それは何か。
		int i = 1;
		boolean t = true;  //intやbooleanなどはオブジェクト型じゃない。プリミティブ型。なので、１．４までは入らなかった。
		
		map.put(1, true);  //1.5は勝手に求めるようになった。１→new　Integer が自動的に渡される。　new boolean(false)が自動的に。
		      //これがauto　boxingの機能！
		
		System.out.println(map.get(boo));
		
		Object c = String.class;
		
		if(c instanceof String){
			System.out.println("String型の胃mスタンスです");
		}
		
		if(c instanceof Class){
			System.out.println("Class型のインスタンスです");
		}
		
	}
	
}
