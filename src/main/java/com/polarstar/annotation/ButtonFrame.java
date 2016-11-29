package com.polarstar.annotation;

import java.awt.*;

import javax.swing.*;

/**
 * Created by zhangxuegang on 2016/9/30.
 */
public class ButtonFrame extends JFrame {
    private Panel panel;
    public ButtonFrame()  {
        ActionListenerInstaller.processAnnotations(this);
    }

    @ActionListenerFor(source = "yellowButton")
    public void yellowBackground()  {
        panel.setBackground(Color.YELLOW);
    }

}
