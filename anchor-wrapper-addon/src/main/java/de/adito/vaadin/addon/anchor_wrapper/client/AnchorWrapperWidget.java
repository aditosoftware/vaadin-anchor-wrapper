package de.adito.vaadin.addon.anchor_wrapper.client;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.SimplePanel;

/**
 * Describes the anchor wrapper widget which just extends {@link SimplePanel}
 * and uses an anchor as element.
 */
public class AnchorWrapperWidget extends SimplePanel {

  public AnchorWrapperWidget () {
    super(DOM.createAnchor());

    // Add the style name for the panel.
    setStylePrimaryName("v-anchor-wrapper");
  }
}
