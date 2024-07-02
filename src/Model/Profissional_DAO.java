package Model;

import javax.swing.JOptionPane;
import java.awt.Font;
import static View.Registro_GUI.nome_txt;
import static View.Registro_GUI.especialidade_txt;
import static View.Registro_GUI.procedimento_txt;
import static View.Registro_GUI.duracao_txt;
import static View.Registro_GUI.data_txt;

import static View.Evolucao_GUI.especialidade_lbl;
import static View.Evolucao_GUI.nome_lbl;
import static View.Evolucao_GUI.evolucao_lbl;

public class Profissional_DAO {
    
    public static String data = "";
    public static String duracao = "";
    public static String especialidade = "";
    public static int idRegistro = 0;
    public static String nome = "";
    public static String procedimento = "";
    public static String[] registros = new String[10];
    
    
    //Método para registrar um novo procedimento
    public static void registrar(){
         //Verifica se tem espaço suficiente no vetor
        if(idRegistro > registros.length){
            JOptionPane.showMessageDialog(null, "Sem espaço de armazenamento suficiente.");
        }
        else{
        String registroCompleto = "";
        
        registroCompleto += "ID: " + idRegistro;
        
        //Pega o texto inserido nas caixas de texto e armazena na variável de registro
        nome  = nome_txt.getText();
        especialidade  = especialidade_txt.getText();
        procedimento = procedimento_txt.getText();
        registroCompleto += " | Procedimento: " + procedimento;
        
        duracao  = duracao_txt.getText();
        registroCompleto += " | Duração: " + duracao;
        
        data  = data_txt.getText();
        registroCompleto += " | Data: " + data;
        
        //Insere um registro completo no vetor registros[]
        registros[idRegistro] = registroCompleto;
        
        JOptionPane.showMessageDialog(null, registroCompleto);
        idRegistro++;
        }
        
        //Limpa os campos de registro
        limpar();
    }
    
    //Método para exibir os registros já feitos para verificar evolução
    public static void consultarEvolucao(){
        //Coloca o nome e especialidade na label da tela com uma fonte específica
        Font novaFonte = new Font("Arial", Font.BOLD, 18);
        StringBuilder total = new StringBuilder("<html>");
        nome_lbl.setText(String.valueOf(nome));
        nome_lbl.setFont(novaFonte);
        especialidade_lbl.setText(String.valueOf(especialidade));
        especialidade_lbl.setFont(novaFonte);
        
        //Exibe todos os registros existentes no vetor
        //Utiliza de tags html para mostrar os registros um embaixo do outro
        for (int cont = 0; cont < idRegistro; cont++) {
            total.append(registros[cont]).append("<br>");
        }
        total.append("</html>");
        
        evolucao_lbl.setText(total.toString());
    }
    
    //Método para limpar os campos
    public static void limpar(){
        nome_txt.setText("");
        especialidade_txt.setText("");
        procedimento_txt.setText("");
        duracao_txt.setText("");
        data_txt.setText("");
    }
    
}

