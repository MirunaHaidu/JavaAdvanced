package streamingAPI;

import java.util.List;

public class Calculate {
    private EvenNumbers evenNumbers;

    public Calculate(EvenNumbers evenNumbers) {
        this.evenNumbers = evenNumbers;
    }

    public List<Integer> getMyEvenNumbers(List<Integer> numbers){
        return evenNumbers.filterNumbers(numbers);
    }
}
