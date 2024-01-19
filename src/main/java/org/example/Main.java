package org.example;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {


        String test = "app";
        Path path = Paths.get(test);
        path = Paths.get(path.toString() + File.separator);
        System.out.println(path);


    }

    private static Path extractPathSegment(String fullPath1, String basePath1) {
        Path full = Paths.get(fullPath1);
        Path base = Paths.get(basePath1);
        Path relative = base.relativize(full);
        String relativeStr = relative.toString();
        int srcIndex = relativeStr.indexOf("src");
        if (srcIndex != -1) {
            relativeStr = relativeStr.substring(0, srcIndex);
        }
        return Paths.get(relativeStr);
    }
}
