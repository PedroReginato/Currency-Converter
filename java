import java.util.Scanner; 
public class BrlEurUsd
{
    public static void main (String [] args){
        
        Scanner in = new Scanner (System.in);       
        System.out.println ("Bem-vindo ao Conversor de Moedas!");
        System.out.println("Por favor, insira o valor a ser convertido: ");
        double valor = in.nextDouble();
        in.nextLine();
        
        System.out.println("Por favor, insira a moeda de origem (BRL, USD, EUR):");
        String moedaOrigem = in.nextLine();
        
        System.out.println("Por favor, insira a moeda de destino (BRL, USD, EUR):");
        String moedaConverter = in.nextLine();
        
        double valorConvertido;
        
        switch (moedaConverter){
            case "BRL":
                if (moedaOrigem.equals("USD")){
                    valorConvertido = valor * 4.97;
                    System.out.println ("O valor em " + moedaOrigem + " convertido para " + moedaConverter + " é: " + Math.round (valorConvertido));
                
                }else{
                if (moedaOrigem.equals ("BRL")){
                    System.out.println ("O valor " + valor + "já está convertido");

                }else{
                    valorConvertido = valor * 5.43;
                    System.out.println ("O valor em " + moedaOrigem + " convertido para " + moedaConverter + " é: " + Math.round (valorConvertido));
                }
        }
                break;
                
            case "USD":
                if (moedaOrigem.equals("BRL")){
                    valorConvertido = valor * 0.20;
                    System.out.println ("O valor em " + moedaOrigem + " convertido para " + moedaConverter + " é: " + Math.round (valorConvertido));
                
                }else{ 
                    if (moedaOrigem.equals ("USD")){
                        System.out.println ("O valor " + valor + " já está convertido");
                    
                    }else{
                        valorConvertido = valor * 1.16;
                        System.out.println ("O valor em " + moedaOrigem + " convertido para " + moedaConverter + " é: " + Math.round (valorConvertido));
                    }
        }
                break;
                
            case "EUR":
                if (moedaOrigem.equals ("BRL")){
                    valorConvertido = valor * 0.15;
                    System.out.println ("O valor em " + moedaOrigem + " convertido para " + moedaConverter + " é: " + Math.round (valorConvertido));
                
                }else{
                    if (moedaOrigem.equals ("EUR")){
                        System.out.println ("O valor " + valor + " já está convertido");
                        
                    }else{
                        valorConvertido = valor * 0.84;
                        System.out.println ("O valor em " + moedaOrigem + " convertido para " + moedaConverter + " é: " + Math.round (valorConvertido));
                    }
                }
}
}
}
