
public class MyStack {
    private Object[] table;
    private int size;

    MyStack() {
        this.table = new Object[5];
        this.size = table.length-1;
    }

    public void add(Object e) {
        this.table[this.size] = e;
        this.size--;
        if (this.table.length == 0) {
            Object[] newTable = new Object[this.table.length * 2];
            for (int i = 0; i < this.table.length; i++) {
                newTable[i] = this.table[i];
            }
            this.table = newTable;
        }
    }

    public Object peek() {
        return this.table[table.length-1];
    }

    public Object pop() {
        Object e = this.table[table.length-1];
        for (int i = 1; i < this.size; i++) {
            this.table[i - 1] = this.table[i];
        }
        this.size--;
        return e;
    }

    public int size() {
        return this.size;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < this.size; i++) {
            str = str + this.table[i] + ", ";
        }

        str = str + "]";
        return str;
    }

}



