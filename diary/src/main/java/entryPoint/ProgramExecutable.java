package entryPoint;

import java.util.List;
import java.util.Scanner;

import model.JournalEntry;
import service.Operations;

public class ProgramExecutable {

	static Scanner sc = new Scanner(System.in);
	
	public void takeUserInputAndAddData() {
		System.out.println("Enter title:-");
		String title = sc.nextLine();
		System.out.println("Enter content:-");
		String content = sc.nextLine();
		JournalEntry entry = new JournalEntry();
        entry.setTitle(title);
        entry.setContent(content);
        Operations.getInstance().saveJournalEntry(entry);
	}
	
	public void printAllData() {
		List<JournalEntry> entries = Operations.getInstance().getList();
		for(JournalEntry eachEntry : entries) {
			System.out.println("Id is" + " : " + eachEntry.getId());
			System.out.println("Title is" + " : " + eachEntry.getTitle());
			System.out.println("Content is" + " : " + eachEntry.getContent());
			System.out.println("----------------------------");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProgramExecutable programExecutable = new ProgramExecutable();
		try {
			while(true) {
				System.out.println("1: Add Jounral Entry \n2: List Journal Entires \n10: Exit");
				String opInput = sc.nextLine();
				try {
					int op = Integer.parseInt(opInput);
					switch(op) {
						case 1:
							programExecutable.takeUserInputAndAddData();
							break;
						case 2:
							programExecutable.printAllData();
							break;
						case 10:
							break;
						default:
							System.out.println("Enter only 1 or 2");
							continue;
					}
					
					if(op == 10) {
						break;
					}
					
				} catch(Exception e) {
					System.out.println("Please enter an integer");
					e.printStackTrace();
					continue;
				}
			}
            
		} catch(Exception e) {
			
		}
	}

}
