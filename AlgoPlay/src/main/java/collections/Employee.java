package collections;

public class Employee {

   private String name;

   private Integer eid;

   public String getName() {
       return this.name;
   }

   public void setName(String name) {
       this.name = name;
   }

    public Integer getEid() {
        return this.eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    @Override
    public String toString() {
        return name + " " + eid;
    }

}
