
package testchallenge2024bis;

public class TestChallenge2024Bis {

    public static void main(String[] args) {

        String texto = "ht.gx qt wj wmnvnifkut xitxiz jvn wtut krnqtwbtyt je xs qnhbtgxh ftvt tzwtrtuk mjxx gbwxn ix onwjlhq mj Sh nxx.At lbytqIb ix unhxlf fgixxlk xrt xqh ix zstwn mffj fzg lnx,Fk wj hkniythbtgJg ef jg nqmthh nzrtjg xq xvzunkix zwtihet lAf wfs!tz tzwtrtihwuk jenvnmfvnhsxx,¡Y";

        System.out.println(texto);

        String[] partes = texto.split("[\\s,.;:?!¡()\\[\\]{}\"'\\\\/|@#$%&*+-]+");

        for (String parte : partes) {
            if (!parte.isEmpty()) {  // Ignorar cadenas vacías
                System.out.println(parte);
            }

        }

        for (String parte : partes) {

            String palabra2 = "";
            char primerLetra = parte.charAt(parte.length() - 1);

            char segundaLetra = parte.charAt(parte.length() - 2);

            String ultimasLetras = "";

            for (int i = 0; i < parte.length() - 2; i++) {
                ultimasLetras = ultimasLetras + parte.charAt(i);
            }

            palabra2 = primerLetra + "" + segundaLetra + ultimasLetras;
            System.out.println(palabra2);

        }

    }

}
