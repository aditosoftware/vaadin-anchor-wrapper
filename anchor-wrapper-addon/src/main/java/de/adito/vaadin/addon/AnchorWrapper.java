package de.adito.vaadin.addon;

import com.vaadin.server.Resource;
import com.vaadin.ui.AbstractSingleComponentContainer;
import com.vaadin.ui.Component;
import de.adito.vaadin.addon.client.AnchorWrapperState;

public class AnchorWrapper extends AbstractSingleComponentContainer {

  public AnchorWrapper (Resource pResource, Component pComponent) {
    setResource(pResource);
    setContent(pComponent);
  }

  @Override
  protected AnchorWrapperState getState () {
    return (AnchorWrapperState) super.getState();
  }

  @Override
  protected AnchorWrapperState getState (boolean markAsDirty) {
    return (AnchorWrapperState) super.getState(markAsDirty);
  }

  public void setResource (Resource pResource) {
    setResource("href", pResource);
  }
}
