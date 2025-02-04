//Take a list of integers and perform following
//Give me the distinct even integers list in sorted manner(descending) and store it in different list
public class OperationOnStream1{
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(20,15,10,11,23,47,32,63,23,21,30,40);

        List<Integer> filteredList = list.stream()
            .filter(x -> x%2 ==0)
            .map(x -> x/2)
            .distinct()
            .sorted((a,b) -> b-a) //This particular code takes comparator as an input
            .collect(Collectors.toList()); 

        System.out.println(filteredList);


        /*
         QUESTIONS:
         1. What are the other functions of Collectors class which we use it on the regular basis(like toList() function)?
         The Collectors class in Java provides various useful methods for collecting the results of a stream into different types of collections or aggregations. Here are some commonly used methods:

toList(): Collects elements into a List.


List<Integer> list = stream.collect(Collectors.toList());
toSet(): Collects elements into a Set. This automatically eliminates duplicates.


Set<Integer> set = stream.collect(Collectors.toSet());
joining(): Concatenates the elements of a stream into a single String. You can also add delimiters, prefixes, and suffixes.


String result = stream.collect(Collectors.joining(", ", "[", "]"));
// Output: [apple, banana, cherry]
groupingBy(): Groups elements based on a classifier function. This returns a Map where the key is the classifier, and the value is a list of elements for that key.


Map<Integer, List<String>> groupedByLength = stream.collect(Collectors.groupingBy(String::length));
partitioningBy(): Divides elements into two groups based on a predicate, returning a Map<Boolean, List<T>>.


Map<Boolean, List<Integer>> partitioned = stream.collect(Collectors.partitioningBy(x -> x % 2 == 0));
// Key: true for even numbers, false for odd numbers
counting(): Counts the number of elements in the stream.


long count = stream.collect(Collectors.counting());
summarizingInt() / summarizingDouble() / summarizingLong(): Collects statistics (such as count, sum, min, average, and max) for a stream of integers, doubles, or longs.


IntSummaryStatistics stats = stream.collect(Collectors.summarizingInt(Integer::intValue));
reducing(): Performs a reduction on the elements of the stream using an associative accumulation function, which can combine elements into a single result.


Optional<Integer> sum = stream.collect(Collectors.reducing(Integer::sum));
mapping(): Transforms the elements of the stream before collecting them. For example, you can use it with groupingBy to first map elements to a different type.


Map<Integer, List<String>> groupedByLength = stream.collect(Collectors.groupingBy(String::length, Collectors.mapping(String::toUpperCase, Collectors.toList())));
These Collectors methods are powerful tools for performing various aggregation tasks on streams in Java.
         */
    }
}