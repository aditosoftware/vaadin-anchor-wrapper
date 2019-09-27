package de.adito.vaadin.addon.client;

import com.vaadin.client.ComponentConnector;
import com.vaadin.client.ConnectorHierarchyChangeEvent;
import com.vaadin.client.communication.StateChangeEvent;
import com.vaadin.client.ui.AbstractSingleComponentContainerConnector;
import com.vaadin.shared.ui.Connect;
import org.test.AnchorWrapper;

@Connect(AnchorWrapper.class)
public class AnchorWrapperConnector extends AbstractSingleComponentContainerConnector {

  @Override
  public AnchorWrapperWidget getWidget () {
    return (AnchorWrapperWidget) super.getWidget();
  }

  @Override
  public AnchorWrapperState getState () {
    return (AnchorWrapperState) super.getState();
  }

  @Override
  public void onStateChanged (StateChangeEvent stateChangeEvent) {
    super.onStateChanged(stateChangeEvent);
    if (stateChangeEvent.hasPropertyChanged("resource")) {
      String href = getResourceUrl("href");
      if (href == null) {
        getWidget().getElement().removeAttribute("href");
      } else {
        getWidget().getElement().setAttribute("href", href);
      }
    }
  }

  @Override
  public boolean delegateCaptionHandling () {
    return false;
  }

  @Override
  public void onConnectorHierarchyChange (ConnectorHierarchyChangeEvent connectorHierarchyChangeEvent) {
    getWidget().setWidget(getChildComponents().get(0).getWidget());
  }

  @Override
  public void updateCaption (ComponentConnector connector) {
  }
}
