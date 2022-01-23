import java.util.Scanner;

public class Brad {
    public int inaltime;
    public int tulpina;
    public Brad(int inaltime) {
        this.inaltime = inaltime;
        this.tulpina=inaltime/3;
    }

    public void AfisareBradDinArray(String[][] brad){
        for(int i=0;i<inaltime+tulpina;i++){
            for (int j=0;j<((inaltime*2));j++){
                System.out.print(brad[i][j]);
            }
            System.out.println();
        }
    }
    public String[][] InitArrayBrad(){
        String brad[][]=new String[inaltime+tulpina][((inaltime*2))];
        for(int i=0;i<inaltime+tulpina;i++){
            if(i<inaltime){
                for(int j=0;j<(inaltime*2);j++){
                    if(j<((inaltime-i))){
                        brad[i][j]=" ";
                    }else if(j>=(inaltime-i)&&j<=(inaltime+i)){
                        for(int k=0;k<((2*i)+1);k++){
                            brad[i][j]="*";
                            if(k==(2*i)){
                                break;
                            }else {
                                j++;
                            }
                        }
                    }else{
                        brad[i][j]=" ";
                    }
                }
            }else{
                for(int j=0;j<(inaltime*2);j++){
                    if(tulpina>=2 && j==inaltime-(tulpina/2)){
                        for(int k=0;k<=tulpina;k++){
                            brad[i][j]="*";
                            if(k==tulpina){
                                break;
                            }else {
                                j++;
                            }
                }
                    }else if(tulpina<2 && j==inaltime){
                    brad[i][j]="*";
                }else {
                        brad[i][j]=" ";
                    }
        }
            }
        }
        return brad;
    }
    public void AfisareBradInConsola(){
        //int tulpina=inaltime/4;
        for (int i = 0; i < inaltime+tulpina; i++) {

            if(i<inaltime){
                for (int j = 0; j < inaltime - i; j++){
                    System.out.print(" ");
                }

                for (int k = 0; k < (2 * i + 1); k++){
                    System.out.print("*");
                }
            }else{
                for(int t=0;t<(((inaltime*2)-1)/2);t++){
                    System.out.print(" ");
                }
                for(int tp=(inaltime/2);tp<inaltime;tp++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int h;
        Scanner keyboard=new Scanner(System.in);
        System.out.println ("Introduceti inaltimea bradului:");
        h=keyboard.nextInt();
        Brad brad1=new Brad(h);
        String arrayBrad[][]=brad1.InitArrayBrad();
        brad1.AfisareBradDinArray(arrayBrad);
    }
}
