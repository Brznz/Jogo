import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Character {

    private List<String> acontecimentos = new ArrayList<>();
    private List<String> acontecimentosIndex = new ArrayList<>();
    public int acontecimentosIndexInt = 0;

    String nome;
    int idade;
    String classe;
    int nivel = 0;
    int vida = 0;
    int mp = 0;
    int dano = 0;
    int defesa = 0;
    int danoMagico = 0;
    double xp = 0;
    int level = 0;

    public void getStatus() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Classe: " + this.classe);


    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMP() {
        return this.mp;
    }

    public void setMPN(int MP) {
        this.mp = MP;
    }

    public int getDano() {
        return this.dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getDefesa() {
        return this.defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getDanoMagico() {
        return this.danoMagico;
    }

    public void setDanoMagico(int danoMagico) {
        this.danoMagico = danoMagico;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getXp() {
        return this.xp;
    }

    public void setXp(double xp) {
        this.xp = xp;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }



    public boolean registro(Scanner Entrada) {
        List<String> classes = new ArrayList<>();
        classes.add("Guerreiro");
        classes.add("Mago");
        classes.add("Assasino");
        classes.add("Fada");
        classes.add("Deus");
        try {
            System.out.print("por favor digite o nome do personagem: ");
            String nome = Entrada.next();
            System.out.print("Por favor digite a idade do personagem: ");
            int idade = Entrada.nextInt();
            this.nome = nome;
            this.idade = idade;
            System.out.println("Por favor escolha uma classe, disponiveis: ");
            System.out.println("1  Guerreiro");
            System.out.println("2  Mago");
            System.out.println("3  Assasino");
            System.out.println("4  Fada");
            System.out.println("5  Deus");
            System.out.print("Digite a classe: ");

        } catch (Exception e) {
            System.out.println("Entrada inválida");
            // TODO: handle exception
        }

        try {
            int classe = Entrada.nextInt();
            if (classe >= 1 && classe <= 6) {

                this.classe = classes.get(classe - 1);
                switch (classe) {
                    case 1:
                        this.nivel = 1;
                        this.vida = 100;
                        this.mp = 10;
                        this.dano = 15;
                        this.defesa = 5;
                        this.danoMagico = 2;
                        break;
                    case 2:
                        this.nivel = 1;
                        this.vida = 80;
                        this.mp = 30;
                        this.dano = 5;
                        this.defesa = 2;
                        this.danoMagico = 20;
                        break;
                    case 3:
                        this.nivel = 1;
                        this.vida = 70;
                        this.mp = 20;
                        this.dano = 20;
                        this.defesa = 3;
                        this.danoMagico = 3;
                        break;
                    case 4:
                        this.nivel = 1;
                        this.vida = 60;
                        this.mp = 25;
                        this.dano = 10;
                        this.defesa = 4;
                        this.danoMagico = 15;
                        break;
                    case 5:
                        this.nivel = 1;
                        this.vida = 999;
                        this.mp = 999;
                        this.dano = 999;
                        this.defesa = 999;
                        this.danoMagico = 999; 
                        break;

                }
                return true;
            } else {
                System.out.println("Classe invalida!");
                return false;
            }
        } catch (Exception e) {
            // ME CONTRARA PFVR
            return false; // Retorna falso se a entrada não for um número válido
        }
    }

    public void AcontecimentoExplorar() {

        acontecimentos.add("Voce encontra um vilarejo, onde pode comprar itens e equipamentos.");
        acontecimentosIndex.add("1");
        acontecimentos.add("Enquanto voce explorava a floresta, voce encontra um simples e inofensivo slime.");
        acontecimentosIndex.add("2");
        acontecimentos.add("Voce encontra um baú, com uma corrente em sua carcaça, em formato de gancho");
        acontecimentosIndex.add("3");
        acontecimentos.add("Voce encontra um baú, com uma corrente em sua carcaça, em um formato estranho");
        acontecimentosIndex.add("4");
        acontecimentos.add("Você encontra um npc vendedor");
        acontecimentosIndex.add("5");
    }

    public void getAcontecimento() {
        for (int i = 0; i < acontecimentos.size(); i++) {
            acontecimentosIndexInt = i-1;
        }

    }

}
