package teoricas3;

public class TestarData {
	 public static void main(String[] args) {
	        Data data1 = new Data(10, 5, 2023);
	        Data data2 = new Data(15, 5, 2023);

	        System.out.println("Data 1: " + data1.getDia() + "/" + data1.getMes() + "/" + data1.getAno());
	        System.out.println("Data 2: " + data2.getDia() + "/" + data2.getMes() + "/" + data2.getAno());

	        System.out.println("Comparação: " + data1.compara(data2));

	        System.out.println("Dia: " + data1.getDia());
	        System.out.println("Mês: " + data1.getMes());
	        System.out.println("Mês por extenso: " + data1.getMesExtenso());
	        System.out.println("Ano: " + data1.getAno());
	        System.out.println("É bissexto: " + data1.isBissexto(data1.getAno()));

	        Data data3 = data1.clone();
	        System.out.println("Clone: " + data3.getDia() + "/" + data3.getMes() + "/" + data3.getAno());
	    }
	}

