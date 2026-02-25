package teoricas3;
/*2 - Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe deverá dispor
dos seguintes métodos:
 Construtor - define a data que determinado objeto (através de parâmetro), este método
verifica se a data está correta, caso não esteja a data é configurada como 01/01/0001
 Compara - recebe como parâmetro um outro objeto da Classe data, compare com a data
corrente e retorne:
 0 se as datas forem iguais;
 1 se a data corrente for maior que a do parâmetro;
 -1 se a data do parâmetro for maior que a corrente.
 getDia - retorna o dia da data
 getMes - retorna o mês da data
 getMesExtenso - retorna o mês da data corrente por extenso
 getAno - retorna o ano da data
 isBissexto - retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
 clone - o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os
mesmos valores de atributos e retorna sua referência pelo método
Escreva um programa para testar a classe Data*/

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // construtor
    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }
    //metodos
    private boolean dataValida(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && isBissexto(ano)) {
            return dia <= 29;
        }
        return dia <= diasPorMes[mes];
    }

    public int compara(Data outraData) {
        if (this.ano > outraData.ano) {
            return 1;
        } else if (this.ano < outraData.ano) {
            return -1;
        } else {
            if (this.mes > outraData.mes) {
                return 1;
            } else if (this.mes < outraData.mes) {
                return -1;
            } else {
                if (this.dia > outraData.dia) {
                    return 1;
                } else if (this.dia < outraData.dia) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String getMesExtenso() {
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril",
            "Maio", "Junho", "Julho", "Agosto",
            "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return meses[mes - 1];
    }

    public int getAno() {
        return ano;
    }

    public boolean isBissexto(int ano) {
        return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
    }

    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }
}
