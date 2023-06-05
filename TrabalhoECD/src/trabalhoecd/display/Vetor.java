package trabalhoecd.display;

import javax.swing.JOptionPane;

/**
 *
 * @author Alan H
 * @since 06/2023
 */
public class Vetor {    

    public Vetor(){
    }
    
    public void bubbleSort(int[] vetor){
        int aux;
        
        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j<vetor.length-1; j++){
                if(vetor[j] > vetor[j + 1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
	}
    }
    
    public void selectionSort(int[] vetor){
        
    }
    
    public void insertionSort(int[] vetor){
        
    }
}