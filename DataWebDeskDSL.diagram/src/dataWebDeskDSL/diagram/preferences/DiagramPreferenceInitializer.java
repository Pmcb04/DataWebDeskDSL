/*
 * 
 */
package dataWebDeskDSL.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		dataWebDeskDSL.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		dataWebDeskDSL.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		dataWebDeskDSL.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		dataWebDeskDSL.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		dataWebDeskDSL.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
