public class Tabuada{

    public static void main(String[] args){
        int res;
        for(int x=1; x<=10;x++){
            System.out.println("----- Tabuada do "+x+" -----");
            for(int i=1; i<=10;i++){
                res = x*i;
                System.out.println(x +" x "+i+" = "+res);
            }
        }
    }
    
}