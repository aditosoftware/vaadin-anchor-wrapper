package de.adito.vaadin.addon.anchor_wrapper;

import com.vaadin.server.Resource;
import com.vaadin.ui.AbstractSingleComponentContainer;
import com.vaadin.ui.Component;
import de.adito.vaadin.addon.anchor_wrapper.client.AnchorWrapperConstants;
import de.adito.vaadin.addon.anchor_wrapper.client.AnchorWrapperState;

/**
 * Describes a Vaadin component which takes a resource and component. The given
 * component will be wrapped into a `<a></a>`-Tag.
 */
public class AnchorWrapper extends AbstractSingleComponentContainer implements Component.Focusable {

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

  /**
   * Will set the given resource as href resource for the anchor tag.
   *
   * @param pResource The resource to use for the anchor tag.
   */
  public void setResource (Resource pResource) {
    setResource(AnchorWrapperConstants.HREF_RESOURCE, pResource);
  }

  @Override
  public void focus () {
    super.focus();
  }

  @Override
  public int getTabIndex () {
    return getState().tabIndex;
  }

  @Override
  public void setTabIndex (int tabIndex) {
    getState().tabIndex = tabIndex;
  }
}
