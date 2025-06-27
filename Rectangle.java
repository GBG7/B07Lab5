package lab4;

public class Rectangle {
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Rectangle(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}

	public double perimeter() {
		double width;
		double length;
		//checking for 2nd point on same x axis as A
		if (A.x == B.x) {
			width = A.distance(B);
			//checking for 2nd point on same y axis as A
			if (A.y == C.y) 
				length = A.distance(C);
			else 
				length = A.distance(D);
		}
		
		else if (A.x == C.x) {
			width = A.distance(C);
			if (A.y == B.y) 
				length = A.distance(B);
			else 
				length = A.distance(D);
		}
		
		else {
			width = A.distance(D);
			if (A.y == C.y) 
				length = A.distance(C);
			else 
				length = A.distance(B);
		}
		
		return width*2 + length*2;
	} 

}