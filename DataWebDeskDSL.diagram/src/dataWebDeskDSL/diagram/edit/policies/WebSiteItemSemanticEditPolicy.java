/*
* 
*/
package dataWebDeskDSL.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class WebSiteItemSemanticEditPolicy
		extends dataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public WebSiteItemSemanticEditPolicy() {
		super(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.WebSite_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CreatePage_2011 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.CreatePageCreateCommand(req));
		}
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DetailPage_2012 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.DetailPageCreateCommand(req));
		}
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DeletePage_2013 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.DeletePageCreateCommand(req));
		}
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.IndexPage_2014 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.IndexPageCreateCommand(req));
		}
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.NormalPage_2015 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.NormalPageCreateCommand(req));
		}
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.MainPage_2016 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.MainPageCreateCommand(req));
		}
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUDPage_2017 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.CRUDPageCreateCommand(req));
		}
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Rol_2008 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.RolCreateCommand(req));
		}
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entity_2009 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.EntityCreateCommand(req));
		}
		if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DataType_2010 == req.getElementType()) {
			return getGEFWrapper(new dataWebDeskDSL.diagram.edit.commands.DataTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
