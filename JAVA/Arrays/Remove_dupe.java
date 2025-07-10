class Remove_dupe {
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 2, 4, 5, 6, 2, 5, 6}; 
		int b[] = new int[a.length];
		int index = 0;

		for (int i = 0; i < a.length; i++) {
			boolean flag = false;
			for (int j = 0; j < index; j++) {
				if (a[i] == b[j]) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				b[index] = a[i];
				index++;
			}
		}

		System.out.print("Unique values are: ");
		for (int i = 0; i < index; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
