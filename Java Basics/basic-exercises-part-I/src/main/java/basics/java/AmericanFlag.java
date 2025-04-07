package basics.java;

public class AmericanFlag {


    public void imprimirBandeira(){

        String[] contemCaracteres = {
                "*",
                "="
        };

        for (int i = 1; i <= 15; i++) {

            if(i <= 9 ){
                if(i % 2 == 0){
                    System.out.println((" " + contemCaracteres[0]).repeat(5) + " ".repeat(2) + (contemCaracteres[1]).repeat(20));
                }else{
                    System.out.println((contemCaracteres[0] + " ").repeat(6) + (contemCaracteres[1]).repeat(20));
                }
            }else{
                System.out.println(contemCaracteres[1].repeat(32));
            }

        }

    }

}
