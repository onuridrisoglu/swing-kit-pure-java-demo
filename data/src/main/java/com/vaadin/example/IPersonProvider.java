package com.vaadin.example;

import com.vaadin.swingkit.core.SwingVaadinCallable;

/**
 * SwingVaadinCallable interface that has to be implemented by any Vaadin View
 * that want to be callable from the Swing side.
 * 
 * @author Vaadin Ltd.
 *
 */
public interface IPersonProvider extends SwingVaadinCallable {
	void show(Long id);
}
