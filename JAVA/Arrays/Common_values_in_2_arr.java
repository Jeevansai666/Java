class Common_values_in_2_arr {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int b[] = {5, 2, 1, 8, 4, 8, 2, 6,4,5,6};

		System.out.print("Common values are: ");
		for (int i = 0; i < a.length; i++) {
			boolean flag = false;

			for (int j = 0; j< i; j++) {
				if (a[i] == a[j]) {
					flag = true;
					break;
				}
			}
			if (flag) continue;

			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.print(a[i] + " ");
					break;
				}
			}
		}
	}
}
