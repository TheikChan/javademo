package org.theikchan;

public class FileNameDemo {
    private String fullPath;
    private char pathSeparator, 
                 extensionSeparator;

    public FileNameDemo(String str, char sep, char ext) {
        fullPath = str;
        pathSeparator = sep;
        extensionSeparator = ext;
    }

    public String extension() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        return fullPath.substring(dot + 1);
    }

    // gets filename without extension
    public String filename() {
        int dot = fullPath.lastIndexOf(extensionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(sep + 1, dot);
    }

    public String path() {
        int sep = fullPath.lastIndexOf(pathSeparator);
        return fullPath.substring(0, sep);
    }

    public static void main(String[] args) {
        final String FPATH = "/home/user/index.html";
        FileNameDemo myHomePage = new FileNameDemo(FPATH, '/', '.');
        IO.println("Extension = " + myHomePage.extension());
        IO.println("Filename = " + myHomePage.filename());
        IO.println("Path = " + myHomePage.path());
    }
}
