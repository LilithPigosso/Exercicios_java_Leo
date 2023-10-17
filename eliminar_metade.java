import java.util.*;


public class eliminar_metade {
    public static void main(String[] args) {
        List<String> ListaTurma = (Arrays.asList("allana", "angelo", "caio", "carlos", "diego_alencar", "diego_castan",
                "eduarda", "esther", "felipe", "gabriel", "radaeli", "alves", "vieira", "henrique", "julia", "laura",
                "lucas", "nicole"));

        if ((ListaTurma.size() % 2 == 1)) {
            for (int i = 0; i < ListaTurma.size()/2 - 1; i++) {
                String selecionada = ListaTurma.get(new Random().nextInt(ListaTurma.size()));
                System.out.println(selecionada);
            }
        } else {
            for (int i = 0; i < 9; i++) {
                String selecionada = ListaTurma.get(new Random().nextInt(ListaTurma.size()));
                System.out.println(selecionada);

            }
        }
    }
}
