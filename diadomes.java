import java.util.Scanner;

public class diadomes {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int numeroMes = 0;
        int ano = 0;
        int dias = 0;
        String nomeMes;

        System.out.print("Digite o nome do mês ou o número do mês (ex: Janeiro ou 1): ");
        String Mes = leia.nextLine().toLowerCase();

        try {
            numeroMes = Integer.parseInt(Mes);
        } catch (NumberFormatException e) {
            switch (Mes) {
                case "janeiro": numeroMes = 1; break;
                case "fevereiro": numeroMes = 2; break;
                case "março": numeroMes = 3; break;
                case "abril": numeroMes = 4; break;
                case "maio": numeroMes = 5; break;
                case "junho": numeroMes = 6; break;
                case "julho": numeroMes = 7; break;
                case "agosto": numeroMes = 8; break;
                case "setembro": numeroMes = 9; break;
                case "outubro": numeroMes = 10; break;
                case "novembro": numeroMes = 11; break;
                case "dezembro": numeroMes = 12; break;
                default:
                    System.out.println("Mês inválido!");
                    leia.close();
                    return;
            }
        }

        switch (numeroMes) {
            case 1: nomeMes = "janeiro"; dias = 31; break;
            case 2: 
                nomeMes = "fevereiro";
                System.out.print("Digite o ano para verificar se é bissexto: ");
                ano = leia.nextInt();

                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            case 3: nomeMes = "março"; dias = 31; break;
            case 4: nomeMes = "abril"; dias = 30; break;
            case 5: nomeMes = "maio"; dias = 31; break;
            case 6: nomeMes = "junho"; dias = 30; break;
            case 7: nomeMes = "julho"; dias = 31; break;
            case 8: nomeMes = "agosto"; dias = 31; break;
            case 9: nomeMes = "setembro"; dias = 30; break;
            case 10: nomeMes = "outubro"; dias = 31; break;
            case 11: nomeMes = "novembro"; dias = 30; break;
            case 12: nomeMes = "dezembro"; dias = 31; break;
            default:
                System.out.println("Número de mês inválido!");
                leia.close();
                return;
        }

        System.out.println("\nO mês de " + nomeMes + " tem " + dias + " dias.");

        leia.close();
    }
}
