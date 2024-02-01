import javax.swing.*;

public class Login2 {
    public static void main(String[] args) {
        JTextField Campodeusuario = new JTextField();
        JPasswordField Campodesenha = new JPasswordField();
        Campodesenha.setEchoChar('*'); // Esta linha oculta os caracteres digitados no campo de senha

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.add(new JLabel("Usuário:"));
        panel.add(Campodeusuario);
        panel.add(new JLabel("Senha:"));
        panel.add(Campodesenha);

        int result = JOptionPane.showConfirmDialog(null, panel, "Login", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            String usuario = Campodeusuario.getText();
            String Senha = new String(Campodesenha.getPassword());
            String Senhacerta = "1234";

            if (Senha.equals(Senhacerta)) {
                JOptionPane.showMessageDialog(null, "Bem vindo(a), " + usuario + "!", "Concluido com sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Senha ou nome de usuário incorretos ", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Login cancelado", "Cancelado", JOptionPane.WARNING_MESSAGE);
        }
    }
}
