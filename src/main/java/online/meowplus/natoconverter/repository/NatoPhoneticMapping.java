package online.meowplus.natoconverter.repository;

import java.util.HashMap;
import java.util.Map;

public class NatoPhoneticMapping implements AlphabetMapping{

    private static final Map<Character, String> NATO_PHONETIC_MAP = new HashMap<>();

    static {
        NATO_PHONETIC_MAP.put('A', "Alpha");
        NATO_PHONETIC_MAP.put('B', "Bravo");
        NATO_PHONETIC_MAP.put('C', "Charlie");
        NATO_PHONETIC_MAP.put('D', "Delta");
        NATO_PHONETIC_MAP.put('E', "Echo");
        NATO_PHONETIC_MAP.put('F', "Foxtrot");
        NATO_PHONETIC_MAP.put('G', "Golf");
        NATO_PHONETIC_MAP.put('H', "Hotel");
        NATO_PHONETIC_MAP.put('I', "India");
        NATO_PHONETIC_MAP.put('J', "Juliett");
        NATO_PHONETIC_MAP.put('K', "Kilo");
        NATO_PHONETIC_MAP.put('L', "Lima");
        NATO_PHONETIC_MAP.put('M', "Mike");
        NATO_PHONETIC_MAP.put('N', "November");
        NATO_PHONETIC_MAP.put('O', "Oscar");
        NATO_PHONETIC_MAP.put('P', "Papa");
        NATO_PHONETIC_MAP.put('Q', "Quebec");
        NATO_PHONETIC_MAP.put('R', "Romeo");
        NATO_PHONETIC_MAP.put('S', "Sierra");
        NATO_PHONETIC_MAP.put('T', "Tango");
        NATO_PHONETIC_MAP.put('U', "Uniform");
        NATO_PHONETIC_MAP.put('V', "Victor");
        NATO_PHONETIC_MAP.put('W', "Whiskey");
        NATO_PHONETIC_MAP.put('X', "X-ray");
        NATO_PHONETIC_MAP.put('Y', "Yankee");
        NATO_PHONETIC_MAP.put('Z', "Zulu");
    }

    @Override
    public String getMapping(char letter) {
        return null;
    }
}
