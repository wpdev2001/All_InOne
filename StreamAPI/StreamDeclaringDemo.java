public class StreamDeclaringDemo{
    public static void main(Str){
        //Through list
        List<String> list = Arrays.asList("apple","mango","banana","orange");
        Stream<String> myStream = list.stream();

        //Through Array
        String[] array = {"apple","mango","banana","orange"};
        Stream<String> stream1 = Arrays.stream(array);

        //From Values (Stream.of())
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7);

        //From a Function (Stream.iterate())
        Stream<Integer> integerStream1 = Stream.iterate(0, n -> n+1).limit(10);

        //From a Supplier (Stream.generate())
        Stream<Integer> limit1 = Stream.generate(() -> Math.random()*100).limit(10);

        //From a Stream Builder (Stream.Builder)
        Stream<String> stream2 = Stream.<String>builder()
            .add("apple")
            .add("banana")
            .add("mango")
            .add("orange")
            .build();
        
        //From Optional (Optional.stream())
        Optional<String> optional = Optional.of("apple");
        Stream<String> streamFromOptional = optional.stream();

        //From a Range
        IntStream intStream = IntStream.range(1,10); // 1 to 9

        IntStream intStream2 = IntStream.rangeClosed(1,10); // 1 to 10


    }
}