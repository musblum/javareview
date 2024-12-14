package edu.citytech.javareview.datastructure.avl;

import edu.citytech.javareview.datastructure.dictionary.Dictionary;
import edu.learning.datastructure.java17.facade.IModelEntry;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class T2_AVL {

    record REIT(int rank, String name, String yield) implements Comparable<REIT>, IModelEntry<String, REIT> {

        @Override
        public int compareTo(REIT o) {
            return this.name.compareTo(o.name);
        }


        @Override
        public String getKey() {
            return this.name;
        }

        @Override
        public REIT getValue() {
            return this;
        }
    }

    static Dictionary<String, REIT> dictionary = new Dictionary<String, REIT>(18);
    static AVLTree<REIT> tree = new AVLTree<REIT>();

    @AfterAll public static void check() {
        System.out.println("Check AVL tree");

        int actual = tree.size();
        int expected = 177;
        assertEquals(expected, actual);

        System.out.println("Check AVL tree");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/REIT.csv", numLinesToSkip = 1, encoding = "UTF-8" )
    void testWithCsvFileResource(int rank, String name, String yield) {
        var reit = new REIT(rank, name, yield);

        dictionary.put(reit);
        //tree.add(reit);

        System.out.println(reit.toString());
        // assertTrue(name.length() > 2);
        // assertTrue(age >= 20);
    }
}