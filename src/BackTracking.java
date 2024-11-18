import java.util.ArrayList;
import java.util.List;

public class BackTracking {

    int melhorSoma = 0;
    List<Placa> melhorCombinacao = new ArrayList<>();
    Placa placaDescartada = null;

    void backtrack(List<Placa> placas, List<Placa> atual, int somaA, int somaB, int index, Placa descartada) {

        if (index == placas.size()) {
            if (somaA == somaB && somaA > melhorSoma) {
                melhorSoma = somaA;
                melhorCombinacao = new ArrayList<>(atual);
                placaDescartada = descartada;
            }
            return;
        }

        Placa placa = placas.get(index);
        atual.add(placa);
        backtrack(placas, atual, somaA + placa.a, somaB + placa.b, index + 1, descartada);
        atual.remove(atual.size() - 1);

        Placa invertida = placa.inverter();
        atual.add(invertida);
        backtrack(placas, atual, somaA + invertida.a, somaB + invertida.b, index + 1, descartada);
        atual.remove(atual.size() - 1);

        if (descartada == null) {
            backtrack(placas, atual, somaA, somaB, index + 1, placa);
        }
    }
}

