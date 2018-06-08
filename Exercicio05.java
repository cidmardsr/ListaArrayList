
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Alunos
 */
public class Exercicio05 {
    
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            nomes.add
            JOptionPane.showInputDialog("Digite o " + (i+1) + "° nome");
        }
        for(int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
    }
    
}
