package practicePRojectPhase;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area s = new Area(); 
        System.out.println("Area of rectangle= "+s.area(10, 20)); 
        System.out.println("Area of square="+s.area(10)); 
        System.out.println("Area of circle= "+s.area(10.0)); 

	}
	    public int area(int x, int y) 
	    { 
	        return (x*y); 
	    } 
	    public int area(int x) 
	    { 
	        return (x*x); 
	    } 
	    public double area(double x) 
	    { 
	        return (3.14*x*x); 
	    } 
	}


