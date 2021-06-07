/*
 * 
 */
package dataWebDeskDSL.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DataWebDeskDSLModelingAssistantProviderOfAttributeEditPart
		extends dataWebDeskDSL.diagram.providers.DataWebDeskDSLModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((dataWebDeskDSL.diagram.edit.parts.AttributeEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(dataWebDeskDSL.diagram.edit.parts.AttributeEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.AttributeType_4007);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((dataWebDeskDSL.diagram.edit.parts.AttributeEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(dataWebDeskDSL.diagram.edit.parts.AttributeEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.AttributeType_4007);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((dataWebDeskDSL.diagram.edit.parts.AttributeEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(dataWebDeskDSL.diagram.edit.parts.AttributeEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.AttributeType_4007) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DataType_2010);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((dataWebDeskDSL.diagram.edit.parts.AttributeEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(dataWebDeskDSL.diagram.edit.parts.AttributeEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityPrimarykey_4004);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((dataWebDeskDSL.diagram.edit.parts.AttributeEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(dataWebDeskDSL.diagram.edit.parts.AttributeEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityPrimarykey_4004) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entity_2009);
		}
		return types;
	}

}
