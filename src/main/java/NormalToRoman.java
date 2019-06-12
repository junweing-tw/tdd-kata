import java.util.LinkedHashMap;
import java.util.Map;

public class NormalToRoman {
    private LinkedHashMap<Integer, String> normalToRomanMap = new LinkedHashMap<Integer, String>() {{
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
            for (Map.Entry<Integer, String> entry : this.normalToRomanMap.entrySet()) {
                if (number >= entry.getKey()) {
                    answer = answer.concat(entry.getValue());
                    number -= entry.getKey();
                    break;
                }
            }
        } while (number > 0);

        return answer;
    }
}
