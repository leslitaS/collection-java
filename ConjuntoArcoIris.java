import java.util.*;

public class ConjuntoArcoIris {

    public static void main(String[] args) {

        //Crie um conjunto exibiendo as cores do arcoIris

        Set<String> meuArcoIris = new HashSet<>();
        meuArcoIris.add("vermelho");
        meuArcoIris.add("laranja");
        meuArcoIris.add("amarelo");
        meuArcoIris.add("verde");
        meuArcoIris.add("azul");
        meuArcoIris.add("anil");
        meuArcoIris.add("violeta");

       System.out.println("=== Exiba as cores do ArcoIris Uma abaixo da Outra: ===");
       for (String corName: meuArcoIris){
           System.out.println(corName);
       }

       System.out.println("Exiba a quantidade das cores que o ArcoIris tem: ");
       System.out.println("Quantidade de cores que o ArcoIris tem:" + meuArcoIris.size());

       System.out.println("Imprima as cores do ArcoIris em Ordem Alfabetica: ");
       Set<String> meuArcoIris2 = new TreeSet<>(meuArcoIris);
       for (String corName: meuArcoIris){
            System.out.println(corName);
       }

       System.out.println("=== Imprima as cores na ordem Inversa === ");
       Set<String> arcoIris2 = new LinkedHashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
       List<String> arcoIrisInverso = new ArrayList<>(arcoIris2);
       Collections.reverse(arcoIrisInverso);
       System.out.println("Inverso: " + arcoIrisInverso);

       System.out.println("Remova toas as cores que começam com a letra v: ");

        Iterator<String> iterator = meuArcoIris.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.startsWith("v")){
                iterator.remove();
            }
        }
        System.out.println("Cores arcoIris:" +  meuArcoIris);

        System.out.println("Remova o limpe o Conjunto: " );
        meuArcoIris.clear();


    }



}
