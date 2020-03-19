public class ZY {
    public static void main(String[] args) {
        int a[] = new int[54];
        int a1[] = new int[17];
        int a2[] = new int[17];
        int a3[] = new int[17];
        int t;
        for(int i=0;i<a.length;i++) {
            a[i]=i+1;
        }
        for(int i=0;i<50;i++) {
            int x=(int)(Math.random()*54);
            int y=(int)(Math.random()*54);
            t=a[x];
            a[x]=a[y];
            a[y]=t;
        }
        System.out.print("a1的牌：");
        for (int i = 0; i < 17; i++) {
            a1[i]=a[i];
            System.out.print(a1[i]+" ");
        }
        System.out.println();
        System.out.print("a2的牌：");
        int n=0;
        for (int i = 16; i < 17*2-1; i++) {
            a2[n]=a[i];
            System.out.print(a2[n]+" ");
            n++;
        }
        System.out.println();
        System.out.print("a3的牌：");
        int z=0;
        for (int i = 17*2-1; i < 17*3-1; i++) {
            a3[z]=a[i];
            System.out.print(a3[z]+" ");
            z++;
        }



        /*System.out.print("a1的牌：");
        for (int i : a1) {
            System.out.print(i+" ");
        }

        for (int i : a2) {
            System.out.print(i+" ");
        }

        for (int i : a3) {
            System.out.print(i+" ");
        }*/


		/*for (int i = 0; i < 54; i++) {
			if (i%3==0) {
				a1[i]=a[i];
			}else if (i%3==1) {
				a2[i]=a[i];
			}else if (i%3==2) {
				a3[i]=a[i];
			}
		}
		for (int i = 0; i < 17; i++) {
			System.out.print(a3[i]+" ");
		}*/
    }
}
