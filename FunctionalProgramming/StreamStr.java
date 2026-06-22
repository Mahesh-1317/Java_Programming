package FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;

class StreamStr {
    public static void main(String[] args) {
        List<String> villains = List.of("Mogembo","Gabbar","Shakal", "Thanos");
        villains.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String villains) {
                System.out.println(villains);
            }
        });
    }
}
