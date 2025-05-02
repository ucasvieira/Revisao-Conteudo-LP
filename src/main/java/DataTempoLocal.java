import java.time.LocalDateTime;

public class DataTempoLocal {
    public static void main(String[] args) {
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println("Data e hora atual: " + dataHoraAtual);

        LocalDateTime novaDataHora = dataHoraAtual.plusHours(2).plusMinutes(30);
        System.out.println("Nova data/hora: " + novaDataHora);

        int ano = novaDataHora.getYear();
        int mes = novaDataHora.getMonthValue();
        int dia = novaDataHora.getDayOfMonth();
        int hora = novaDataHora.getHour();
        int minuto = novaDataHora.getMinute();

        System.out.println("Ano: " + ano);
        System.out.println("Mês: " + mes);
        System.out.println("Dia: " + dia);
        System.out.println("Hora: " + hora);
        System.out.println("Minuto: " + minuto);
    }
}
