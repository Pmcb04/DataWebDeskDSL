/*
* 
*/
package dataWebDeskDSL.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class DataWebDeskDSLNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7045;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7044;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) {
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem item = (dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
