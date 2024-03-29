package Leethcode.seventyfive.db_bank;

public class BinaryGap {
	public static void main(String[] args) {

		
		System.out.println("Output--"+ BinaryGap.solve(22));		
		System.out.println("Output--"+ BinaryGap.solve(8));
		System.out.println("Output--"+ BinaryGap.solve(5));
	

	}

	private static int solve(int number) {
		
		String binaryStr = Integer.toBinaryString(number); // O(n) space
		System.out.println(number+ " input binaryRepresentation--"+ binaryStr);
		int startIndexOne = binaryStr.indexOf('1');
		int maxLenth = 0 ;
		

		while ( startIndexOne != -1 && startIndexOne < binaryStr.length()) { // O(n) time
			
			int nextIndexOne = binaryStr.indexOf('1', startIndexOne+1);
			if(nextIndexOne == -1 ) return maxLenth;
			//System.out.println("loop nextIndexOne=="+nextIndexOne);
			
			if(maxLenth == 0 ) { 
				maxLenth = nextIndexOne- startIndexOne ;
			}else if( maxLenth < (nextIndexOne - startIndexOne) ){
				maxLenth =nextIndexOne - startIndexOne ;
			}
			
			startIndexOne = nextIndexOne;
			
		}

		return maxLenth;
	}
}
