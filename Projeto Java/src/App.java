public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = { 8, 5, 33, 12, 11, 24 };
        int[] pares = new int[numeros.length];
        int[] impares = new int[numeros.length];
        int somaPar = 0;
        int somaImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            var diferenca = 0;
            diferenca = numeros[i] % 2;

            if (diferenca > 0)
                impares[i] += numeros[i];
            else
                pares[i] += numeros[i];
        }

        for (int i = 0; i < pares.length; i++) {
            somaPar += pares[i];
        }
        for (int i = 0; i < impares.length; i++) {
            somaImpar += impares[i];
        }

        if (somaPar >= somaImpar) {
            var soma = somaPar - somaImpar;
            System.out.printf("O resultado da diferença é:%d", soma);
        } else {
            var soma = somaImpar - somaPar;
            System.out.printf("O resultado da diferença é:%d", soma);
        }
    }
}
