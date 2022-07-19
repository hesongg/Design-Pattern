package StructuralPattern.Composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{

    private final String name;

    private final List<FileSystem> files = new ArrayList<>();

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + "(" + name + ")");

        files.forEach(FileSystem::print);
    }

    public void addFile(FileSystem fileSystem) {
        files.add(fileSystem);
    }

    public Folder(String name) {
        this.name = name;
    }
}
