public class Main {
    public static void main(String[] args) {
        Gato meuGato = new Gato();
        meuGato.fazerSom();

        Cachorro meuCachorro = new Cachorro();
        meuCachorro.fazerSom();
    }
}

class Animal {
    public void fazerSom() {
        System.out.println("O animal faz um som");
    }
}

class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O gato mia: Miau!");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}
