package ch10;

public class TypeConversionTest {

	public static void main(String[] args) { 
		
		int iNum = 255;
		byte bNum = (byte) iNum;
		
		System.out.println(bNum);
		
		double dNum = 255;
		int inum = (int) dNum;
		
		System.out.println(inum);
	}

}
