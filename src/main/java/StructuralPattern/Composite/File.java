package StructuralPattern.Composite;

public class File implements FileSystem{

    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(this.getClass().getSimpleName() + "(" + name + ")");
    }
}
