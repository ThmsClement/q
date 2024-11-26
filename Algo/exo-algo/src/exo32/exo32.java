package exo32;

public class exo32 {
    public static void main(String[] args) {
        int[] tableauA = {12, 5, 22, 8, 53};
        int[] tableauB = {60, 15, 18, 47, 1};
        int[] tableauC = new int [tableauA.length + tableauB.length];
        int i = 0;



                for (int y = 0; y < tableauA.length; y++) {
                    int z = y +1;
                    for (z = y + 1; z < tableauA.length ; z++) {
                        if (tableauA[y] > tableauA[z]) {
                            int temp = tableauA[y];
                            tableauA[y] = tableauA[z];
                            tableauA[z] = temp;
                        }
                    }
                    for ( z = y+ 1 ; z< tableauB.length ; z++) {
                        if (tableauB[y] > tableauB[z]) {
                            int temp = tableauB[y];
                            tableauB[y] = tableauB[z];
                            tableauB[z] = temp;
                        }

                    }


                }

            for (int y = 0 ; y < tableauA.length ; y++){
                if (tableauA[y] > tableauB[y]){
                    tableauC[i] = tableauB[y];
                    tableauC[i+1] = tableauA[y];

                } else {
                    tableauC[i] = tableauA[y];
                    tableauC[i+1] = tableauB[y];
                }
                i +=2;
            }

            i =0;





        for (i = 0; i < tableauC.length; i++) {
            System.out.print(tableauC[i] + " , ");
        }

    }
}
