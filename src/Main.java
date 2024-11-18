import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> resultados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int n = -100000;

        long fim = 0;
        long inicio = 0;
        while (n != 0) {
            n = scanner.nextInt();
            if(n != 0);{
                List<Placa> placas = new ArrayList<>();

                for (int i = 0; i < n; i++) {
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    placas.add(new Placa(a, b));
                }

                inicio = System.nanoTime();

                BackTracking backTracking = new BackTracking();
                backTracking.backtrack(placas, new ArrayList<>(), 0, 0, 0, null);

                fim = System.nanoTime();


                StringBuilder resultado = new StringBuilder();
                if (backTracking.melhorSoma == 0 && backTracking.melhorCombinacao.isEmpty()) {
                    resultado.append("Impossivel");
                } else {
                    resultado.append("Maior soma possível: ").append(backTracking.melhorSoma).append("\n");
                    resultado.append("Combinacao: ").append(backTracking.melhorCombinacao).append("\n");
                    if (backTracking.placaDescartada != null) {
                        resultado.append("Placa descartada: ").append(backTracking.placaDescartada).append("\n");
                    }
                }
                resultados.add(resultado.toString());
            }
        }

        for (String resultado : resultados) {
            System.out.println(resultado);
        }
        System.out.println((fim - inicio) / 1_000_000);
    }
}
