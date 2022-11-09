package in.Ameer.Assignment1;

public class Assignment1 {public static void main(String[] args) {
	
	Assignment_01_01();
	Assignment_01_02();
	Assignment_01_03();
	Assignment_01_04();
	Assignment_01_05();

}

public static void Assignment_01_01() {

	int n = 6;
	
	for (int i = 0; i < n; i++) {
		// I
		for (int j = 0; j < n; j++) {
			if (i==0 || (j==(n-1)/2) || i==(n-1)) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.print("  ");
		
		// N
		for (int j = 0; j < n; j++) {
			if ((j==0) ||(i == j)|| j==(n-1)) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.print("  ");
		
		//E
		for (int j = 0; j < n; j++) {
			if (i==0 || (j==0) || (i==(n-1)/2) || i==(n-1)) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.print("  ");
		
		//U
		for (int j = 0; j < n; j++) {
			if ((j==0)&& i<n-1 
					||(i == (n-1)&& j>0 && j<(n-1))
					|| j==(n-1) && i<(n-1)   ) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.print("  ");
		
		// R
					for (int j = 0; j < n; j++) {
						if ((j==0) ||(i == j) && i>(n-1)/2
								|| j==(n-1) && i<(n)/2
								|| i==0
								|| i==(n-1)/2
								) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
					
					//0
					for (int j = 0; j < n; j++) {
						if (
								(j==0)&& i<n-1 && i>0 && j<n-1 ||
								 (i==0) && j>0 && j<n-1  ||
								 (i == (n-1)&& j>0 && j<(n-1)) ||
								 j==(n-1) && i<(n-1) && i>0
								) {
							System.out.print("*");
						} else {
							System.out.print(" ");
						}
					}
					System.out.print("  ");
		
		// N
		for (int j = 0; j < n; j++) {
			if ((j==0) ||(i == j)|| j==(n-1)) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}


	

}


public static void Assignment_01_02() {

	int n = 4;
	for (int i = 1; i <= n; i++) {
	for (int j = 1; j <= n; j++) {
		System.out.print(i+" ");
	}
	System.out.println();
	}
}

public static void Assignment_01_03() {

	int n = 6;
	
	int i,j;

	for ( j = 1; j <= 2*n; ++j) {
		System.out.print("* ");

	}
	System.out.println("");
	for(i = 0; i < n; i++)
    {
        for(j = 0; j < (2 * n); j++)
        {
            if(i + j <= n - 1)  
                System.out.print("*");
            else
                System.out.print(" ");
            if((i + n) <= j) 
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
    
	for(i = 0; i < n; i++)
    {
        for(j = 0; j <  2*n; j++)
        {
           if(j==0 || j==(2*n)-1)
                System.out.print("* ");
           else
        	   System.out.print("  ");
            
            
        }
        System.out.println();
    }
    

	for ( j = 1; j <= 2*n; ++j) {
		System.out.print("* ");

	}
	System.out.println("");

	

}

public static void Assignment_01_04() {

	int n = 6;
	
	int i,j;

	for(i = 0; i < n; i++)
    {
        for(j = 0; j <  2*n; j++)
        {
           if(j==0 || j==(2*n)-1)
                System.out.print(" ");
           else
        	   System.out.print("  ");
            
            
        }
        System.out.println();
    }


	for(i = 0; i < n; i++)
    {
        for(j = 0; j < (2 * n); j++)
        {
            if(i >= j)  
                System.out.print("*");
            else
                System.out.print(" ");
            if(i >= (2 * n - 1) - j)  
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }


	

}



public static void Assignment_01_05() {

	int n = 12;

	for (int j = 1; j <= n; ++j) {
		System.out.print("*");

	}
	System.out.println("");

	for (int i = n / 2; i > 1; --i) {
		for (int j = 1; j <= i; ++j) {
			System.out.print("*");
		}
		System.out.println();
	}

	for (int i = 0; i < n / 2; i++) {
		for (int j = 0; j <= i; j++) {
			System.out.print("*");
		}

		System.out.println();
	}
	for (int j = 1; j <= n; ++j) {
		System.out.print("*");

	}

}


}

//For Out line 
//
//(j==(n-1)/2) // Middle Line
//if((i==0) // First row
//||(i==(n-1)) // Last row
//||(j==0)  // First column
//|| j==(n-1)) // Last Column
//{
//System.out.print("*");
//
//}else {
//System.out.print(" ");
//}
