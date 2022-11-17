package GSMarena;

import GSMarena.PhoneFunctions.BackCamera.BackCamera;
import GSMarena.Brand.Brand;
import GSMarena.PhoneFunctions.Processors.Processor;
import GSMarena.PhoneFunctions.ScreenPanels.ScreenPanels;

public abstract class CellPhone {

    Brand brand = new Brand();
    ScreenPanels screenPanel = new ScreenPanels();
    BackCamera backCamera = new BackCamera();
    Processor processor = new Processor();

    private String frontCameraModel;
    private String backCameraModel;
    private Integer batteryCapasite;
    private String bodyMaterial;
    private String operativeSystem;


}
