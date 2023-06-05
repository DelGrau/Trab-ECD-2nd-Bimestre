package trabalhoecd.display;

import javax.swing.JOptionPane;

/**
 *
 * @author Alan H
 */
public class Menu {
    
    public void mainMenu(){
        int tam = Integer.parseInt(JOptionPane.showInputDialog("Insira o Tamanho do Vetor:"));
        Vetor vet = new Vetor();
        
        int[] vetor = new int[tam];
        
        String msg = "Insira o valor do Vetor: \n";
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(msg));
            msg += vetor[i]+" ";
        }
            
        int opcao = -1;
        while(opcao !=0){
           
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    """
                    ======= Menu Principal =======
                    [1] - Bubble Sort
                    [2] - Selection Sort
                    [3] - Insertion Sort
                    [0] - Sair
                    
                    """));                                             
            
            switch (opcao) {
                case 1 : 
                    vet.bubbleSort(vetor);
                    break;
                    
                default : break;
            }
        }
    }
}
