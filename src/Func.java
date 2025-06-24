import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Func {

    public static void Sair(Scanner Entrada) {
        System.out.println("(----- pressione enter para sair -----)");
        String X = Entrada.nextLine();
    }

    public static boolean ValidaCommandos(String command) {
        List<String> commands = new ArrayList<>();
        commands.add("help");
        commands.add("status");
        commands.add("sair");
        commands.add("inventario");
        commands.add("explorar");
        commands.add("viajar");
        for (int i = 0; i < commands.size(); i++) {
            if (command.equals(commands.get(i))) {
                return true;
            } else {
                System.out.println("Comando inválido, digite help para ver os comandos disponíveis.");
                return false;
            }
            
        }
        return false;
    }

    public static void Help() {
        System.out.println("Comandos disponíveis:");
        System.out.println("help - Mostra os comandos disponíveis");
        System.out.println("status - Mostra o status do personagem");
        System.out.println("sair - Sai do jogo");
        System.out.println("inventario - Mostra o inventário do personagem");
        System.out.println("explorar - Explora o mundo do jogo");
        System.out.println("viajar - Viaja para outro local no jogo");
    }

    public static void Status(Character mainCharacter) {
        mainCharacter.getStatus();
    }

    public static void Explorar() {
        System.out.println("Você está explorando o mundo do jogo e se depara com: ");
    }



}