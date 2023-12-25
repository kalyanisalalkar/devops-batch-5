/* Find Dublicate number from array using java8*/
class FindDublicateNumber{
	public static void main(String[] args){

	int arr[] = {2,3,5,6,4,3,5,2,1};
	Arrays.stream(arr).boxed().distinct().forEach(System.out::println);
}
}
