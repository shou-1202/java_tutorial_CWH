import java.util.Scanner;
class Library{//initializing class
	String bookName;// declaring variables
	String authorName;
	int Id;
	String [] book = {"The Beauty and Beast", "Chanakya Niti", "Bhagawad Gita", "Murder on orient express", "Harry Potter"};// array to store book names
	int [] bookId = {101, 102, 107, 112, 145};// array to store book id
	void addBook(){// method to add book in the library by user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter book name: ");
		bookName = input.nextLine();
		System.out.println("Enter Author name: ");
		authorName = input.nextLine();
		System.out.println("Your request is submitted!\nIt will take nearly a week time to add the book");
	}
	void issueBook(){// method to issue a book for the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter book name: ");
		bookName = input.nextLine();
		System.out.println("Enter book id: ");
		Id = input.nextInt();
		System.out.println("Your book is issued!\nYou have to return or re-issue it within 15 days.");
	}
	void returnBook(){// method to return book by the user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter book name: ");
		bookName = input.nextLine();
		System.out.println("Enter book id: ");
		Id = input.nextInt();
		System.out.println("Thank you for returning!");
	}
	void showAvailableBooks(){// method to show available books
		for(int i = 0;i<book.length;i++){
			System.out.println((i+1)+". "+book[i]);
			System.out.println("Book id: "+bookId[i]);
		}
	}
}
		

class OnlineLibrary{
   public static void main(String[] args){//main function
         Library obj = new Library();
		 System.out.println("Hi!, Welcome to Online Library");// menu driven system
		 System.out.println("1. Add Book\n2. Issue Book\n3. Return Book\n4. Available Books");
		 System.out.println("Choose from above menu: (enter the choosen number)");
		 Scanner input = new Scanner(System.in);
		 int n = input.nextInt();
		 if(n==1){//condition to call specific methods
			 obj.addBook();
		 }
         else if(n==2){
			 obj.issueBook();
		 }
		 else if(n==3){
			 obj.returnBook();
		 }
		 else{
			 obj.showAvailableBooks();
		 }
   }
}
// this is a basic online library system. I will try to add more things....