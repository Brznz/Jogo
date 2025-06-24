import java.util.List;
import java.util.ArrayList;
import java.util.Random;



public class Acontecimentos {

    public void AcontecimentoVilareijo() {

    }

    public void AcontecimentoFloresta(List<String> acontecimentos, List<String> acontecimentosIndex, int acontecimentosIndexInt) {
        System.out.println("é literalmente uma floresta ta esperando o que um godfrey selvagem? o maculado comendo o fiote da malenia na porrada? zoas");
        System.out.println("nao tem literlamete nada :/");
        acontecimentos.remove(acontecimentosIndexInt);
        acontecimentosIndex.remove(acontecimentosIndexInt);
    }

    public void AcontecimentoBau(List<String> acontecimentos, List<String> acontecimentosIndex, int acontecimentosIndexInt) {
        System.out.println("Você encontrou um bau, apos abrir ele você encontrou uma espada de madeira, que da 5 de dano, e uma armadura de malha, que da 2 de defesa.");
        acontecimentos.remove(acontecimentosIndexInt);
        acontecimentosIndex.remove(acontecimentosIndexInt);
    }

    public void AcontecimentoBauArmadilha() {
        System.out.println("Você encontrou um bau, mas ele é um monstro");
        Inimigos mimico = new Inimigos();
        mimico.setinfoInimigoBauArmadilha();
    }
    
    public void AcontecimentoNpcVendedor() {

    }
}