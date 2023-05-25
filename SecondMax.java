package demoProject;

public class SecondMax {


	public static void main(String[] args) {
		int[]a= {6,8,2,4,3,1,5,7};
		int t;
		for (int i = 0; i < a.length; i++) {
             for (int j = i+1 ; j < a.length; j++) {
				if(a[i]<a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
				if(i==1) {
					break;
				}
			}		
          
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
