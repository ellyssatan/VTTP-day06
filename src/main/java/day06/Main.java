package day06;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box abc = new Box();
        abc.setContent("This is a String");

        Box xyz = new Box();
        xyz.setContent(3);

        Box boxOfInts = new Box();
        boxOfInts.setContent(3);

        Box boxOfStrings = new Box();

        Utils.printBox(abc);
        Utils.printBox(xyz);

        boxOfInts.setContent(boxOfStrings);

        boxOfStrings.setContent("false");

        BoxG<Integer> bInt = new BoxG<Integer>();
        BoxG<String> bStr = new BoxG<String>();
        BoxG<List<String>> bListStr = new BoxG<List<String>>();
        BoxG<List<Float>> bBoxFloat;

        bBoxFloat = new BoxG<>();

        bInt.setContent(1);

        // Wrong, cannot compile
        // bInt.setC




    }
}

