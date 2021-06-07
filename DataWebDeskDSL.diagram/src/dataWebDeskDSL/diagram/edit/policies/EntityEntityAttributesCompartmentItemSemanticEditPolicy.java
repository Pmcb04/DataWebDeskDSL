/*
* 
*/
package dataWebDeskDSL.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class EntityEntityAttributesCompartmentItemSemanticEditPolicy
		extends dataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public EntityEntityAttributesCompartmentItemSemanticEditPolicy() {
		super(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entity_2009);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Attribute_3007 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.AttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
