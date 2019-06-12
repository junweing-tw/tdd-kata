import java.util.LinkedHashMap;
import java.util.Map;

public class NormalToRoman {
    private LinkedHashMap<Integer, String> normalToRomanMap = new LinkedHashMap<Integer, String>() {{
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    public String convert(int number) {
        String answer = "";

        do {
            for (Map.Entry<Integer, String> normalToRoman: this.normalToRomanMap.entrySet()) {
                final Integer normalNumber = normalToRoman.getKey();
                final String romanNumeral = normalToRoman.getValue();

                if (number >=  normalNumber) {
                    answer = answer.concat(romanNumeral);
                    number -=  normalNumber;
                    break;
                }
            }
        } while (number > 0);

        return answer;
    }
}
