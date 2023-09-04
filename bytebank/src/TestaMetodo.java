
public class TestaMetodo {
     public static void main(String[] args) {
		
    	 Conta contaDoPaulo = new Conta();
    	 contaDoPaulo.saldo = 100;
         contaDoPaulo.deposita(50);
         
         System.out.println(contaDoPaulo.saldo);
         boolean conseguiuretirar = contaDoPaulo.saca(20);
         System.out.println(contaDoPaulo.saldo);
         System.out.println(conseguiuretirar);
         
         Conta contaDoJúnior = new Conta();
         contaDoJúnior.deposita(1000);
         
         boolean sucessoTransferencia = contaDoJúnior.transfere(300, contaDoPaulo);
         
         if(sucessoTransferencia) {
        	 System.out.println("Transferência com sucesso");
         } else {
        	 System.out.println("Faltou dinheiro");
         }
       
         System.out.println(contaDoJúnior.saldo);
         System.out.println(contaDoPaulo.saldo);
         
         
         contaDoPaulo.titular = "Júnior Costa";
         System.out.println(contaDoPaulo.titular);
	}
}
