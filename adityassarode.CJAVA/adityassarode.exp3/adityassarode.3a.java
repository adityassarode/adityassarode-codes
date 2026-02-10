//Aditya Sarode

//3a. Implement an interface 'Sortable' in Java with methods for sorting arrays, and utilize it with different data types.


interface Sortable {
    void sort();
}

class SortD implements Sortable {

    int a[] = {3, 1, 2};
    String s[] = {"b", "c", "A", "e"};

    public void sort() {

       
        for(int i=0;i<a.length;i++)
            for(int j=i+1;j<a.length;j++)
                if(a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }

        
        for(int i=0;i<s.length;i++)
            for(int j=i+1;j<s.length;j++)
                if(s[i].compareTo(s[j]) > 0) {
                    String t = s[i];
                    s[i] = s[j];
                    s[j] = t;
                }

        System.out.print("Ints: ");
        for(int x : a) System.out.print(x+" ");

        System.out.print("\nStrings: ");
        for(String x : s) System.out.print(x+" ");
    }

    public static void main(String[] args) {
        Sortable obj = new SortD();
        obj.sort();
    }
}
