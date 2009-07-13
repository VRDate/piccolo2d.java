/**
 * 
 */
package edu.umd.cs.piccolo;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class MockPropertyChangeListener implements PropertyChangeListener {
	private List changes = new ArrayList();

	public void propertyChange(PropertyChangeEvent evt) {
		changes.add(evt);
	}		

	public int getPropertyChangeCount() {
		return changes.size();
	}
}