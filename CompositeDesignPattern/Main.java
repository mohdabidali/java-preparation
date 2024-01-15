package CompositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Movies");
    
    FileSystem fileSystem = new File("3_IDIOTS");
    directory.add(fileSystem);

    Directory directory2 = new Directory("Comedy");
    FileSystem fileSystem2 = new File("Hulchul");
    directory2.add(fileSystem2);
    directory.add(directory2);

    directory.ls();
     
    }
   
}
