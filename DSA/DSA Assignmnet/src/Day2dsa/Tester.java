package Day2dsa;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		LinkedList sl = new LinkedList();
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			System.out.println("1:insertAtBeg");
			System.out.println("2:insertAtLAst");
			System.out.println("3:deleteAtBeg");
			System.out.println("4:deleteAtLAst");
			System.out.println("5:display");
			System.out.println("6:Revdisplay");
			System.out.println("7:InsertAtPos");
			System.out.println("8:DeleteAtPosition");
			System.out.println("9:Exit");
			System.out.println("Enter the choice ");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter the Node Data to insertAtBeg");
				sl.insertAtBeg(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter the Node Data to insertAtLAst");
				sl.insertAtLAst(sc.nextInt());
				break;
			case 3:
				System.out.println(" deleteAtBeg " +sl.deleteAtBeg() );
				break;
			case 4:
				System.out.println(" deleteAtLast " + sl.deleteAtLast());
				break;
			case 5:
				System.out.println("0----------Display-----------0");
				sl.display();
				break;
			case 6:
				System.out.println("0----------ResverDisplay-----------0");
				sl.RevDisplay();
				break;
			case 7:
				System.out.println("0----------InsertAtPosition-----------0");
				System.out.println("Enter the Postion");
				int pos=sc.nextInt();
				System.out.println("Enter the Data");
				sl.InsertAtPos(pos,sc.nextInt());
				sl.display();
				break;
			case 8:
				System.out.println("0----------DeleteAtPosition-----------0");
				System.out.println("Enter the Position");
				sl.DeleteAtPos(sc.nextInt());
				sl.display();
				break;
			case 9:
				flag=false;
				break;
			}
		}
	}
}
