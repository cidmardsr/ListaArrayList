
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Cidmar
 */
public class Exercicio01 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 4° número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 5° número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 6° número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 7° número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 8° número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 9° número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 10° número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 11° número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 12° número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 13° número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 14° número")));
        numeros.add(Integer.parseInt(JOptionPane.showInputDialog("Digite o 15° número")));
        
        int numeroPosicao0 = numeros.get(0); 
        int numeroPosicao1 = numeros.get(1); 
        int numeroPosicao2 = numeros.get(2); 
        int numeroPosicao3 = numeros.get(3); 
        int numeroPosicao4 = numeros.get(4); 
        int numeroPosicao5 = numeros.get(5); 
        int numeroPosicao6 = numeros.get(6); 
        int numeroPosicao7 = numeros.get(7); 
        int numeroPosicao8 = numeros.get(8); 
        int numeroPosicao9 = numeros.get(9); 
        int numeroPosicao10 = numeros.get(10); 
        int numeroPosicao11 = numeros.get(11); 
        int numeroPosicao12 = numeros.get(12); 
        int numeroPosicao13 = numeros.get(13);
        int numeroPosicao14 = numeros.get(14);
        
        JOptionPane.showMessageDialog(null, "1° número: " + numeroPosicao0
        + "\n2° número: " + numeroPosicao1 + "\n3° número: " + numeroPosicao2
        + "\n4° número: " + numeroPosicao3 + "\n5° número: " + numeroPosicao4
        + "\n6° número: " + numeroPosicao5 + "\n7° número: " + numeroPosicao6
        + "\n8° número: " + numeroPosicao7 + "\n9° número: " + numeroPosicao8
        + "\n10° número: " + numeroPosicao9 + "\n11° número: " + numeroPosicao10
        + "\n12° número: " + numeroPosicao11 + "\n13° número: " + numeroPosicao12
        + "\n14° número: " + numeroPosicao13 + "\n15° número: " + numeroPosicao14);
        
    }

}
