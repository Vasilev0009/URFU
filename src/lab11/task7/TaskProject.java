package lab11.task7;

public class TaskProject {
    public int value;
    public TaskProject next;
    TaskProject(int value, TaskProject next){
        this.value = value;
        this.next = next;
    }
    public void createHead(Integer value){
        TaskProject newNode = new TaskProject(this.value, this.next);
        this.value = value;
        this.next = newNode;
    }
    public void createTail(Integer value){
        TaskProject newTail = new TaskProject(value, null);
        TaskProject ref = this;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;
    }
    public String toString(){
        StringBuilder ret = new StringBuilder();
        TaskProject ref = this;
        do{
            ret.append(ref.value).append(" ");
            ref = ref.next;
        } while (ref != null);
        return ret.toString();
    }
    public void AddFirst(int value){
        createHead(value);
    }
    public void AddLast(int value){
        createTail(value);
    }
    public void Insert(int pos, int value){
        TaskProject newNode = new TaskProject(value, null);
        TaskProject ref = this;
        int k=1;
        while (ref.next!= null && (k < pos)) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
    }
    public void RemoveFirst(){
        TaskProject newHead = this.next;
        this.value = newHead.value;
        this.next = newHead.next;
        newHead.next = null;
    }
    public void RemoveLast(){
        TaskProject ref = this;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next=null;
    }
    public void Remove(int pos){
        TaskProject ref = this;
        int k = 1;
        while (ref.next != null && (k < pos)) {
            ref = ref.next;
            k++;
        }
        assert ref.next != null;
        ref.next = ref.next.next;
    }
}
