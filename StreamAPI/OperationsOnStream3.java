public class OperationOnStream3{
    public static void main(String args[]){
        List<Integers> integerList = Stream.iterate(0, n -> n+1)
            .limit(10)
            .filter(n -> n%2==0)
            .map(x -> x/2)
            .distinct()
            .sorted()
            .peek(System.out :: println)
            .collect(Collectors.toList());

            System.out.println(integerList);
    }

    /*

    Q1. What are the scenarios for Method Referencing??
     SCENARIOS FOR USING METHOD REFERENCING:
     Common Scenarios for Method References:
     Stream Operations: Method references are commonly used in stream operations like map(), filter(), forEach(), etc.

     For example, using a static method for transformations, an instance method for applying operations on each object in a stream, or a constructor reference to create new objects.
    
     Simplifying Lambda Expressions: Whenever your lambda expression simply calls a method, method references are a more concise and readable way to express the same operation. They improve readability by removing boilerplate code.

     Functional Interfaces: Java’s Function, Consumer, Predicate, and other functional interfaces often work well with method references, as they allow you to directly pass method references instead of writing verbose lambda expressions.

     Q2. What is the difference between Stream and ParallelStream, when to use what?
     Use Stream when:

        You are processing small datasets.
        The operations are lightweight or fast.
        You want to maintain the order of elements.

    Use ParallelStream when:

        You are processing large datasets or computationally expensive operations.
        You want to leverage multiple CPU cores to improve performance.
        The operation on each element is independent and can safely be performed concurrently.


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,  ... large data set );

        long sum = numbers.parallelStream() 
            .map(x -> x * x) 
            .reduce(0, Integer::sum);
        System.out.println(sum);

     */

}