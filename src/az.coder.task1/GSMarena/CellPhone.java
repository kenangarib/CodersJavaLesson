package az.coder.task1.GSMarena;

import az.coder.task1.GSMarena.PhoneFunctions.BackCamera.BackCamera;
import az.coder.task1.GSMarena.PhoneFunctions.DateTime;
import az.coder.task1.GSMarena.PhoneFunctions.Processors.Processor;
import az.coder.task1.GSMarena.PhoneFunctions.ScreenPanels.ScreenPanels;

public abstract class CellPhone {


    protected ScreenPanels screenPanel;
    protected BackCamera backCamera ;
    protected Processor processor;
    protected DateTime dateTime;

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
