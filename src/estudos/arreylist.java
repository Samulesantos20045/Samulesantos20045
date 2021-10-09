package estudos;
import java.util.ArrayList;
import java.util.Scanner;
public class arreylist {

	public static void main(String[] args) {
		String resposta= "";
		String resposta2= "";
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> numeros = new ArrayList<>();
		ArrayList<String> carros = new ArrayList<>(100);
		
		carros.trimToSize(); //serve para limitar o ArrayList apenas ao numero de elementos que existem na lista mesmo que o Arrey possua 100 posições
		
		numeros.add(10);
		numeros.add(22);
		numeros.add(30);
		carros.add("Tesla");
		carros.add("Fiat");
		carros.add("Ferrary");
		carros.add("Chevrolet");
		carros.add("Lanborgin");
		
		System.out.println("Digite o Carro que quer remover");
		resposta2 = sc.next();
		
		carros.remove(resposta2);
		
		System.out.println("Pesquise o Carro desejado");
		
		resposta =sc.next();
		
		System.out.println(carros.indexOf(resposta));
		
		//for(int i=0; i<carros.size(); i++) {
			
			//System.out.println(i + "- Marca " + carros.get(i));
			
		//}
		
		//System.out.println("O Carros Mais Rapido é o " + carros.get(0) + "O segundo Melhor Carro é:" + carros.get(1));
		
		
		
		//for(String m:carros) {
			
			//System.out.println(m);
			
		//}
		
		//for(int e:numeros) {
			
			//System.out.println(e);
			
		//}
		sc.close();
	}
	
}
