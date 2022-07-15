package dio.com.br.Collections;

import java.util.*;

//Estudo e compreensão dos principais métodos da Interface List:

// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:


public class ExemploList {
    public static void main(String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));


        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);


        System.out.println("Subtitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);


        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));


        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
        for (Double nota: notas) System.out.println(nota);


        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());



        System.out.println("Exiba a menor nota: " + Collections.min(notas));



        System.out.println("Exiba a maior nota: " + Collections.max(notas));

//soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){ //puxa sempre o p´roximo número enquanto houver;
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma);


        System.out.println("Exiba a média dos valores: " + (soma / notas.size()));


        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);


        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas);


        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);



       /* System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas); */


        System.out.println("Confira se a lista está vázia: " + notas.isEmpty()) ;


        /*Exercicio

Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

 */

        System.out.println("Crie uma lista chamada notas2 " + "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        LinkedList<Double> notas2 = new LinkedList<Double>();
        notas2.addAll(notas);
        System.out.println(notas2.toString());


        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.getFirst());



        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas2.getFirst());
        notas2.remove(0);
        System.out.println(notas2);

        /* Neste exercicio usei os conceitos da linkedList:
        [x]addAll para pegar todos os últimos elemenos da lista anterior;
        [x]getFirst para pegar o primeiro elemento da lista;
        [x]remove usando o número do indice para remover o primeiro elemento da lista;
        */

    }
}

/* Conceitos estudos da Arraylist:
[x] Iniciar
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html
[x] Generics
[x] Diamond Operator
https://www.baeldung.com/java-diamond-operator
[x] toString()
[x] indexOf()
[x] add()
[x] set()
[x] contains()
[x] toString()
[x] get()
[x] Collections.min()
[x] Collections.max()
[x] iterator()
[x] iterator().hasNext()
[x] iterator().next()
[x] size()
[x] remove()
[x] iterator().remove()
[x] clear()
[x] isEmpty()
 */


