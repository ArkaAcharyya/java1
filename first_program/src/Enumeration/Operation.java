package Enumeration;

//public enum Day {
//	TUESDAY(1),MONDAY(0), WEDNESDAY(2);
//	int code;
//	Day(int code){
//		this.code=code;
//	}
//	public void print() {
//		for( Day d: Day.values()) {
//			System.out.println(d.code);
//		}
//	}
//}
public enum Operation {
    ADD, SUB;

    void apply(int a, int b) {
    	System.out.println(this);
        System.out.println(this == ADD ? a + b : a - b);
    }
}

