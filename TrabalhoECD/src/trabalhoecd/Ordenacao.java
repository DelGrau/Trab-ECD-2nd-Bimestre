package trabalhoecd;

/**
 *
 * @author Alan H
 */
public class Ordenacao {
    public Ordenacao(){
    }
    
    public int[] bubbleSort(int[] vetor){
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
        
        return vetor;
    }
    
    public int[] selectionSort(int[] vetor){
        
        for(int i = 0; i < vetor.length-1; i++){
            int posicaoMenor = i;
            
            for(int j = i+1; j < vetor.length; j++){
                if(vetor[j] < vetor[posicaoMenor]){
                    posicaoMenor = j;
                }
            }
            
            if(posicaoMenor != i){
                int aux = vetor[i];
                vetor[i] = vetor[posicaoMenor];
                vetor[posicaoMenor] = aux;
            }
        }
        
        return vetor;
    }
    
    public int[] insertionSort(int[] vetor){
        
        for (int i = 1; i < vetor.length; i++) {
            int key = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > key) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = key;
        }
    
        return vetor;
    }
}
