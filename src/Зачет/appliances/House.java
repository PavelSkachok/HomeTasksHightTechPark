package Зачет.appliances;

public abstract class House {
    private int p;
    private String color;
    private int active;
    private String name;

    public int getP() {
        return p;
    }

    public String getColor() {
        return color;
    }

    public int getActive() {
        return active;
    }

    public String getName() {
        return name;
    }
    static int power(int[] powarr,int[] on){
        int p=0;
        for (int i=0;i<powarr.length;i++){
            p+=powarr[i]*on[i];
        }
        return p;
    }

    static void clr(String[] colarr,String[] nm){
        String[] b=nam(colarr);
        int [] c=indCol(colarr);
        for (int i=0;i<colarr.length;i++){
            System.out.printf("%s,%s\n",nm[c[i]],b[i]);
        }
    }

    static void pwsort(int[] powarr,String[] nm){

        int[] cc=sortElem(powarr);
        int[] dd=indPow(powarr);

        for (int i=0;i<powarr.length;i++){
            System.out.println(nm[dd[i]]+", "+cc[i]);
        }
    }
    static int[] sortElem(int[] arr){
        int[]b=new int[arr.length];
        for (int i=0;i<b.length;i++){
            b[i]=arr[i];
        }
        int[] c = new int[b.length];
        int[]   d=new int[b.length];
        int k, n = 0, i = 0,m;

        for (int v=0;v<b.length;v++){
            while (b[i] == 0 && i < b.length) {
                i++;
                n = i;
            }
            k = b[n];
            m=n;
            for (int j = 0; j < b.length; j++) {
                if (b[j] < k && b[j] != 0) {
                    k = b[j];
                    m = j;
                }
            }
            b[m]=0;
            c[v]=m;
            d[v]=k;
        }
        return d;
    }

    static int[] indPow(int[] arr){
        int[]b=new int[arr.length];
        for (int i=0;i<b.length;i++){
            b[i]=arr[i];
        }
        int[] c = new int[b.length];
        int[]   d=new int[b.length];
        int k, n = 0, i = 0,m;

        for (int v=0;v<b.length;v++){
            while (b[i] == 0 && i < b.length) {
                i++;
                n = i;
            }
            k = b[n];
            m=n;
            for (int j = 0; j < b.length; j++) {
                if (b[j] < k && b[j] != 0) {
                    k = b[j];
                    m = j;
                }
            }
            b[m]=0;
            c[v]=m;
            d[v]=k;
        }
        return c;
    }

    static String[] nam(String[] arr){
        String[] nm=new String[arr.length];
        for (int i=0;i<arr.length;i++){
            nm[i]=arr[i];
        }
        String  k=nm[0];

        int n=0;
        for (int j=0;j<nm.length;j++){
            k=nm[j];
            for (int i=j;i<nm.length;i++) {



                int m=0;
                while (m<nm[i].length()&&m<k.length()){
                    if (nm[i].charAt(m) < k.charAt(m)) {
                        k = nm[i];
                        nm[i] = nm[j];
                        nm[j] = k;
                        break;
                    }else if (nm[i].charAt(m) > k.charAt(m)){
                        break;
                    }
                    m++;
                }
            }
        }
        return nm;
    }

    static int[] indCol(String[] arr){
        String [] b=new String[arr.length];
        for (int i=0;i<b.length;i++){
            b[i]=arr[i];
        }
        int[] c = new int[b.length];
        String[]   d=new String[b.length];
        int n = 0, i = 0,m;
        String k;

        for (int v=0;v<b.length;v++){
            while (b[i] == "" && i < b.length) {
                i++;
                n = i;
            }
            k = b[n];
            m=n;
            for (int j = 0; j < b.length; j++) {
                int s=0;
                while (s<b[j].length()&&s<k.length()) {
                    if (b[j].charAt(s) < k.charAt(s) &&b[j]!="") {
                        k = b[j];
                        m = j;
                        break;
                    }else if (b[j].charAt(s) > k.charAt(s) &&b[j]!=""){
                        break;
                    }
                    s++;
                }
            }
            b[m]="";
            c[v]=m;
            d[v]=k;
        }
        return c;
    }
}
