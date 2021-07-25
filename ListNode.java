public class ListNode {

    public Integer key;
    public Integer data = -1;
    
    // End of list is indicated with null
    public ListNode next = null;

    public ListNode(Integer key) {
        this.key = key;
    }

    public ListNode(Integer key, Integer data) {
        this.key = key;
	this.data = data;
    }

    public String toString() {
        String result = "[K: " + this.key + ", D: " + this.data + "]";
	return result;
    }
}