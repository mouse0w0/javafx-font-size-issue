package code;

import javafx.scene.control.Control;
import javafx.scene.control.Skin;

public class MyControl extends Control {
    @Override
    protected Skin<?> createDefaultSkin() {
        return new MyControlSkin(this);
    }

    @Override
    public String getUserAgentStylesheet() {
        return MyControl.class.getResource("/MyControl.css").toExternalForm();
    }
}
