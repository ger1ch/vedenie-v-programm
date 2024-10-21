//массивы и строки

class Arrays {
	public static void main(String args[]) {
		int[] sample = new int[10];
		int sample1[] = new int[10];
		int i;

		for(i = 0; i < 10; i++)
			sample[i] = 2*i;
		for(i= 0; i < 10; i++)
			System.out.println("Элемент массива с индексом " + i + ":" + sample[i]);
		System.out.println();
		sample1[0] = 99;
		sample1[1] = 20;
		sample1[2] = 90;
		sample1[3] = -242;
		sample1[4] = -20;
		sample1[5] = 3;
		sample1[6] = 53;
		sample1[7] = 51;
		sample1[8] = -67;
		sample1[9] = 22;
		
		int max, min;
		min = max = sample1[0];
		for (i = 1; i < 10; i++) {
			if(sample1[i] < min) min = sample1[i];
			if(sample1[i] > max) max = sample1[i];
		}
		System.out.println("Макс и мин значение: " + min + " " + max);
		

		//Инициализация массива
		System.out.println();

		int[] sample2 = {87, 100, -42, 34, 25, 25, -424, 62, 74, 8};
		min = max = sample2[0];
                for (i = 1; i < 10; i++) {
                        if(sample2[i] < min) min = sample2[i];
                        if(sample2[i] > max) max = sample2[i];
                }
                System.out.println("Макс и мин значение: " + min + " " + max);

		//сортировка массива
		 System.out.println();
		 int size = sample2.length;
		 int a, b, t;
		 //отображение исходного массива
		 System.out.print("Исходный массив");
		 for(i=0; i < size; i++)
			 System.out.println(" " + sample2[i]);
		 System.out.println();

		 //сортировка
		 for(a=1; a < size; a++)
			 for(b=size-1; b >= a; b--) {
				 if(sample2[b-1]>sample2[b]) {
					 t = sample2[b-1];
					 sample[b-1] = sample[b];
					 sample[b] = t;
				 }

			 }

		 //отображение отсортированного массива йоу
		 System.out.print("Отсортированный массив");
		 for(i=0; i < size; i++)
                         System.out.println(" " + sample2[i]);
                 System.out.println();

		 //двумерные массивы ы ы ы ы ы ыыхыхыхых
		 System.out.println();
		 int [][] arr2D = new int [10][20];
		 int t2, i2;
		 for(t2=0; t2 < 10; t2++) {
			 for(i2=10; i2 < 30; i2++) {
				 arr2D[t2][i2] = (t2*100)+i2+1;
				 if (t2==0) 
					 System.out.println(arr2D[t2][i2-10] + " ");
				 else
				 	 System.out.println(arr2D[t2][i2-10] + " ");
			 }
			 System.out.println();


		 }

		 //дувумерный массив
		 System.out.println();

		 int [][] riders = new int[7][];
		 riders[0] = new int[10];
		 riders[1] = new int[10];
		 riders[2] = new int[10];
                 riders[3] = new int[10];
		 riders[4] = new int[10];
                 riders[5] = new int[2];
                 riders[6] = new int[2];
		 
		 for(int i3=0; i3<7; i3++)
			 for(int j3=0; j3 < riders[i3].length; j3++)
				 riders[i3][j3] =  i3 + j3 + 10;
		 System.out.println("Будни");
		 for(int i3=0; i3<5; i3++) {
                         for(int j3=0; j3 < riders[i3].length; j3++) 
				System.out.print(riders[i3][j3] + " ");
			 System.out.println();
		 }
		 System.out.println("выходные");
                 for(int i3=5; i3<7; i3++) {
                         for(int j3=0; j3<2; j3++)
                                System.out.print(riders[i3][j3] + " ");
                         System.out.println();

	 	 }

		 //ссылка на массивы
		 System.out.println();
		 for (int i3=0; i3<10; i3++)
			 sample[i3] = i3;
		 for (int i3=0; i3<10; i3++)
                         sample1[i3] = -i3;

		 System.out.println("Массив sample[]:");
		 for (int i3=0; i3<10; i3++)
                         System.out.println(sample[i3] + " ");
		 System.out.println();
		 System.out.println("Массив sample[]:");
		 for (int i3=0; i3<10; i3++)
			 System.out.println(sample[i3] + " ");
		 System.out.println();
		 sample1 = sample;
		 sample1[4] = 1111;
		 System.out.println("Массив sample[] после изменения");
		 for (int i3=0; i3<10; i3++)
			 System.out.println(sample[i3] + " ");
		 System.out.println();
		 System.out.println("sample[]: " + sample + " sample1[] " + sample1);
		 
		 //копирование массива
		 System.out.println();
		 int[] sample3 = new int[10];
		 for (int i3=0; i3<10; i3++)
                         sample1[i3] = -i3;
		 if(sample1.length >= sample3.length)
			 for(int i3=0; i3<sample3.length; i3++)
				 sample1[i3] = sample3[i3];

		 //вывод содержимого
		 System.out.println("Массив sample[] после копирования");
		 for (int i3=0; i3<10; i3++)
                         System.out.println(sample1[i3] + " ");
		 System.out.println();

		 //
		



	}
}