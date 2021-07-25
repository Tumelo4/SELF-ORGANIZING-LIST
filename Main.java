public class Main {

    public static void searchList(OrganisingList orglist, Integer key)
    {
	ListNode result = orglist.searchNode(key);
	if (result != null)
	    System.out.println("Found node " + result.toString());
	else
	    System.out.println("Node with key " + key + " not found");	
    }

    public static void printList(OrganisingList orglist) 
    { 
	ListNode node = orglist.root;
	if (node == null) 
	{
            System.out.println("List is empty");
        } 
	else
	{
	    System.out.println("Organising List Content:"); 
        	  
            while (node != null) 
            { 
            	System.out.println(node.toString()); 
            	node = node.next; 
            }
	}
    }

    public static void printKeys(OrganisingList orglist) 
    { 
	ListNode node = orglist.root;
	if (node == null) 
	{
            System.out.println("List is empty");
        } 
	else
	{	  
            System.out.print(node.key);
	    while (node.next != null) 
            { 
            	node = node.next;
		System.out.print(", " + node.key);  
            }
            System.out.println();

	}
    }  

    public static void main(String[] args) 
    {
        OrganisingList mvflist = new MoveToFrontOrganisingList();

        mvflist.insert(10);
        mvflist.insert(5);
        mvflist.insert(9);
        mvflist.insert(5);

        printKeys(mvflist);
        printList(mvflist);

        searchList(mvflist, 5);
		searchList(mvflist, 15);
        printList(mvflist);

        mvflist.delete(10);
        printList(mvflist);

        System.out.println(mvflist.contains(10));
        System.out.println(mvflist.contains(5));

	OrganisingList tlist = new TransposeOrganisingList();

        tlist.insert(5);
        tlist.insert(2);
        tlist.insert(9);
        tlist.insert(5);
        tlist.insert(20);

        printKeys(tlist);
        printList(tlist);

	searchList(tlist, 9);
        searchList(tlist, 20);
        printList(tlist);

        tlist.delete(9);
        printList(tlist);

        System.out.println(tlist.contains(2));
	System.out.println(tlist.contains(9));
        
        /*
        Expected output:

        10, 5, 9
	Organising List Content:
	[K: 10, D: 179]
	[K: 5, D: 61]
	[K: 9, D: 9]
	Found node [K: 5, D: 61]
	Node with key 15 not found
	Organising List Content:
	[K: 5, D: -61]
	[K: 10, D: 181]
	[K: 9, D: 9]
	Organising List Content:
	[K: 5, D: 61]
	[K: 9, D: 9]
	false
	true
	5, 2, 9, 20
	Organising List Content:
	[K: 5, D: 359]
	[K: 2, D: -179]
	[K: 9, D: 241]
	[K: 20, D: 20]
	Found node [K: 9, D: 241]
	Found node [K: 20, D: 20]
	Organising List Content:
	[K: 5, D: 339]
	[K: 9, D: -159]
	[K: 20, D: 438]
	[K: 2, D: 2]
	Organising List Content:
	[K: 5, D: -303]
	[K: 20, D: 438]
	[K: 2, D: 2]
	true
	false

        */

    }
}