class File implements Comparable<File>{

    @Override
    public int compareTo(File o) {
        return 0;
    }

    public void sort(Comparable[] a){
        int N = a.length;

        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i; j < N; j++) {
                if (a[j].compareTo(a[min]) < 0) min = j;
            }
            Comparable swap = a[min];
            a[min] = a[i];
            a[i] = swap;
        }
    }
}