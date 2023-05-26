public class Ex5_4{
	public static void main(String[] args){

    double bottomCm = 10.0;
		double heightCm = 5.0;
		System.out.printf("底辺：%.1f,高さ：%.1fの三角形の面積は%.2fcm2%n",bottomCm,heightCm,calcTriangleArea(bottomCm, heightCm));

		double radius = 5.0;
		System.out.printf("半径：%.1f円の面積：%.1fcm2%n",radius,calcCircleArea(5.0));

	}
	public static double calcTriangleArea(double bottomCm , double heightCm){
		double triangleArea = bottomCm * (heightCm/2);
		return triangleArea;
	}
	public static double calcCircleArea(double radius){
		double circleArea = (radius * radius) * 3.14;
		return circleArea;
	}
}
