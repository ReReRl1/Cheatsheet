package org.example.ObjektOrientierung.PC;

public class Main {

    public static void main(String[] args) {

        PC workingPC = new PC();


        System.out.println(workingPC.getHardDriveSize());
        workingPC.softwareInfo();
        workingPC.installBrowser("Browser");
        System.out.println(workingPC.getHardDriveSize());

        workingPC.uninstallBrowser();
        System.out.println(workingPC.getHardDriveSize());
    }
}
