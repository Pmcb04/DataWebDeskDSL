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
public class DataWebDeskDSLModelingAssistantProviderOfDetailPageEditPart
		extends dataWebDeskDSL.diagram.providers.DataWebDeskDSLModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001);
		}
		if (targetEditPart instanceof dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001);
		}
		if (targetEditPart instanceof dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001);
		}
		if (targetEditPart instanceof dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001);
		}
		if (targetEditPart instanceof dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001);
		}
		if (targetEditPart instanceof dataWebDeskDSL.diagram.edit.parts.MainPageEditPart) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001);
		}
		if (targetEditPart instanceof dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CreatePage_2011);
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DetailPage_2012);
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DeletePage_2013);
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.IndexPage_2014);
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.NormalPage_2015);
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.MainPage_2016);
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
		return doGetRelTypesOnTarget((dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolAccess_4006);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityCrudpages_4005);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolAccess_4006) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Rol_2008);
		} else if (relationshipType == dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CreatePage_2011);
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DetailPage_2012);
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DeletePage_2013);
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.IndexPage_2014);
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.NormalPage_2015);
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.MainPage_2016);
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUDPage_2017);
		} else if (relationshipType == dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityCrudpages_4005) {
			types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entity_2009);
		}
		return types;
	}

}
