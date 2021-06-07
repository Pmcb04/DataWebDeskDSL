/*
 * 
 */
package dataWebDeskDSL.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
