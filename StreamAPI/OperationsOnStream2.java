public class OperationOnStream2{
    public static void main(String args[]){
        List<Integer> collect = Stream.iterate(0, n->n+1)
            .limit(10)
            .skip(1)
            .filter(x -> x%2 == 0)
            .map(x -> x/2)
            .distinct()
            .sorted()
            .peek(x->System.out.println(x))
            .collect(Collectors.toList());

        System.out.println(collect);

    }
}