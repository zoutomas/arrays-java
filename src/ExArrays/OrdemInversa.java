package ExArrays;

public class OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = { 5, 9, 1, 3, 7, 18};

        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }


        System.out.println("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --){
            System.out.print(vetor[i] + " ");
        }
    }
}
