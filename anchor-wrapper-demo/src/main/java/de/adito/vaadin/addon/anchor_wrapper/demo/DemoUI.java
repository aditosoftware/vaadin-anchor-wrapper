package de.adito.vaadin.addon.anchor_wrapper.demo;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.UI;
import de.adito.vaadin.addon.anchor_wrapper.AnchorWrapper;

import javax.servlet.annotation.WebServlet;

@Theme("demo")
@Title("AnchorWrapper Add-on Demo")
@SuppressWarnings("serial")
public class DemoUI extends UI {

  @WebServlet(value = "/*", asyncSupported = true)
  @VaadinServletConfiguration(productionMode = false, ui = DemoUI.class)
  public static class Servlet extends VaadinServlet {
  }

  @Override
  protected void init (VaadinRequest request) {
    Panel wrapPanel = new Panel(new Label("test"));

    AnchorWrapper anchor = new AnchorWrapper(new ExternalResource("https://google.com"), wrapPanel);
    anchor.setStyleName("v-test");

    anchor.setTabIndex(20);

    setContent(anchor);
  }
}
