import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {


        //criar conta
        ContaBancaria Conta_1 = new ContaBancaria(1001, "Jaderson", 100, 0000);
        ContaBancaria Conta_2 = new ContaBancaria(1002, "Cledison", 100, 0000);

        //deposita em uma das contas
        Conta_1.depositar(100);

        //sacar de ambas as contas
        Conta_1.sacar(300,0000);
        Conta_2.sacar(301,0000);

        Conta_1.transferir(100,Conta_2,0000);

        while(true){
            Scanner valor = new Scanner("digite valor");
            Scanner senha = new Scanner("digite senha");

            Conta_1.sacar(valor,senha);
        }

    }
}
