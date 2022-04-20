package atividadep2.lista01;
/**
 *
 * @author Renato Nunes
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;
    private String mesVerif = "";

    public Data(int d, int m, int a) {
        if (a < 1) {
            this.ano = 1;
        } else {
            this.ano = a;
        }
        if (m > 0 && m <= 12) {
            this.mes = m;
            if (m == 4 || m == 6 || m == 9 || m == 11) {
                if (d > 0 && d < 31) {
                    this.dia = d;
                } else {
                    this.dia = 1;
                }
            } else if (m == 2) {
                if (anoBissexto(a)) {
                    if (d > 0 && d <= 29) {
                        this.dia = d;
                    }
                } else if (d > 0 && d < 29) {
                    this.dia = d;
                } else {
                    this.dia = 1;
                }
            } else {
                if (d > 0 && d <= 31) {
                    this.dia = d;
                } else {
                    this.dia = 1;
                }
            }
        } else {
            this.mes = 1;
        }
    }

    private int getDia() {
        return dia;
    }

    private void setDia(int dia) {
        this.dia = dia;
    }

    private int getMes() {
        return mes;
    }

    private void setMes(int mes) {
        this.mes = mes;
    }

    private int getAno() {
        return ano;
    }

    private void setAno(int ano) {
        this.ano = ano;
    }

    public static boolean anoBissexto(int a) {
        if (a % 4 != 0) {
            return false;
        }
        return true;
    }

    public void imprimirData() {
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    }

    public void imprimirDataExtenso() {
        System.out.println("Data por extenso: " + dia + " de " + verifMes(mes) + " de " + ano);
    }

    public void imprimirNovaData(int d) {
        int i;
        for (i = 1; i <= d; i = i + 1) {
            dia = dia + 1;
            if (dia >= 30) {
                if (mes == 2) {
                    if (anoBissexto(ano)) {
                        dia = dia - 29;
                        mes = mes + 1;
                    } else {
                        dia = 1;
                        mes = mes + 1;
                    }
                } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    dia = 1;
                    mes = mes + 1;
                } else {
                    dia = 1;
                    mes = mes + 1;
                }
            }
            if (mes > 12) {
                mes = mes - 12;
                ano = ano + 1;
            }
        }
        System.out.println("Data: " + dia + " de " + verifMes(mes) + " de " + ano);
    }

    public void imprimirDiferencaData(Data dt) {
        int result, anoDif, diaDif, mesDif;
        diaDif = dt.dia - dia;
        mesDif = dt.mes - mes;
        anoDif = dt.ano - ano;
        mesDif = mesDif * 30;
        anoDif = (anoDif * 365) - mesDif;
        result = diaDif + anoDif;
        System.out.println("A diferença é"+result);
    }

    public String verifMes(int m) {
        switch (m) {
            case 1:
                mesVerif = "Janeiro";
                break;
            case 2:
                mesVerif = "Fevereiro";
                break;
            case 3:
                mesVerif = "Março";
                break;
            case 4:
                mesVerif = "Abril";
                break;
            case 5:
                mesVerif = "Maio";
                break;
            case 6:
                mesVerif = "Junho";
                break;
            case 7:
                mesVerif = "Julho";
                break;
            case 8:
                mesVerif = "Agosto";
                break;
            case 9:
                mesVerif = "Setembro";
                break;
            case 10:
                mesVerif = "Outubro";
                break;
            case 11:
                mesVerif = "Novembro";
                break;
            case 12:
                mesVerif = "Dezembro";
                break;
        }
        return mesVerif;
    }
}
