/*
 * 
 */
package dataWebDeskDSL.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class DataWebDeskDSLEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {

			case dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.CreatePageTitleEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.CreatePageTitleEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.DetailPageTitleEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.DetailPageTitleEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.DeletePageTitleEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.DeletePageTitleEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.IndexPageTitleEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.IndexPageTitleEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.NormalPageTitleEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.NormalPageTitleEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.MainPageEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.MainPageTitleEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.MainPageTitleEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.CRUDPageTitleEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.CRUDPageTitleEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.RolEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.RolNameEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.RolNameEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.EntityEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.EntityNameEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.EntityNameEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.DataTypeNameEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.DataTypeNameEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.TextEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.TextNameEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.TextNameEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.VideoEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.VideoNameEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.VideoNameEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.AudioEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.AudioNameEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.AudioNameEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.ImageEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.ImageNameEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.ImageNameEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.SocialMediaNameEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.SocialMediaNameEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.PageExternalNameEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.PageExternalNameEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.AttributeEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.AttributeNameEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.AttributeNameEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageSocialMediasCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageSocialMediasCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePagePagesexternalCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePagePagesexternalCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageMultimediasCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageMultimediasCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageSocialMediasCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageSocialMediasCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPagePagesexternalCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPagePagesexternalCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageMultimediasCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageMultimediasCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageSocialMediasCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageSocialMediasCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePagePagesexternalCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePagePagesexternalCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageSocialMediasCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageSocialMediasCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPagePagesexternalCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPagePagesexternalCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageMultimediasCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageMultimediasCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageSocialMediasCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageSocialMediasCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPagePagesexternalCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPagePagesexternalCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.MainPageMainPageSocialMediasCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.MainPageMainPageSocialMediasCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.MainPageMainPagePagesexternalCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.MainPageMainPagePagesexternalCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.MainPageMainPageMultimediasCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.MainPageMainPageMultimediasCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageSocialMediasCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageSocialMediasCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPagePagesexternalCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPagePagesexternalCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageMultimediasCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageMultimediasCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.EntityEntityAttributesCompartmentEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.EntityEntityAttributesCompartmentEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.WrappingLabelEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.WrappingLabel2EditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.EntityEntitiesReferencesEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.EntityEntitiesReferencesEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.WrappingLabel3EditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.EntityPrimarykeyEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.EntityPrimarykeyEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.WrappingLabel4EditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.WrappingLabel5EditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.AttributeTypeEditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.AttributeTypeEditPart(view);

			case dataWebDeskDSL.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID:
				return new dataWebDeskDSL.diagram.edit.parts.WrappingLabel6EditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
