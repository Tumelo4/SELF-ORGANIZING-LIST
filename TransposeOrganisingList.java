/*
*   TRANSPOSE CLASS
*/
public class TransposeOrganisingList extends OrganisingList {

    ////// Implement the function below this line //////

    /**
     * Retrieve the node with the specified key and swap the
     * accessed node with its predecessor, then recalculate all data fields.
     * @return The node with its data value before it has been moved,
     * otherwise 'null' if the key does not exist.
     */
    @Override
    public ListNode searchNode(Integer key) {

	//Your code goes here
        if( contains(key)  == true)
        {
            ListNode temp = root;
            ListNode prev = null;
            ListNode pprev = null;

            while (temp != null && temp.key != key)
            {
                pprev = prev;
                prev = temp;
                temp = temp.next;
            }

            ListNode store = new ListNode(key, temp.data);

            if (pprev == null && prev != null)
            {
                prev.next = temp.next;
                temp.next = prev;
                root = temp;
            }

            else if (pprev != null)
            {
                pprev.next = temp;
                prev.next = temp.next;
                temp.next = prev;
            }

            calculateData(); 
            return store;
        }
        else
        {
            return null;
        }
    }


}