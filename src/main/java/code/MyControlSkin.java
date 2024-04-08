package code;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.control.SkinBase;
import javafx.scene.control.TextField;

public class MyControlSkin extends SkinBase<MyControl> {
    private final TextField textField;

    public MyControlSkin(MyControl control) {
        super(control);
        textField = new TextField();
        getChildren().add(textField);
    }

    @Override
    protected void layoutChildren(double contentX, double contentY, double contentWidth, double contentHeight) {
        layoutInArea(textField, contentX, contentY, contentWidth, contentHeight, 0, HPos.CENTER, VPos.CENTER);
    }
}
