package edu.citytech.javareview.datastructure.dictionary;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.citytech.javareview.dto.ABC;

// Developer: Boulet, Jean
public class T2_Dictionary {

    Dictionary<String, ABC> dictionary = new Dictionary<>(10);

    @BeforeEach
    public void before() {

        dictionary.collisionEvent((k,v) -> {
           System.out.println("key: " + k + ", value: " + v);
        });

        // 11 Items
        dictionary.put(new ABC("A","Anaconda"));
        dictionary.put(new ABC("A","Andean Mountain Cat"));
        dictionary.put(new ABC("B","Bat"));
        dictionary.put(new ABC("B","Batfish"));
        dictionary.put(new ABC("C","Carp"));
        dictionary.put(new ABC("C","Cassowary"));
        dictionary.put(new ABC("D","Dik-dik"));
        dictionary.put(new ABC("D","Dikkop"));
        dictionary.put(new ABC("E","Elephant Bird"));
        dictionary.put(new ABC("E","Elephant"));
        dictionary.put(new ABC("F","FireFly"));
        dictionary.put(new ABC("F","Flat-headed Cat"));
        dictionary.put(new ABC("F","Flea"));
        dictionary.put(new ABC("G","Geoffroy's Cat"));
        dictionary.put(new ABC("H","Helmetshrike"));
        dictionary.put(new ABC("I","Iberian Lynx"));
        dictionary.put(new ABC("J","Jacana"));
        dictionary.put(new ABC("K","Kangaroo"));
        dictionary.put(new ABC("L","Ladybug"));
        dictionary.put(new ABC("M","Macaw"));
        dictionary.put(new ABC("N","Naked Mole-rat"));
        dictionary.put(new ABC("O","Ocelot"));
        dictionary.put(new ABC("P","Paca"));
        dictionary.put(new ABC("Q","Qinling Panda "));
        dictionary.put(new ABC("R","Rabbit"));
        dictionary.put(new ABC("S","Saber-toothed Cat"));
        dictionary.put(new ABC("T","Tadpole"));
        dictionary.put(new ABC("U","Urchin"));
        dictionary.put(new ABC("V","Vanga"));
        dictionary.put(new ABC("W","Wader"));
        dictionary.put(new ABC("X","X-Ray Tetra"));
        dictionary.put(new ABC("Y","Yak"));
        dictionary.put(new ABC("Z","Zebra"));

        System.out.println("");

    }

    @Test public
    void t1() {


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
        var expected = 26;
        assertEquals(expected, actual);
    }

    @Test
    public void t4() {

        var actual = dictionary.get("F").get().getValue();
        var expected = "Flea";
        assertEquals(expected, actual.getDescription());
    }
}