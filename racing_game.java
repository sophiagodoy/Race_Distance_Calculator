// JOGO DE CORRIDA

// Importações necessárias 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    // Constante simbólica que converte km/h -> m/s
    public static final double KMH_TO_MS = 1000.0 / 3600.0;

    public static void main(String[] args) throws IOException {

        // Criando o leitor de entrada
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Lê o nome do carro
        System.out.print("Digite o nome do carro: ");
        String name = reader.readLine();

        // Lê a velocidade (como texto), e converte para double
        System.out.print("Digite a velocidade máxima (km/h): ");
        double speed = Double.parseDouble(reader.readLine());

        // Lê o tempo de corrida (como texto), e converte para double
        System.out.print("Digite o tempo de corrida (horas): ");
        double time = Double.parseDouble(reader.readLine());

        // Validação
        if (speed < 0 || time < 0) {
            System.err.println("Velocidade e tempo devem ser positivos.");
            return;
        }

        // Cálculo
        double distanceKm = calcularDistanciaKm(speed, time);
        double distanceM = distanceKm * 1000.0;
        double speedMs = speed * KMH_TO_MS;

        // Imprimindo os resultados formatados
        System.out.println("Carro: " + name);
        System.out.println("Velocidade máxima: " + speed + " km/h (" + speedMs + " m/s)");
        System.out.println("Tempo de corrida: " + time + " horas");
        System.out.println("Distância percorrida: " + distanceKm + " km (" + distanceM + " metros)");
    }

    // Método separado para calcular a distância
    static double calcularDistanciaKm(double speedKmH, double timeHours) {
        return speedKmH * timeHours;
    }
}
