package StructuralPattern.Composite;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Folder rootFolder = new Folder("최상위 폴더");
        File file1 = new File("file1");
        File file2 = new File("file2");
        rootFolder.addFile(file1);
        rootFolder.addFile(file2);

        Folder folder_1dpeth = new Folder("1depth 폴더");
        File file3 = new File("file3");
        File file4 = new File("file4");
        folder_1dpeth.addFile(file3);
        folder_1dpeth.addFile(file4);

        Folder folder_2dpeth = new Folder("2depth 폴더");
        File file5 = new File("file5");
        File file6 = new File("file6");
        folder_2dpeth.addFile(file5);
        folder_2dpeth.addFile(file6);

        Folder folder_3dpeth = new Folder("3depth 폴더");
        File file7 = new File("file7");
        File file8 = new File("file8");
        folder_3dpeth.addFile(file7);
        folder_3dpeth.addFile(file8);

        rootFolder.addFile(folder_1dpeth);
        folder_1dpeth.addFile(folder_2dpeth);
        folder_2dpeth.addFile(folder_3dpeth);

        rootFolder.print();
        System.out.println("======================================");
        folder_1dpeth.print();
        System.out.println("======================================");
        folder_2dpeth.print();
        System.out.println("======================================");
        folder_3dpeth.print();
    }
}
