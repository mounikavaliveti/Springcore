import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class circle {
	
	private Point X;

	public Point getX() {
		return X;
	}
	@Autowired
	@Qualifier("x")
	public void setX(Point a) {
		X = a;
	}
	public void output() {
		System.out.println("Drawing Circle");
		System.out.println("Center of circle is (" +this.getX().getX()+ "," +this.getX().getY()+ ")");

	}
}
