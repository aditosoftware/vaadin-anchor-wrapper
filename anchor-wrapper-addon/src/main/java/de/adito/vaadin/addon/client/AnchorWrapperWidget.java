package de.adito.vaadin.addon.client;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;

public class AnchorWrapperWidget extends SimplePanel {
  private Widget widget;

  public AnchorWrapperWidget () {
    super(DOM.createAnchor());
  }
}
