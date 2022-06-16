package faturamentoPorDia;

public class FaturamentoPorDia {
	static double media(double[] entrada) {
       
        int qtdValidos = 0;

        double faturamentoTotal = 0;

        for (double item : entrada) {
            if (item != 0) {
                qtdValidos += 1;
            }
        }

        for (double item : entrada) {
            faturamentoTotal += item;
        }

        return faturamentoTotal / qtdValidos;
    }

    static void diasAcimaDaMedia(double[] faturamento) {
        int qtd = 0;

        double media = media(faturamento);

        for (double i : faturamento) {
            if (i > media) {
                qtd++;
            }
        }

        System.out.println("Número de dias no mês em que o valor de faturamento diário " +
                "foi superior à média mensal é: " + qtd);

    }

    static void maiorFaturamentoDia(double[] entrada) {
        double maior = 0;

        for (double item : entrada) {
            if (item > maior) {
                maior = item;
            }
        }

        System.out.println("O maior valor de faturamento ocorrido em um dia do mês foi: R$" + maior);
    }

    static void menorFaturamentoDia(double[] entrada) {
        double menor = 0;

        for (double item : entrada) {
            if (item != 0) {
                if (menor == 0) {
                    menor = item;
                }
                if (item < menor) {
                    menor = item;
                }
            }
        }

        System.out.println("O menor valor de faturamento ocorrido em um dia do mês diferente de zero (0) foi: R$" + menor);
    }

    public static void main(String[] args) {

        System.out.println("*----- Questão 03 -------------------------*\n");

        double[] faturamento = {
                /* dia": 1 */ 22174.1664,
                /* dia": 2 */ 24537.6698,
                /* dia": 3 */ 26139.6134,
                /* dia": 4 */ 0.0,
                /* dia": 5 */ 0.0,
                /* dia": 6 */ 26742.6612,
                /* dia": 7 */ 0.0,
                /* dia": 8 */ 42889.2258,
                /* dia": 9 */ 46251.174,
                /* dia": 10 */ 11191.4722,
                /* dia": 11 */ 0.0,
                /* dia": 12 */ 0.0,
                /* dia": 13 */ 3847.4823,
                /* dia": 14 */ 373.7838,
                /* dia": 15 */ 2659.7563,
                /* dia": 16 */ 48924.2448,
                /* dia": 17 */ 18419.2614,
                /* dia": 18 */ 0.0,
                /* dia": 19 */ 0.0,
                /* dia": 20 */ 35240.1826,
                /* dia": 21 */ 43829.1667,
                /* dia": 22 */ 18235.6852,
                /* dia": 23 */ 4355.0662,
                /* dia": 24 */ 13327.1025,
                /* dia": 25 */ 0.0,
                /* dia": 26 */ 0.0,
                /* dia": 27 */ 25681.8318,
                /* dia": 28 */ 1718.1221,
                /* dia": 29 */ 13220.495,
                /* dia": 30 */ 8414.61
        };


        menorFaturamentoDia(faturamento);

        maiorFaturamentoDia(faturamento);

        diasAcimaDaMedia(faturamento);


    }
}
