package sirAneesLab;

import java.util.Scanner;

public class Playlist {
	  static Scanner scanner = new Scanner(System.in);
	
	Node2 head;
	

	public void Insert_Song_at_Start(String SongTittle) {
		
		Node2 newsong=new Node2(SongTittle);
		newsong.next=head;
		head = newsong;
		
		 System.out.print("Song added at the start: " + SongTittle);
	}
public void Insert_Song_at_End(String SongTittle) {
	Node2 newsong=new Node2(SongTittle);
	if(head==null) {
		head=newsong;
		
	}else {
		Node2 temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newsong;
	}
	
	 System.out.print("Song added at the End: " + SongTittle);
		
	}
public boolean Search(String songTitle) {
	Node2 temp=head;
	while(temp!=null) {
		if(temp.songTitle.equalsIgnoreCase(songTitle)) {
			 System.out.print("Song found " + temp.songTitle);
				return true;
		}
		temp=temp.next;
	}
	System.out.print("Song not found ");
	return false;

	
	
}
public void update(String oldTitle,String newTitle) {
	Node2 temp=head;
	while(temp!=null) {
		if(temp.songTitle.equalsIgnoreCase(oldTitle)) {
			temp.songTitle=newTitle;
			System.out.print("Song Title updated from"+oldTitle+"to"+newTitle);
			return;
		}
		temp=temp.next;
	}
	System.out.print("Song not found ");

	
}
public void display() {
	if(head==null) {
		System.out.print("playlist is empty");
		return;
	}
	System.out.print("playlist songs are :");
	Node2 temp=head;
	while(temp!=null) {
		System.out.print(temp.songTitle+"-->");
		temp=temp.next;
	}
}
	public static void main(String[] args) {
		
		int choice;
		Playlist p=new Playlist();
		  do {
	           
	            System.out.println("1. Insert Song at Start");
	            System.out.println("2. Insert Song at End");
	            System.out.println("3. Search for Song");
	            System.out.println("4. Update Song Title");
	            System.out.println("5. Display Playlist");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");
	           choice=scanner.nextInt();scanner.nextLine();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter song title to add at start: ");
	                    String startSong = scanner.nextLine();
	                    p.Insert_Song_at_Start(startSong);
	                  
	                    break;

	                case 2:
	                    System.out.print("Enter song title to add at end: ");
	                    String endSong = scanner.nextLine();
	                    p.Insert_Song_at_End(endSong);
	                    break;

	                case 3:
	                    System.out.print("Enter song title to search: ");
	                    String searchSong = scanner.nextLine();
	              p.Search(searchSong);
	                    break;

	                case 4:
	                    System.out.print("Enter old song title to update: ");
	                    String oldTitle = scanner.nextLine();
	                    System.out.print("Enter new song title: ");
	                    String newTitle = scanner.nextLine();
	                    p.update(oldTitle, newTitle);
	                  
	                    break;

	                case 5:
	                    p.display();
	                    break;

	                case 6:
	                    System.out.println("Exiting... Goodbye!");
	                    break;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	            }

	        } while (choice != 6);

	        scanner.close();
	    }
		
		
		
	}


