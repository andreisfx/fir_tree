public class CreateTree {
    public static void main(String[] args) {
            int inaltime=20;
            int tulpina=inaltime/4;
        for (int i = 0; i < inaltime+tulpina; i++) {

            if(i<=inaltime){
                for (int j = 0; j < inaltime - i; j++){
                    System.out.print(" ");
                }

                for (int k = 0; k < (2 * i + 1); k++){
                    System.out.print("*");
                }
            }else{
                for(int t=0;t<(inaltime-tulpina);t++){
                    System.out.print(" ");
                }
                for(int tp=(inaltime/2);tp<inaltime;tp++){
                    System.out.print("*");
                }
            }



            System.out.println();
        }
    }
}
