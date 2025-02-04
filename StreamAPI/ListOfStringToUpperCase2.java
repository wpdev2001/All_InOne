//Write a code to convert the first two elements to uppercase from the List of names using Stream API??

public class ListOfStringToUpperCase2{
    public static void main(String args[]){
        List<String> names = Arrays.asList("Ram","Shyam","Mohan","Rohan");

        List<String> modifiedNameList = IntStream.range(0, names.size())
            .mapToObj(i -> i<2 ? names.get(i).toUpperCase() : names.get(i))
            .collect(Collectors.toList());
        
        // Method 2 using if else
        // List<String> modifiedNameList = IntStream.range(0, names.size())  // Use IntStream to iterate by index
        //     .mapToObj(i -> {
        //         if (i < 2) {
        //             return names.get(i).toUpperCase();  // Uppercase first 2 elements
        //         } else {
        //             return names.get(i);  // Leave others as is
        //         }
        //     })
        //     .collect(Collectors.toList());

        System.out.println(modifiedNameList);
    }
}