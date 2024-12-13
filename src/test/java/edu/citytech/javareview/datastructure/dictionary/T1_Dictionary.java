package edu.citytech.javareview.datastructure.dictionary;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.citytech.javareview.dto.ABC;

// Developer: Boulet, Jean
public class T1_Dictionary {

    Dictionary<String, ABC> dictionary = new Dictionary<>();

    @BeforeEach
    public void before() {

        dictionary.collisionEvent((k,v) -> {
           // System.out.println("key: " + k + ", value: " + v);
        });

        // 11 Items
        dictionary.put(new ABC("A", "Aardwolf"));
        dictionary.put(new ABC("B", "Babirusa"));
        dictionary.put(new ABC("C", "Caecilian"));
        dictionary.put(new ABC("D", "Dartfish"));
        dictionary.put(new ABC("E", "Eagle"));
        dictionary.put(new ABC("F", "Falcon"));
        dictionary.put(new ABC("G", "Galago "));
        dictionary.put(new ABC("H", "Hamster"));
        dictionary.put(new ABC("I", "Iberian Lynx"));
        dictionary.put(new ABC("J", "Jacana"));
        dictionary.put(new ABC("K", "Kangaroo"));        
        
        System.out.println("");

    }

    @Test
    public void t1() {


        System.out.println(dictionary.get("A"));
        var actual = dictionary.get("A").get().getKey();
        var expected = "A";

        dictionary.debug((i,e) -> {
            System.out.println("key: " + i + ", value: " + e);
        });

        assertEquals(expected, actual);
        System.out.println("Developer: Abdallah, Salem");
    }


    @Test
    public void t2() {

        var actual = dictionary.get("K").get().getValue();
        var expected = "Kangaroo";
        assertEquals(expected, actual.getDescription());
    }

    @Test
    public void t3() {

        var actual = dictionary.size();
        var expected = 11;
        assertEquals(expected, actual);
    }
}