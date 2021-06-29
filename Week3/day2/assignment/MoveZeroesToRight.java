package Week3.day2.assignment;

public class MoveZeroesToRight {

	public static void main(String[] args) {
		 int[] num = { 4, 0, 3, 0, 1, 5, 2, 0 };
		 int[] dup = new int[num.length];
		 int j=0;
		 for (int i = 0; i < num.length; i++) {
			 if(num[i]!=0){
				 dup[j]=num[i];
				 j++;
			 }
					}
		 while(j<num.length) {
			 dup[j]=0;
			 j++;
		 }
		 System.out.println("The new array is:");
		 for (int i = 0; i < num.length; i++) {
			System.out.print(dup[i]+" ");
		}

	}

}
