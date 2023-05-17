public class Method3{
	public static void main(String[] args){
		hello("山田");
		hello("田中");
		hello("佐藤");
		add(20,10);
		add(30,40);
		add(200,100);
		timesword("hello",5);
		timesword("happy",10);


	}
	/*
	メソッドは引数を設定する事ができる
	helloメソッド
	引数：name
	*/
	public static void hello(String name){ //引数（arguments)-->（型 名前)
		System.out.println(name + "さんこんにちは！");
	}
	/*
	引数はカンマ区切りで複数設定する事ができる
	addメソッド
	２つの引数の和を出力する
	引数：x(int), y(iny)
	*/
	public static void add(int x, int y){
		System.out.printf("%dと %dの 和は %dです %n",x,y,x+y);
	}
	/*
	timeswordメソッド
	引数でとってきた単語を指定回数分繰り返して出力する
	引数：String word, count(int)
	*/
	public static void timesword(String word, int count){
		for(int i= 0; i < count; i++){
			System.out.print(word);
		}
		System.out.println();
	}
}
