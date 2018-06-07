
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Cidmar
 */
public class Exercicio02 {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add(JOptionPane.showInputDialog("Digite o 1° nome"));
        nomes.add(JOptionPane.showInputDialog("Digite o 2° nome"));
        nomes.add(JOptionPane.showInputDialog("Digite o 3° nome"));
        nomes.add(JOptionPane.showInputDialog("Digite o 4° nome"));
        nomes.add(JOptionPane.showInputDialog("Digite o 5° nome"));
        nomes.add(JOptionPane.showInputDialog("Digite o 6° nome"));
        nomes.add(JOptionPane.showInputDialog("Digite o 7° nome"));
        nomes.add(JOptionPane.showInputDialog("Digite o 8° nome"));
        nomes.add(JOptionPane.showInputDialog("Digite o 9° nome"));
        
        String nomePosicao0 = nomes.get(0);
        String nomePosicao1 = nomes.get(1);
        String nomePosicao2 = nomes.get(2);
        String nomePosicao3 = nomes.get(3);
        String nomePosicao4 = nomes.get(4);
        String nomePosicao5 = nomes.get(5);
        String nomePosicao6 = nomes.get(6);
        String nomePosicao7 = nomes.get(7);
        String nomePosicao8 = nomes.get(8);
        
        JOptionPane.showMessageDialog(null, nomePosicao0 + "\n" + nomePosicao1
        + "\n" + nomePosicao2 + "\n" + nomePosicao3 + "\n" + nomePosicao4 + "\n" + nomePosicao5
        + "\n" + nomePosicao6 + "\n" + nomePosicao7 + "\n" + nomePosicao8 + "\n");

    }

}
