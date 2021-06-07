/*
* 
*/
package dataWebDeskDSL.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class DeletePageDeletePageSocialMediasCompartmentItemSemanticEditPolicy
		extends dataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public DeletePageDeletePageSocialMediasCompartmentItemSemanticEditPolicy() {
		super(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DeletePage_2013);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.SocialMedia_3012 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.SocialMediaCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
