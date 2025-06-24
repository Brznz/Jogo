import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Entrada = new Scanner(System.in);
        boolean jogoIniciado = false;
        boolean registrado = false;
        Character mainCharacter = new Character();
        boolean jogorodando = true;
        while (jogorodando) {
            System.out.println("      Seja bem-vindo");
            System.out.println("--------- Menu ---------");
            System.out.println("|                      |");
            System.out.println("|1   Iniciar jogo      |");
            System.out.println("|2   Creditos          |");
            System.out.println("|3   Ajuda             |");
            System.out.println("|4   Sair              |");
            System.out.println("|                      |");
            System.out.println("------------------------");
            System.out.print("Digite a opção desejada: ");
            int opcao = Entrada.nextInt();
            switch (opcao) {
                case 1: {
                    while (registrado == false) {

                        registrado = mainCharacter.registro(Entrada);
                        if (registrado) {
                            System.out.println("Registrado com Sucesso! sua aventura vai começar!");
                            jogoIniciado = true;
                            break;
                        } else {
                            Func.Sair(Entrada);
                            break;
                        }
                    }
                    while (jogorodando) {
                        mainCharacter.getStatus();
                        System.out.println("todos os commandos devem iniciar com /");
                        System.out.println("digite /help para ver os commandos");
                        while (jogorodando) {
                            System.out.println("digite o commando");
                            String command = Entrada.next();
                            Func.ValidaCommandos(command);


                            
                        }

                    }
                }

                case 2: {

                    System.out.println("Desenvolvido por: Luiz gustavo");
                    System.out.println("baseado em animes e jogos como: SAO, Mushoku tensei, Elden Ring e Skyrim mencoes honrosas para dark souls");
                    System.out.println("Fiz esse jogo so para praticar e colocar no github");
                    System.out.println("Espero que seja uma empresa grande e famosa que esteja vendo isso");
                    System.out.printf(
                            "Se voce entiver vendo isso antes de jogar, jogue primeiro, os creditos sao realmente chatos%n e nao servem para praticamente nada:/%n");
                    System.out.println(
                            "começado dia 23/06/2025 as 22:00 aproximadamente terminado dia **/**/2025 as **:**");
                    break;
                }
                case 3: { // switch para sair do jogo:|
                    System.out.println("Obrigado por jogar!");
                    System.out.println("Espero ver-lo novamente!");
                    jogorodando = false;
                    break;
                }
                default:
                    break;
            }
        }
    }
}
