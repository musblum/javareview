package edu.citytech.javareview.datastructure.sort;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import edu.citytech.javareview.datastructure.DynamicArray;

@DisplayName("DynamicArray.filterScore")
public class T5_DynamicArray {

    static Integer[] numbers = {10,1,7,2,3,5,6,7,11,-4,20,7};
    static DynamicArray<Integer> dynamicArray = new DynamicArray<>(Integer[]::new );

    @BeforeEach void beforeEachMethod(){
        System.out.println("beforeEach");
        dynamicArray.add(numbers);
        dynamicArray.toString(System.out::println);
    }

    void booboo(Integer value){
        System.out.print(value + " ");
    }

    // @Test
    // @DisplayName("(1) Test for DynamicArray")
    // void t1(){

    //     int expected = 3;

    //     var da = new DynamicArray<>(Integer[]::new);

    //     System.out.println("-".repeat(100));
    //     dynamicArray.filterScore(7, da::add);
    //     System.out.println(da);
    //     int actual = da.size();

    //     assertEquals(expected, actual);
    // }

    // @Test
    // @DisplayName("(1) Test for DynamicArray")
    // void t2(){

    //     int expected = 1;

    //     var da = new DynamicArray<>(Integer[]::new);

    //     System.out.println("-".repeat(100));
    //     dynamicArray.filterScore(1, da::add);
    //     System.out.println(da);
    //     int actual = da.size();

    //     assertEquals(expected, actual);
    // }

    // @Test
    // @DisplayName("(1) Test for DynamicArray")
    // void t3(){

    //     int expected = 3;

    //     var da = new DynamicArray<>(Integer[]::new);

    //     System.out.println("-".repeat(100));
    //     dynamicArray.filterScore(10, da::add);
    //     dynamicArray.filterScore(10, da::add);
    //     dynamicArray.filterScore(10, da::add);
    //     System.out.println(da);
    //     int actual = da.size();

    //     assertEquals(expected, actual);
    // }

    // @Test
    // @DisplayName("(1) Test for DynamicArray")
    // void t4(){

    //     int expected = 1;

    //     var da = new DynamicArray<>(Integer[]::new);

    //     System.out.println("-".repeat(100));
    //     dynamicArray.filterScore(11, da::add);
    //     dynamicArray.filterScore(11, da::add);
    //     System.out.println(da);
    //     int actual = da.size();

    //     assertEquals(expected, actual);
    // }

    // @Test
    // @DisplayName("(1) Test for DynamicArray")
    // void t5(){

    //     int expected = 0;

    //     var da = new DynamicArray<>(Integer[]::new);

    //     System.out.println("-".repeat(100));
    //     dynamicArray.filterScore(8, da::add);
    //     System.out.println(da);
    //     int actual = da.size();

    //     assertEquals(expected, actual);
    // }

    // @Test
    // @DisplayName("(1) Test for DynamicArray")
    // void t6(){

    //     int expected = 2;

    //     dynamicArray.add(1);
    //     dynamicArray.toString(System.out::println);
    //     var da = new DynamicArray<>(Integer[]::new);

    //     System.out.println("-".repeat(100));
    //     dynamicArray.filterScore(1, da::add);
    //     System.out.println(da);
    //     int actual = da.size();

    //     assertEquals(expected, actual);
    // }

    // @Test
    // @DisplayName("(1) Test for DynamicArray")
    // void t7(){

    //     int expected = 0;

    //     var da = new DynamicArray<>(Integer[]::new);

    //     System.out.println("-".repeat(100));
    //     // dynamicArray.filterScore(.8, da::add);
    //     System.out.println(da);
    //     int actual = da.size();

    //     assertEquals(expected, actual);
    // }

    // @Test
    // @DisplayName("(1) Test for DynamicArray")
    // void t8(){

    //     int expected = 4;

    //     var da = new DynamicArray<>(Integer[]::new);

    //     System.out.println("-".repeat(100));
    //     dynamicArray.filterScore(1, da::add);
    //     dynamicArray.filterScore(7, da::add);
    //     System.out.println(da);
    //     int actual = da.size();

    //     assertEquals(expected, actual);
    // }

    // @Test
    // @DisplayName("(1) Test for DynamicArray")
    // void t9(){

    //     int expected = 0;

    //     var da = new DynamicArray<>(Integer[]::new);

    //     System.out.println("-".repeat(100));
    //     dynamicArray.filterScore(null, da::add);
    //     System.out.println(da);
    //     int actual = da.size();

    //     assertEquals(expected, actual);
    // }

    // @Test
    // @DisplayName("(1) Test for DynamicArray")
    // void t10(){

    //     int expected = 1;

    //     var da = new DynamicArray<>(Integer[]::new);

    //     System.out.println("-".repeat(100));
    //     dynamicArray.filterScore(6/2, da::add);
    //     System.out.println(da);
    //     int actual = da.size();

    //     assertEquals(expected, actual);
    // }
}

