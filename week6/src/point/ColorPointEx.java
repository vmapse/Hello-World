package point;

public class ColorPointEx {

	public static void main(String[] args) {
		MyPoint p = new MyPoint();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();

	}

}
