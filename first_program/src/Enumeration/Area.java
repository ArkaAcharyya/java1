package Enumeration;

public enum Area {
	
	    CIRCLE {
	        double area() { return 3.14 * 4 * 4; }
	    },
	    SQUARE {
	        double area() { return 4 * 4; }
	    };

	    abstract double area();
	

}
