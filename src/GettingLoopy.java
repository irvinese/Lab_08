public class GettingLoopy {
    public static void main(String [] args){

        //a loop that counts up by 1 from 0 to 30
        for(int counter = 0; counter <= 30; counter++) {
            System.out.println(counter + " ");

        }
        System.out.println(" ");

        //a loop that counts down by 1 from 30 to zero
        for(int counter = 30; counter >= 0; counter--){
            System.out.println(counter + " ");

        }
        System.out.println(" ");

        //a loop that counts up by 3 from zero to 8
        for(int counter = 0; counter <= 18; counter+=3){
            System.out.println(counter + " ");
        }
        System.out.println(" ");

        //a loop that counts down by 2 from 10 to 0
        for (int counter = 10; counter >= 0; counter-=2){
            System.out.println(counter + " ");
        }


                //question 5
                int i, j;

                for (j = 1; j <= 5; j++) {
                    for (i = 1; i <= j; i++) {
                        System.out.printf("* ");

                    }
                    System.out.printf("\n");
                }
                System.out.println(" ");
                //question 6
                int row, col;

                for (row = 1; row <= 5; row++) {
                    for (col = 5; col >= row; col--) {
                        System.out.printf("* ");

                    }
                    System.out.printf("\n");
                }
                System.out.println(" ");

                //question 7
                int o, a;

                for (o = 1; o <= 5; o++) {
                    for (a = 1; a <= 5; a++) {
                        System.out.printf("* ");

                    }
                    System.out.printf("\n");
                }

            }
        }

