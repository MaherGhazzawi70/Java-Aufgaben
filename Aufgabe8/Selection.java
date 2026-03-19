package Aufgabe8;
import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] selection = {45,52,2,1,0,98,445,4,42,65,3,12,11,20,42};
        int[] selectionAbsteigend = {45,52,2,1,0,98,445,4,42,65,3,12,11,20,42};
        for(int i = 0;i < selection.length - 1; i++){
            for(int j = 0; j < selection.length - 1 - i; j++){
                if(selection[j] > selection[j + 1]){
                    int temp = selection[j];
                    selection[j] = selection[j+1];
                    selection[j+1] = temp;
                }
            }
        }
        for(int i = 0;i < selectionAbsteigend.length - 1; i++){
            for(int j = 0; j < selectionAbsteigend.length - 1 - i; j++){
                if(selectionAbsteigend[j] < selectionAbsteigend[j + 1]){
                    int temp = selectionAbsteigend[j];
                    selectionAbsteigend[j] = selectionAbsteigend[j+1];
                    selectionAbsteigend[j+1] = temp;
                }
            }
        }
         System.out.println(" Sortiert aufsteigend : " + Arrays.toString(selection));
         System.out.println(" Sortiert absteigend : " + Arrays.toString(selectionAbsteigend));
    }
}
