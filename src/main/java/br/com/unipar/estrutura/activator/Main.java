
package br.com.unipar.estrutura.activator;

import br.com.unipar.estrutura.calculation.Tax;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Tax tax = new Tax();
        tax.getAliquot(sc.nextDouble());
        
        sc.close();
    }
    
}
