public class randomNumber {

    public static void main(String[] args) {
        int randomNumber = (int)(Math.random() * 100) + 1;
        System.out.println("Random number: " + randomNumber);

        if(randomNumber % 2 == 0){
            System.out.println("is even");}
        else{
            System.out.println(" is odd");}
    }

}
