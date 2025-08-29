// JOGO DE CORRIDA 

public class Main {

    // Constante simbólica que converte km/h -> m/s 
    public static final double KMH_TO_MS = 1000.0 / 3600.0;
    
    public static void main(String[] args) {

        // Declarando as variáveis
        String name  = "Relâmpago Marquinhos";
        double speed = 180.0;  // em km/h  
        double time  = 1.5;    // em horas     

        // Verifica se velocidade e tempo é negativo
        if (speed < 0 || time < 0) {
            System.err.println("Velocidade e tempo devem ser positivos.");
            return;
        }
        
        // Chama a função do método separado 
        double distanceKm = calcularDistanciaKm(speed, time); 
        
        // Calcula a distancia percorrida em metros
        double distanceM = distanceKm * 1000.0;
        
        // Calcula a velocidade percorrida em m/s
        double speedMs = speed * KMH_TO_MS;
        
        // Imprime os resultado usando o formato String
        String output = String.format(
            "Carro: %s%n" +
            "Velocidade máx.: %.2f km/h (%.2f m/s)%n" +
            "Tempo de corrida: %.2f h%n" +
            "Distância percorrida: %.2f km (%.0f m)%n",
            name, speed, speedMs, time, distanceKm, distanceM
        );
        System.out.print(output);
    }

    // Cálculo em método separado que faz o cáculo da distancia 
    static double calcularDistanciaKm(double speedKmH, double timeHours) {
        return speedKmH * timeHours;
    }
}
