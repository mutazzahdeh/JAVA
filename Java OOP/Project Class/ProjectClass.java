public class ProjectClass{
    private String name;
    private String description;

    public String elevatorPitch(){
      return (this.name +  this.description);
    }
public String getName() {
        return name;
    }
    
    // setter
public void setName(String name) {
    this.name = name;
 }

public String getDescription() {
        return description;
    }
    
    // setter
public void setDescription(String description) {
    this.description = description;
 }
public void Project() {

}

public void Project(String name) {
    this.name=name;

}

public void Project(String name, String description) {
    this.description=description;
    this.name=name;
}

}
