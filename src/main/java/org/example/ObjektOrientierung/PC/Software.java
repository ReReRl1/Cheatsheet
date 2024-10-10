package org.example.ObjektOrientierung.PC;

public interface Software {


    public void installOperatingSystem(String operatingSystem);
    public void installOfficeSoftware(String installOfficeSoftware);
    public void installAntiVirusSoftware(String installAntiVirusSoftware);
    public void installBrowser(String installBrowser);
    public void installEmailClient(String installEmailClient);
    public void installIDE(String installIDE);
    public void uninstallOperatingSystem();
    public void uninstallOfficeSoftware();
    public void uninstallAntiVirusSoftware();
    public void uninstallBrowser();
    public void uninstallEmailClient();
    public void uninstallIDE();

    public void softwareInfo();

}
