class Help {
	public static void main(String args[]) throws java.io.IOException {
	  char choice, ignore;
	  for(;;) {
		do {
			System.out.println("Справка по операторам: ");
			System.out.println(" 1. if");
			System.out.println(" 2. switch");
			System.out.println(" 3. for");
			System.out.println(" 4. while");
			System.out.println(" 5. do while");
			System.out.println(" 6. break");
			System.out.println(" 7. continue\n");
			System.out.println(" Выберите номер раздела (для завершения программы нажмите клавишу q): ");
			choice = (char) System.in.read();
			do {
				ignore = (char) System.in.read();
			} while (ignore != '\n');
		} while	(choice < '1' | choice > '7' & choice != 'q');

		if(choice == 'q') break;

		System.out.println("\n");
		switch(choice) {
			case '1':
				System.out.println("Оператор if:\n");
				System.out.println("if(условие) оператор;");
				System.out.println("else оператор;");
				break;
			case '2':
				System.out.println("Оператор switch:\n");
				System.out.println("switch(выражение) {");
				System.out.println(" case константа:");
				System.out.println("  последовательность операторов");
				System.out.println("  break;");
				System.out.println(" ... ");
				System.out.println("} ");
				break;
			case '3':
				System.out.println("цикл for:\n");
                                System.out.println("for(инициализация; условие; итерация)");
                                System.out.println("  оператор;");
				break;
			case '4':
				System.out.println("цикл while:\n");
                                System.out.println("while (условие) оператор;");
				break;
			case '5':
				System.out.println("цикл do while:\n");
                                System.out.println("do {");
                                System.out.println("  оператор;");
				System.out.println("while (условие);");
				break;
			case '6':
                                System.out.println("оператор break:\n");
                                System.out.println("  break; или break метка;");
                                break;
			case '7':
                                System.out.println("оператор break:\n");
                                System.out.println("  continue; или continue метка;");
                                break;


		}
	  }	
	}

}
fatal: не удалось выполнить автоопределение адреса электронной почты (получено «student@alexander-VirtualBox.(none)»)
Commit 1 added with date 2024-10-09T12:00:00
Username for 'https://github.com': ger1ch
Password for 'https://ger1ch@github.com': 
remote: Support for password authentication was removed on August 13, 2021.
remote: Please see https://docs.github.com/get-started/getting-started-with-git/about-remote-repositories#cloning-with-https-urls for information on currently recommended modes of authentication.
fatal: Authentication failed for 'https://github.com/ger1ch/vedenie-v-programm.git/'
