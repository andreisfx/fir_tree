import java.awt.event.WindowAdapter;
import java.util.Arrays;
import java.util.Scanner;

public class CreateTree {
    public int inaltime;
    public int tulpina;
    public CreateTree(int inaltime) {
        this.inaltime = inaltime;
        this.tulpina=inaltime/4;
    }

    public void AfisareBrad(String[][] brad){
        for(int i=0;i<inaltime;i++){
            for (int j=0;j<((inaltime*2));j++){
                System.out.print(brad[i][j]);
            }
            System.out.println();
        }
    }
    public String[][] InitArrayBrad(){
        String brad[][]=new String[inaltime][((inaltime*2))];
        for(int i=0;i<inaltime;i++){

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
        }
        return brad;
    }
    public void InitBrad(){
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

    public static void main(String[] args) {
        int h;
        Scanner keyboard=new Scanner(System.in);
        System.out.println ("Introduceti inaltimea bradului:");
        h=keyboard.nextInt();
        CreateTree createTree=new CreateTree(h);
        //createTree.InitBrad();
        String brad[][]=createTree.InitArrayBrad();
        createTree.AfisareBrad(brad);
    }
}
