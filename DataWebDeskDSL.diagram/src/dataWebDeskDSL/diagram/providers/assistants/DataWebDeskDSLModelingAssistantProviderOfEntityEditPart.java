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
public class DataWebDeskDSLModelingAssistantProviderOfEntityEditPart
		extends dataWebDeskDSL.diagram.providers.DataWebDeskDSLModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((dataWebDeskDSL.diagram.edit.parts.EntityEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(dataWebDeskDSL.diagram.edit.parts.EntityEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityEntitiesReferences_4003);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityPrimarykey_4004);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityCrudpages_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((dataWebDeskDSL.diagram.edit.parts.EntityEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(dataWebDeskDSL.diagram.edit.parts.EntityEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof dataWebDeskDSL.diagram.edit.parts.EntityEditPart) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityEntitiesReferences_4003);
		}
		if (targetEditPart instanceof dataWebDeskDSL.diagram.edit.parts.AttributeEditPart) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityPrimarykey_4004);
		}
		if (targetEditPart instanceof dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityCrudpages_4005);
		}
		if (targetEditPart instanceof dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityCrudpages_4005);
		}
		if (targetEditPart instanceof dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityCrudpages_4005);
		}
		if (targetEditPart instanceof dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityCrudpages_4005);
		}
		if (targetEditPart instanceof dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityCrudpages_4005);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((dataWebDeskDSL.diagram.edit.parts.EntityEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(dataWebDeskDSL.diagram.edit.parts.EntityEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityEntitiesReferences_4003) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entity_2009);
		} else if (relationshipType == dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityPrimarykey_4004) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Attribute_3007);
		} else if (relationshipType == dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityCrudpages_4005) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CreatePage_2011);
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DetailPage_2012);
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DeletePage_2013);
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.IndexPage_2014);
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUDPage_2017);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((dataWebDeskDSL.diagram.edit.parts.EntityEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(dataWebDeskDSL.diagram.edit.parts.EntityEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityEntitiesReferences_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((dataWebDeskDSL.diagram.edit.parts.EntityEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(dataWebDeskDSL.diagram.edit.parts.EntityEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityEntitiesReferences_4003) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entity_2009);
		}
		return types;
	}

}
