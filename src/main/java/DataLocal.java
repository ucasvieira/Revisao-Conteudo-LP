import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

public class DataLocal {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        System.out.println("Data atual: " + dataAtual);

        LocalDate novaData = dataAtual.plusDays(60);
        DayOfWeek diaSemana = novaData.getDayOfWeek();
        boolean fimDeSemana = diaSemana == DayOfWeek.SATURDAY || diaSemana == DayOfWeek.SUNDAY;
        System.out.println("Nova data: " + novaData + ". Fim de semana? " + fimDeSemana);

        String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        String formato = "%d de %s de %d";
        String dataFormatada = String.format(formato, novaData.getDayOfMonth(), meses[novaData.getMonthValue() - 1], novaData.getYear());
        System.out.println("Data formatada: " + dataFormatada);
    }
}
