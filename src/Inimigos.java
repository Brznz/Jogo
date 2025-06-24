public class Inimigos {

    int vida= 0;
    int dano = 0;
    int mp = 0;
    int defesa = 0;
    int level = 0;
    double xp = 0;
    int danoMagico = 0;
    String nome = "";
    
    public void setinfoInimigoBauArmadilha() {
        String nome = "mimico";
        System.out.println("Um monstro que imita um bau, me lembra um jogo.");
        int vida = 75;
        int dano = 10;
        int mp = 5;
        int defesa = 2;
        int level = 1;
        double xp = 50;
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
        return this.level;
    }

    public void setNivel(int nivel) {
        this.level = nivel;
    }

    public void getStatusInimigo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Vida: " + this.vida);
        System.out.println("Dano: " + this.dano);
        System.out.println("MP: " + this.mp);
        System.out.println("Defesa: " + this.defesa);
        System.out.println("Level: " + this.level);
        System.out.println("XP: " + this.xp);
    }



    public void getinfoInimigoSlime() {
        String nome = "Slime";
        String descricao = "Um slime verde, parece inofensivo.";
        int vida = 50;
        int dano = 5;
        int mp = 0;
        int defesa = 1;
        int level = 1;
        double xp = 30;

    }

}
