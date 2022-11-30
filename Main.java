import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Main {
  
    public static void main(String[] args) throws FileNotFoundException, FullStackException {
      
        Scanner ler = new Scanner(new File("./nomes.txt"));

        Stack<String> pilha_nomes = new Stack();

        while (ler.hasNextLine()){
            pilha_nomes.push(ler.nextLine());
        }

        ArrayStack AS = new  ArrayStack();

        while(pilha_nomes.size() > 0){
            AS.push(pilha_nomes.pop());
        }

        System.out.println(AS);

    }
}