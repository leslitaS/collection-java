import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println(notas.toString());
        System.out.println("Exiba a posicao da nota 5.0: " + notas.indexOf(5d));
        System.out.println("Adicione na lista a nota 8.0 na posicao 4: ");
        notas.add(4,8.0);
        System.out.println("Substituia a nota 5.0 pela nota 6.0");
        notas.set((notas.indexOf(5d)),6d);
        System.out.println("notas: " + notas);
        System.out.println("Confira se a nota 5.0 esta na lista: " + notas.contains(5d));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");

        for (Double nota: notas ) {
            System.out.println(nota);
        }
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));



        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a media das notas: "+ (soma/notas.size()));

        System.out.println("Remova a nota da posicao 0: ");
        notas.remove(0d);
        System.out.println("notas: " + notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista ....");

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println("notas maiores a 7: " + notas);


        System.out.println("=====================================LinkedList=====================================");
        System.out.println("Criar uma lista chamada notas2, e coloque todos os elementos da List ArrayList nessa nova lista");

        LinkedList notas2 = new LinkedList();

        Iterator<Double> iterator2 = notas.iterator();
        while (iterator2.hasNext()){
            Double next = iterator2.next();
            notas2.add(next);
        }
        System.out.println("LinkedList notas2: " + notas2);
        System.out.println("mostre a primeira nota da lista sem remove-lo: " +  notas2.getFirst() );
        System.out.println("mostre a primeira nota da lista removendo-o: " +  notas2.remove( notas2.getFirst()) );

        System.out.println("A nova LinkedList e:" + notas2);

    }
}
