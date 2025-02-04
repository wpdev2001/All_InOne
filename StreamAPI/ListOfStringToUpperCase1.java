public class ListOfStringToUpperCase1{
    public static void main(String args[]){
        List<String> names = Arrays.asList("Ram","Shyam","Mohan","rohan");
        
        List<String> filteredNames = Stream.concat(
            names.stream().limit(2).map(String::toUpperCase),
            names.stream().skip(2)
        ).collect(Collectors.toList());
        
        System.out.println(filteredNames);
    }
}