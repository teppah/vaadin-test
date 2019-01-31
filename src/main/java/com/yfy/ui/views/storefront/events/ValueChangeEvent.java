package com.yfy.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.yfy.ui.views.orderedit.OrderItemsEditor;

public class ValueChangeEvent extends ComponentEvent<OrderItemsEditor> {

	public ValueChangeEvent(OrderItemsEditor component) {
		super(component, false);
	}
}