import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	Scanner intscanner = new Scanner(System.in);
	int n,r,fak=1,fak1=1,fak2=1,comb;
	System.out.println("Küme kaç elemanlı: ");
	n = intscanner.nextInt();
	System.out.println("Kaç elemanlı alt küme kombinasyonunu görmek istiyorsunuz: ");
	r = intscanner.nextInt();
	int t = n - r;

	for(int i=1;i<=n;i++){
	    fak = fak *i;
    }
	for(int j=1;j<=r;j++){fak2=fak2*j;}

	for(int k=1;k<=t;k++){fak1=fak1*k;}

	comb=fak/(fak2*fak1);
	System.out.println("C("+n+","+r+") = "+comb);

    }

}
