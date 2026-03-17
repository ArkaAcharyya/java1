package second_program;

public class heap_size {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long maxHeap = Runtime.getRuntime().maxMemory(); // in bytes

        // Total memory currently allocated to JVM
        long totalHeap = Runtime.getRuntime().totalMemory(); // in bytes

        // Free memory inside allocated heap
        long freeHeap = Runtime.getRuntime().freeMemory(); // in bytes

        System.out.println("Max Heap Size (Xmx)    : " + maxHeap / (1024 * 1024) + " MB");
        System.out.println("Total Allocated Heap   : " + totalHeap / (1024 * 1024) + " MB");
        System.out.println("Free Memory in Heap   : " + freeHeap / (1024 * 1024) + " MB"); 

	}

}
