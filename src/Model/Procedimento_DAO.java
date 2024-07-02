
package Model;

import java.util.Date;
import java.time.Duration;
import java.time.LocalTime;
import javax.swing.JOptionPane;

import static View.Procedimento_GUI.exibeTempo1_lbl;
import static View.Procedimento2_GUI.exibeTempo2_lbl;

public class Procedimento_DAO {
    
    public static int horaInicial = 0;
    public static int minutoInicial = 0;
    public static int segundoInicial = 0;
    
    public static int horaFinal = 0;
    public static int minutoFinal = 0;
    public static int segundoFinal = 0;
    
    public static long intervalo = 0;
    
    //Método para capturar a hora em que o procedimento é inicíado
    public static void capturaInicio(){
        Date tempo = new Date();
        horaInicial = tempo.getHours();
        minutoInicial = tempo.getMinutes();
        segundoInicial = tempo.getSeconds();
    }
    
    //Método para capturar a hora em que o procedimento é finalizado
    public static void capturaFim(){
        Date tempo = new Date();
        horaFinal = tempo.getHours();
        minutoFinal = tempo.getMinutes();
        segundoFinal = tempo.getSeconds();
    }
    
    //Calcula o intervalo de tempo entre o tempo inicial capturado e o final capturado
    public static void calculaIntervalo(){
        LocalTime inicio = LocalTime.of(horaInicial, minutoInicial, segundoInicial);
        LocalTime fim = LocalTime.of(horaFinal, minutoFinal, segundoFinal);
        
        Duration duracao = Duration.between(inicio, fim);
        
        //Aqui está sendo utilizado os segundos ao invés de minutos apenas para testes e praticidade
        long segundos = duracao.getSeconds();
        intervalo = segundos;
        JOptionPane.showMessageDialog(null, "Duração do procedimento: " + intervalo + " minutos");
    }
    
    //Verifica o valor do tempo total do procedimento 1 para emitir uma mensagem informando a agilidade do médico residente
    public static void calculaProcesso1(){
        if(intervalo <= 40){
            JOptionPane.showMessageDialog(null, "Você atingiu o nível de especialista");
            exibeTempo1_lbl.setText("Duração: " + intervalo + " minutos.");
        }
        else if(intervalo <= 60){
            JOptionPane.showMessageDialog(null, "Necessário mais agilidade no processo, pois a risco eminente ao paciente devido a demora");
            exibeTempo1_lbl.setText("Duração: " + intervalo + " minutos.");
        }
        else if(intervalo <= 80){
            JOptionPane.showMessageDialog(null, "Procedimento está colocando em risco a saúde do paciente, necessário maior pericia por parte do cirurgião");
            exibeTempo1_lbl.setText("Duração: " + intervalo + " minutos.");
        } else {
            JOptionPane.showMessageDialog(null, "Necessário mais horas de treinamento, processos acima de 80 minutos podem causar o óbito do paciente");
            exibeTempo1_lbl.setText("Duração: " + intervalo + " minutos.");
        }
    }
    
    //Verifica o valor do tempo total do procedimento 2 para emitir uma mensagem informando a agilidade do médico residente
    public static void calculaProcesso2(){
        if(intervalo <= 15){
            JOptionPane.showMessageDialog(null, "Você atingiu o nível de especialista");
            exibeTempo2_lbl.setText("Duração: " + intervalo + " minutos.");
        }
        else if(intervalo <= 30){
            JOptionPane.showMessageDialog(null, "Necessário mais agilidade no processo, pois a risco eminente ao paciente devido a demora");
            exibeTempo2_lbl.setText("Duração: " + intervalo + " minutos.");
        }
        else if(intervalo <= 40){
            JOptionPane.showMessageDialog(null, "Procedimento está colocando em risco a saúde do paciente, necessário maior pericia por parte do cirurgião");
            exibeTempo2_lbl.setText("Duração: " + intervalo + " minutos.");
        } else {
            JOptionPane.showMessageDialog(null, "Necessário mais horas de treinamento, processos acima de 40 minutos podem causar o óbito do paciente");
            exibeTempo2_lbl.setText("Duração: " + intervalo + " minutos.");
        }
    }
}
