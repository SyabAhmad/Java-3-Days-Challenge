class animals {
    public void animalSound(){
        System.out.println("mew mew mew mew");
    }
}
class dog extends animals {
    public void animalSound(){
        System.out.println("ghwab ghwab ghwab");
    }
}
class monkey extends animals {
    public void animalSound(){
        System.out.println("peek peek peek peek");
    }
}
class human extends animals {
    public void animalSound(){
        System.out.println("hello hello hello hello");
    }
}
class Polymophism {
    public static void main(String []args){
        animals anime=new animals();
        dog anime1=new dog();
        monkey anime2 = new monkey();
        human anime3 = new human();
        anime.animalSound();
        anime1.animalSound();
        anime2.animalSound();
        anime3.animalSound();
    }
}