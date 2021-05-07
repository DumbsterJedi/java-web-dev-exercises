package exercises.technology;

public class Computer {
    String power;
    String poweredBy;
    String entityUsedBy;

    public Computer(String aPoweredBy,String aEntityUsedBy){
        entityUsedBy = aEntityUsedBy;
        poweredBy = aPoweredBy;
        power = "off";
    }


    public String getPoweredBy() {
        return poweredBy;
    }

    public void setPoweredBy(String poweredBy) {
        this.poweredBy = poweredBy;
    }

    public String getEntityUsedBy() {
        return entityUsedBy;
    }

    public void setEntityUsedBy(String entityUsedBy) {
        this.entityUsedBy = entityUsedBy;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void powerOn(){
        this.setPower("on");
    }
    public void powerOff(){
        this.setPower("off");
    }
}
