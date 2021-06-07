/*
* 
*/
package dataWebDeskDSL.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class NormalPageNormalPageMultimediasCompartmentItemSemanticEditPolicy
		extends dataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public NormalPageNormalPageMultimediasCompartmentItemSemanticEditPolicy() {
		super(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.NormalPage_2015);
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
