
package testchallenge2024bis;

public class TestChallenge2024Bis {

    public static void main(String[] args) {

        String texto = "ht.gx qt wj wmnvnifkut xitxiz jvn wtut krnqtwbtyt je xs qnhbtgxh ftvt tzwtrtuk mjxx gbwxn ix onwjlhq mj Sh nxx.At lbytqIb ix unhxlf fgixxlk xrt xqh ix zstwn mffj fzg lnx,Fk wj hkniythbtgJg ef jg nqmthh nzrtjg xq xvzunkix zwtihet lAf wfs!tz tzwtrtihwuk jenvnmfvnhsxx,¡Y";

        System.out.println(texto);
        /*String palabra = "ramiro";
        String palabra2="";
        char primerLetra=palabra.charAt(palabra.length()-1);
        System.out.println(primerLetra);
        char segundaLetra=palabra.charAt(palabra.length()-2);
        System.out.println(segundaLetra);
        String ultimasLetras="";
        
        
        
        
        
       for (int i = 0; i < palabra.length()-2; i++) {
           ultimasLetras=ultimasLetras+palabra.charAt(i);           
        }
        
       
       palabra2=primerLetra+""+segundaLetra+ultimasLetras;
        System.out.println(palabra2);*/

        String[] partes = texto.split("[\\s,.;:?!¡()\\[\\]{}\"'\\\\/|@#$%&*+-]+");

        for (String parte : partes) {
            if (!parte.isEmpty()) {  // Ignorar cadenas vacías
                System.out.println(parte);
            }

            /*String palabra = "ramiro";*/
        }

        for (String parte : partes) {

            String palabra2 = "";
            char primerLetra = parte.charAt(parte.length() - 1);
            //System.out.println(primerLetra);
            char segundaLetra = parte.charAt(parte.length() - 2);
            //System.out.println(segundaLetra);
            String ultimasLetras = "";

            for (int i = 0; i < parte.length() - 2; i++) {
                ultimasLetras = ultimasLetras + parte.charAt(i);
            }

            palabra2 = primerLetra + "" + segundaLetra + ultimasLetras;
            System.out.println(palabra2);

        }

    }

}
