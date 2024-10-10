package org.example.ObjektOrientierung.PC;

public class Hardware {

    private String mainboard;
    private String processor;
    private int ram;
    private String hardDrive;
    private int hardDriveSize;
    private String graphicsCard;





    public Hardware() {


        this.mainboard = "Asus X1";
        this.processor = "Intel i7";
        this.ram = 16;
        this.hardDrive = "SSD";
        this.hardDriveSize = 500;
        this.graphicsCard = "NVDIA RTX 2080";


    }


    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public int getHardDriveSize() {
        return hardDriveSize;
    }

    public void setHardDriveSize(int hardDriveSize) {
        this.hardDriveSize = hardDriveSize;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }



}
