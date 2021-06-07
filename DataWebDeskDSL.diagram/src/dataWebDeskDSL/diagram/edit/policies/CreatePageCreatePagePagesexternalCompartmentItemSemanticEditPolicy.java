/*
* 
*/
package dataWebDeskDSL.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class CreatePageCreatePagePagesexternalCompartmentItemSemanticEditPolicy
		extends dataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CreatePageCreatePagePagesexternalCompartmentItemSemanticEditPolicy() {
		super(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CreatePage_2011);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PageExternal_3013 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.PageExternalCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
