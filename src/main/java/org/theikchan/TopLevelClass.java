package org.theikchan;

public class TopLevelClass {

    void accessMembers(OuterClass outer) {
        // Compiler error: Cannot make a static reference to the non-static
        //     field OuterClass.outerField
        // IO.println(OuterClass.outerField);
        IO.println(outer.outerField);
        IO.println(OuterClass.staticOuterField);
    }
}
