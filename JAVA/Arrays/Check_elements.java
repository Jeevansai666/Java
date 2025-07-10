public class Check_elements {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 2, 4, 5, 6, 2, 5, 6,23}; 
		boolean flag12=false;
        boolean flag23=false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 12) {
                flag12 = true;
            }
            if (a[i] == 23) {
                flag23 = true;
            }
        }

        if (flag12 && flag23) {
            System.out.println("Array contains both 21 and 23.");
        } 
        else if(flag12)
        {
            System.out.println("Array only contains 12.");
        }
        else if(flag23)
        {
            System.out.println("Array only contains 23.");
        }
        else {
            System.out.println("Array does NOT contain both 21 and 23.");
        }
    }
	
}

