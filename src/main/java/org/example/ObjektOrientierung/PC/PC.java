package org.example.ObjektOrientierung.PC;


import java.util.ArrayList;


public class PC extends Hardware implements Software {


    private String operatingSystem;
    private String officeSoftware;
    private String antiVirusSoftware;
    private String browser;
    private String emailClient;
    private String ide;



    public PC() {

        super();


    }


    @Override
    public void installOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        System.out.println("Operation System installed");
        super.setHardDriveSize(getHardDriveSize() - 60);

    }

    @Override
    public void installOfficeSoftware(String installOfficeSoftware) {
        System.out.println("Office Software installed");
        super.setHardDriveSize(getHardDriveSize() - 10);
    }

    @Override
    public void installAntiVirusSoftware(String installAntiVirusSoftware) {
        System.out.println("AntiVirus Software installed ");
        super.setHardDriveSize(getHardDriveSize() - 5);
    }

    @Override
    public void installBrowser(String installBrowser) {
        System.out.println("Browser installed ");
        super.setHardDriveSize(getHardDriveSize() - 2);
    }

    @Override
    public void installEmailClient(String installEmailClient) {
        System.out.println("Email Client installed");
        super.setHardDriveSize(getHardDriveSize() - 1);
    }

    @Override
    public void installIDE(String installIDE) {
        System.out.println("IDE installed ");
        super.setHardDriveSize(getHardDriveSize() - 5);
    }

    @Override
    public void uninstallOperatingSystem() {
        super.setHardDriveSize(getHardDriveSize() + 60);
        System.out.println("Operating System uninstalled ");

    }

    @Override
    public void uninstallOfficeSoftware() {
        super.setHardDriveSize(getHardDriveSize() + 20);
        System.out.println("Office Software uninstalled ");
    }

    @Override
    public void uninstallAntiVirusSoftware() {
        super.setHardDriveSize(getHardDriveSize() + 10);
        System.out.println("Anti Virus Software uninstalled ");
    }

    @Override
    public void uninstallBrowser() {
        super.setHardDriveSize(getHardDriveSize() + 2);
        System.out.println("Browser uninstalled ");
    }

    @Override
    public void uninstallEmailClient() {
        super.setHardDriveSize(getHardDriveSize() + 1);
        System.out.println("Email Client deleted ");
    }

    @Override

    public void uninstallIDE() {
        System.out.println("IDE Deleted ");
        super.setHardDriveSize(getHardDriveSize() + 2);
    }

    @Override
    public void softwareInfo() {

        System.out.println("Betriebssystem: " + operatingSystem);
        System.out.println("Office Software: " + officeSoftware);
        System.out.println("Antivirus Software: " + antiVirusSoftware);
        System.out.println("Browser: " + browser);
        System.out.println("Email Client: " + emailClient);
        System.out.println("IDE: " + ide);

    }


    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getOfficeSoftware() {
        return officeSoftware;
    }

    public String getAntiVirusSoftware() {
        return antiVirusSoftware;
    }

    public String getBrowser() {
        return browser;
    }


    public String getEmailClient() {
        return emailClient;
    }


    public String getIde() {
        return ide;
    }


}
