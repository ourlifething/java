public class Ex5_2{
	public static void main(String[] args){
		email("title", "xxx@xxx.com","xxxxoooxxxoooxxx");
		
	}
	public static void email(String title, String address, String text){
		System.out.printf("%sに以下のメールを送りました%n", address);
		System.out.printf("件名：%s%n",title);
		System.out.printf("本文：%s %n",text);

	}
}
