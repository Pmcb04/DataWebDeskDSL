/*
* 
*/
package dataWebDeskDSL.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class DataWebDeskDSLVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "DataWebDeskDSL.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.MODEL_ID.equals(view.getType())) {
				return dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getWebSite().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((dataWebDeskDSL.WebSite) domainElement)) {
			return dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getModelID(containerView);
		if (!dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.MODEL_ID.equals(containerModelID)
				&& !"dataWebDeskDSL".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getCreatePage().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getDetailPage().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getDeletePage().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getIndexPage().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getNormalPage().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getMainPage().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getCRUDPage().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getRol().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getEntity().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getDataType().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageSocialMediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getSocialMedia().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePagePagesexternalCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPageExternal()
					.isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageMultimediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getVideo().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getAudio().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getImage().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageSocialMediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getSocialMedia().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPagePagesexternalCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPageExternal()
					.isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageMultimediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getVideo().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getAudio().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getImage().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageSocialMediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getSocialMedia().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePagePagesexternalCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPageExternal()
					.isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getVideo().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getAudio().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getImage().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageSocialMediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getSocialMedia().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPagePagesexternalCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPageExternal()
					.isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageMultimediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getVideo().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getAudio().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getImage().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageSocialMediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getSocialMedia().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPagePagesexternalCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPageExternal()
					.isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getVideo().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getAudio().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getImage().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.MainPageMainPageSocialMediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getSocialMedia().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.MainPageMainPagePagesexternalCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPageExternal()
					.isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.MainPageMainPageMultimediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getVideo().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getAudio().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getImage().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageSocialMediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getSocialMedia().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPagePagesexternalCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPageExternal()
					.isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageMultimediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getText().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getVideo().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getAudio().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID;
			}
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getImage().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.EntityEntityAttributesCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getAttribute().isSuperTypeOf(domainElement.eClass())) {
				return dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getModelID(containerView);
		if (!dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.MODEL_ID.equals(containerModelID)
				&& !"dataWebDeskDSL".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.CreatePageTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageSocialMediasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePagePagesexternalCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageMultimediasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.DetailPageTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageSocialMediasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPagePagesexternalCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageMultimediasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.DeletePageTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageSocialMediasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePagePagesexternalCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.IndexPageTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageSocialMediasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPagePagesexternalCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageMultimediasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.NormalPageTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageSocialMediasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPagePagesexternalCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.MainPageTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.MainPageMainPageSocialMediasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.MainPageMainPagePagesexternalCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.MainPageMainPageMultimediasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.CRUDPageTitleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageSocialMediasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPagePagesexternalCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageMultimediasCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.RolNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.EntityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.EntityEntityAttributesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.DataTypeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.TextNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.VideoNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.AudioNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.ImageNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.SocialMediaNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.PageExternalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.AttributeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageSocialMediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePagePagesexternalCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageMultimediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageSocialMediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPagePagesexternalCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageMultimediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageSocialMediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePagePagesexternalCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageSocialMediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPagePagesexternalCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageMultimediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageSocialMediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPagePagesexternalCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.MainPageMainPageSocialMediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.MainPageMainPagePagesexternalCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.MainPageMainPageMultimediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageSocialMediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPagePagesexternalCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageMultimediasCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.EntityEntityAttributesCompartmentEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.EntityEntitiesReferencesEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.EntityPrimarykeyEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.WrappingLabel4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.WrappingLabel5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case dataWebDeskDSL.diagram.edit.parts.AttributeTypeEditPart.VISUAL_ID:
			if (dataWebDeskDSL.diagram.edit.parts.WrappingLabel6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(dataWebDeskDSL.WebSite element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageSocialMediasCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePagePagesexternalCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageMultimediasCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageSocialMediasCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPagePagesexternalCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageMultimediasCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageSocialMediasCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePagePagesexternalCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageSocialMediasCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPagePagesexternalCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageMultimediasCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageSocialMediasCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPagePagesexternalCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.MainPageMainPageSocialMediasCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.MainPageMainPagePagesexternalCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.MainPageMainPageMultimediasCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageSocialMediasCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPagePagesexternalCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageMultimediasCompartmentEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.EntityEntityAttributesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			return false;
		case dataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID:
		case dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
