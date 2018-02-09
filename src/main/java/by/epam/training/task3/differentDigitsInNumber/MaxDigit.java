package by.epam.training.task3.differentDigitsInNumber;

public class MaxDigit {
    public static int findMaxDigit(long number){
        int digit;
        int maxDigit=0;
        while(number>0){
            digit=(int)number%10;
            if(digit>maxDigit){
                maxDigit=digit;
            }
            number/=10;
            System.out.println(number);
        }
        return maxDigit;
    }
}
