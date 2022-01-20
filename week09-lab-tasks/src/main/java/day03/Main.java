package day03;

public class Main {
    public static void main(String[] args) {

        Encryption encryption=new Ceasar(13);

        String s=encryption.encrypts(encryption.encrypts("apple"));

        System.out.println(s);
    }
}
