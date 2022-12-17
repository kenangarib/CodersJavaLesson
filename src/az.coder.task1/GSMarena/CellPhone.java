package az.coder.task1.GSMarena;

import az.coder.task1.GSMarena.PhoneFunctions.BackCamera.BackCamera;
import az.coder.task1.GSMarena.PhoneFunctions.Body.Body;
import az.coder.task1.GSMarena.PhoneFunctions.DateTime;
import az.coder.task1.GSMarena.PhoneFunctions.Network;
import az.coder.task1.GSMarena.Platform.Platform;
import az.coder.task1.GSMarena.PhoneFunctions.ScreenPanels.ScreenPanels;

public abstract class CellPhone {


    protected ScreenPanels screenPanel;
    protected BackCamera backCamera ;
    protected Platform platform;
    protected DateTime dateTime;
    protected Network network;
    protected Body body;



    private String frontCameraModel;
    private String backCameraModel;
    private Integer batteryCapasite;
    private String bodyMaterial;
    private String operativeSystem;
    protected Integer RAM;
    protected Integer memory;

    public CellPhone() {
    }



}
