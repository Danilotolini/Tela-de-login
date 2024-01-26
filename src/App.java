import javax.swing.JOptionPane; 
public class App {  
    public static void main(String[] args) throws Exception { 
    String nome = JOptionPane.showInputDialog(null, "Insira o seu nome", "Login", JOptionPane.QUESTION_MESSAGE); 
    String senha =  JOptionPane.showInputDialog(null, "Insira a sua senha", "", JOptionPane.QUESTION_MESSAGE);
    JOptionPane.showMessageDialog(null, "Seja bem vindo(a) " + nome , "", JOptionPane.INFORMATION_MESSAGE);  
    JOptionPane(null, senha);
}

    private static void JOptionPane(Object object, String senha) {
        throw new UnsupportedOperationException("Unimplemented method 'JOptionPane'");
    } 
}