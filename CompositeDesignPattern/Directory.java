package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String fileName;
    List<FileSystem> directoryFileList;
    
    Directory(String fileName){
        this.fileName= fileName;
        this.directoryFileList = new ArrayList<>();
    }
    public void add(FileSystem fileSystem){
        directoryFileList.add(fileSystem);
    }
    public void ls(){
System.out.println("DirectoryName"+ fileName);
for(FileSystem fileSystemObj :directoryFileList){
        fileSystemObj.ls();
}
    }
}
