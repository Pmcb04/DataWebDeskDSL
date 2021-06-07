/*
* 
*/
package dataWebDeskDSL.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CRUDPageCRUDPageMultimediasCompartmentItemSemanticEditPolicy
		extends dataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CRUDPageCRUDPageMultimediasCompartmentItemSemanticEditPolicy() {
		super(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUDPage_2017);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Text_3008 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.TextCreateCommand(req));
		}
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Video_3009 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.VideoCreateCommand(req));
		}
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Audio_3010 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.AudioCreateCommand(req));
		}
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Image_3011 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.ImageCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
