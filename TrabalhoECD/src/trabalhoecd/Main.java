package trabalhoecd;

import javax.swing.JOptionPane;

/**
 *
 * @author Alan H
 */
public class Main {
    
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        Ordenacao ord = new Ordenacao();
        
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho do vetor:"));
        int[] vetor = new int[tamanho];
        int[] vetAntigo, vetNovo;
        long inicioExec, fimExec;
        double tempoExec;
        String opc = "";
        
        do{
            opc = JOptionPane.showInputDialog("""
                                                ======= Menu Principal =======
                                                [1] - Bubble Sort
                                                [2] - Selection Sort
                                                [3] - Insertion Sort
                                                [0] - Sair

                                                """);

            switch (opc) {
                case "1" :
                    vetAntigo = vetor;

                    inicioExec = System.currentTimeMillis();
                    vetNovo = ord.bubbleSort(vetor);
                    fimExec = System.currentTimeMillis();

                    tempoExec = (fimExec - inicioExec)*0.0001;  
                    
                    JOptionPane.showConfirmDialog(null, "");
                    break;
                    
                case "2" :
                    vetAntigo = vetor;
                    
                    inicioExec = System.currentTimeMillis();
                    vetNovo = ord.selectionSort(vetor);
                    fimExec = System.currentTimeMillis();

                    tempoExec = (fimExec - inicioExec)*0.0001; 
                            
                    JOptionPane.showConfirmDialog(null, "");
                    break;
                    
                case "3" :
                    vetAntigo = vetor;
                    
                    inicioExec = System.currentTimeMillis();
                    vetNovo = ord.insertionSort(vetor);
                    fimExec = System.currentTimeMillis();

                    tempoExec = (fimExec - inicioExec)*0.0001; 
                            
                    JOptionPane.showConfirmDialog(null, "");
                    break;

                default:
                    throw new AssertionError();
            }
        } while (!"0".equals(opc));
    }
}
