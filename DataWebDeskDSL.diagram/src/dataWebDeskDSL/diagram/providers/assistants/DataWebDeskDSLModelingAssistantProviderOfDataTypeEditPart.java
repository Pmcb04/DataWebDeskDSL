/*
 * 
 */
package dataWebDeskDSL.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DataWebDeskDSLModelingAssistantProviderOfDataTypeEditPart
		extends dataWebDeskDSL.diagram.providers.DataWebDeskDSLModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.AttributeType_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.AttributeType_4007) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Attribute_3007);
		}
		return types;
	}

}
