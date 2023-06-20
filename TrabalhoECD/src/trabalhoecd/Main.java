package trabalhoecd;

import java.util.Random;
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
        Random generator = new Random();
        
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Insira o tamanho do vetor:"));
        int[] vetor = new int[tamanho];
        int[] vetAntigo, vetNovo;
        long inicioExec, fimExec;
        double tempoExec;
        String opc = "";
        String message = "";
        
        JOptionPane.showMessageDialog(null, "Iniciando Vetor...");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = generator.nextInt();
        }
        
        while (!"0".equals(opc)){
            opc = JOptionPane.showInputDialog("""
                                                ======= Menu Principal =======
                                                [1] - Bubble Sort
                                                [2] - Selection Sort
                                                [3] - Insertion Sort
                                                [0] - Sair

                                                """);

            switch (opc) {
                case "1" : 
                    message = "";
                    vetAntigo = vetor;

                    inicioExec = System.currentTimeMillis();
                    vetNovo = ord.bubbleSort(vetor);
                    fimExec = System.currentTimeMillis();
                    
                    tempoExec = (fimExec - inicioExec)*0.0001;
                    
                    for (int i = 0; i < 10; i++) {
                        message += " "+vetAntigo[i];
                    }
                    message += "...\n";
                    
                    for (int i = 0; i < 10; i++) {
                        message += " "+vetNovo[i];
                    }
                    message += "...\n Tempo de Execução: "+tempoExec+"ms";
                    
                    JOptionPane.showMessageDialog(null, message);
                    break;
                    
                case "2" :
                    message = "";
                    vetAntigo = vetor;
                    
                    inicioExec = System.currentTimeMillis();
                    vetNovo = ord.selectionSort(vetor);
                    fimExec = System.currentTimeMillis();
                    
                    tempoExec = (fimExec - inicioExec)*0.0001;
                    
                    for (int i = 0; i < 10; i++) {
                        message += " "+vetAntigo[i];
                    }
                    message += "...\n";
                    
                    for (int i = 0; i < 10; i++) {
                        message += " "+vetNovo[i];
                    }
                    message += "...\n Tempo de Execução: "+tempoExec+"ms";
                    
                    JOptionPane.showMessageDialog(null, message);
                    break;
                    
                case "3" :
                    message = "";

                    vetAntigo = vetor;
                    
                    inicioExec = System.currentTimeMillis();
                    vetNovo = ord.insertionSort(vetor);
                    fimExec = System.currentTimeMillis();
                    
                    tempoExec = (fimExec - inicioExec)*0.0001;
                    
                    for (int i = 0; i < 10; i++) {
                        message += " "+vetAntigo[i];
                    }
                    message += "...\n";
                    
                    for (int i = 0; i < 10; i++) {
                        message += " "+vetNovo[i];
                    }
                    message += "...\n Tempo de Execução: "+tempoExec+"ms";
                    
                    JOptionPane.showMessageDialog(null, message);
                    break;
                

                case "0" : 
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                
                
                default :
                    JOptionPane.showMessageDialog(null, "Opção Inválida...");
                    break;
                
            }
        } 
    }
}
