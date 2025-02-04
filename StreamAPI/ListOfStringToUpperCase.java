public class ListOfStringToUpperCase{
    public static void main(String args[]){
        List<String> names = Arrays.asList("Ram","Shyam","Mohan","Rohan");
        List<String> filteredNameList = names.stream()
            .map(n -> n.toUpperCase())
            .collect(Collectors.toList());
    }
}