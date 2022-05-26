package stream;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainStream {

    public static void main(String[] args) {
        List<Bloqueo> bloqueos = new ArrayList<>();
        bloqueos.add(new Bloqueo("111", "222"));
        bloqueos.add(new Bloqueo("222", "333"));
        bloqueos.add(new Bloqueo("444", "555"));
        bloqueos.add(new Bloqueo("555", "666"));
        bloqueos.add(new Bloqueo("666", "666"));
        bloqueos.add(new Bloqueo("777", "888"));
        bloqueos.add(new Bloqueo("999", "111"));

        List<String> collect = bloqueos.stream().map(bloqueo -> bloqueo.getHotCodigo()+"#"+bloqueo.getCodigoBloqueo()).collect(Collectors.toList());
        List<String> distinct = collect.stream().distinct().collect(Collectors.toList());
        System.out.println("lista = " + collect);
        System.out.println("distinct = " + distinct);


        Set<String> items = new HashSet<>();
        List<String> duplicados = collect.stream().filter(n -> !items.add(n)).collect(Collectors.toList());
        System.out.println("duplicados = " + duplicados);


    }
}
