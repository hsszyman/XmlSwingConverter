package xmlswingpagefactory.interfaces;

import org.w3c.dom.Element;
import xmlswingpagefactory.ConverterSuite;
import xmlswingpagefactory.XmlSwingPage;

import javax.swing.*;
import java.awt.*;

public interface BoxLayoutGenerator {
    Container generateBoxLayoutPanel(Element elem, XmlSwingPage xsp, ConverterSuite delegates);
}
