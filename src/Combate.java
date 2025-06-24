import java.util.Scanner;

public class Combate {
    public void startCombat(Character mainCharacter, Inimigos monstro) {
        System.out.printf("Voce entrou em combate com um %s%n", monstro.getNome());
        Scanner Entrada = new Scanner(System.in);
        System.out.println("seu turno: digite o comando desejado");
        System.out.println("ataque - Ataca o inimigo");
        System.out.println("defender - Defende o ataque do inimigo");
        System.out.println("statusM - Mostra os status do inimigo");
        System.out.println("statusP - Mostra os status do personagem");

        Entrada.close();
    }

    public boolean endCombat(Inimigos monstro, Character mainCharacter) {
        if (monstro.getVida() <= 0) {
            System.out.println("parabens voce derrotou o " + monstro.getNome() + "!");
            System.out.println("Você ganhou " + monstro.getXp() + " de XP.");
            mainCharacter.setXp(mainCharacter.getXp() + monstro.getXp());
            return true;
        } 
        return false;

    }

    public void atacar(Character mainCharacter, Inimigos monstros) {
        int dano = mainCharacter.getDano();
        int defesa = monstros.getDefesa();
        int danoFinal = 0;
        if (dano > defesa) {
            danoFinal = dano - defesa;
            monstros.setVida(monstros.getVida() - danoFinal);
            System.out.println("Você causou " + danoFinal + " de dano ao " + monstros.getNome() + ".");
            Func.Sair(new Scanner(System.in));
        } else {
            System.out.println("voce nao consiguiu atacar o seu dano é menor que a defesa do inimigo defesa inimiga: "
                    + defesa + " seu dano: " + dano);
        }
    }

    public void defender(Character mainCharacter, Inimigos monstros) {
        int defesa = mainCharacter.getDefesa();
        int danoInimigo = monstros.getDano();
        int danoFinal = ((defesa * 2) / 3);
        if (defesa >= danoFinal) {
            System.out.println("voce defendeu o ataque do " + monstros.getNome() + ".");
            if (danoFinal > danoInimigo) {
                System.out.println("Você consiguiu fazer um contra-ataque no " + monstros.getNome() + ".");
                monstros.setVida(monstros.getVida() - danoFinal);
                if (mainCharacter.getDefesa() - 1 > 0) {
                    mainCharacter.setDefesa(mainCharacter.getDefesa() - 1);
                    System.out
                            .println("voce contra-atacou o " + monstros.getNome() + " e sua defesa foi reduzida em 1.");
                } else {
                    System.out.println("Sua defesa chegou a zero, voce nao pode mais defender.");
                    System.out.println("Boa sorte no combate!");
                }

            } else {
                System.out.println("Você nao consiguiu fazer um contra-ataque no " + monstros.getNome() + ".");
            }
        } else {
            System.out.println("voce nao consiguiu se defender do ataque do " + monstros.getNome() + ".");
            mainCharacter.setVida(mainCharacter.getVida() - danoInimigo);
        }
    }

    public void statusMonstro(Inimigos monstro) {
        System.out.println("Status do monstro:");
        System.out.println("Nome: " + monstro.getNome());
        System.out.println("Vida: " + monstro.getVida());
        System.out.println("Dano: " + monstro.getDano());
        System.out.println("Defesa: " + monstro.getDefesa());
        System.out.println("MP: " + monstro.getMP());
        System.out.println("XP: " + monstro.getXp());
    }

    public void statusPersonagem(Character mainCharacter) {
        System.out.println("Status do personagem:");
        System.out.println("Nome: " + mainCharacter.getNome());
        System.out.println("Vida: " + mainCharacter.getVida());
        System.out.println("Dano: " + mainCharacter.getDano());
        System.out.println("Defesa: " + mainCharacter.getDefesa());
        System.out.println("MP: " + mainCharacter.getMP());
        System.out.println("XP: " + mainCharacter.getXp());
    }




}
