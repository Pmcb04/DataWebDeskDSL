/*
* 
*/
package dataWebDeskDSL.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class DataWebDeskDSLDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getSemanticChildren(View view) {
		switch (dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {
		case dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			return getWebSite_1000SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageSocialMediasCompartmentEditPart.VISUAL_ID:
			return getCreatePageCreatePageSocialMediasCompartment_7023SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePagePagesexternalCompartmentEditPart.VISUAL_ID:
			return getCreatePageCreatePagePagesexternalCompartment_7024SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageMultimediasCompartmentEditPart.VISUAL_ID:
			return getCreatePageCreatePageMultimediasCompartment_7025SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageSocialMediasCompartmentEditPart.VISUAL_ID:
			return getDetailPageDetailPageSocialMediasCompartment_7026SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPagePagesexternalCompartmentEditPart.VISUAL_ID:
			return getDetailPageDetailPagePagesexternalCompartment_7027SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageMultimediasCompartmentEditPart.VISUAL_ID:
			return getDetailPageDetailPageMultimediasCompartment_7028SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageSocialMediasCompartmentEditPart.VISUAL_ID:
			return getDeletePageDeletePageSocialMediasCompartment_7029SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePagePagesexternalCompartmentEditPart.VISUAL_ID:
			return getDeletePageDeletePagePagesexternalCompartment_7030SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart.VISUAL_ID:
			return getDeletePageDeletePageMultimediasCompartment_7031SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageSocialMediasCompartmentEditPart.VISUAL_ID:
			return getIndexPageIndexPageSocialMediasCompartment_7032SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPagePagesexternalCompartmentEditPart.VISUAL_ID:
			return getIndexPageIndexPagePagesexternalCompartment_7033SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageMultimediasCompartmentEditPart.VISUAL_ID:
			return getIndexPageIndexPageMultimediasCompartment_7034SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageSocialMediasCompartmentEditPart.VISUAL_ID:
			return getNormalPageNormalPageSocialMediasCompartment_7035SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPagePagesexternalCompartmentEditPart.VISUAL_ID:
			return getNormalPageNormalPagePagesexternalCompartment_7036SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart.VISUAL_ID:
			return getNormalPageNormalPageMultimediasCompartment_7037SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.MainPageMainPageSocialMediasCompartmentEditPart.VISUAL_ID:
			return getMainPageMainPageSocialMediasCompartment_7038SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.MainPageMainPagePagesexternalCompartmentEditPart.VISUAL_ID:
			return getMainPageMainPagePagesexternalCompartment_7039SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.MainPageMainPageMultimediasCompartmentEditPart.VISUAL_ID:
			return getMainPageMainPageMultimediasCompartment_7040SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageSocialMediasCompartmentEditPart.VISUAL_ID:
			return getCRUDPageCRUDPageSocialMediasCompartment_7041SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPagePagesexternalCompartmentEditPart.VISUAL_ID:
			return getCRUDPageCRUDPagePagesexternalCompartment_7042SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageMultimediasCompartmentEditPart.VISUAL_ID:
			return getCRUDPageCRUDPageMultimediasCompartment_7043SemanticChildren(view);
		case dataWebDeskDSL.diagram.edit.parts.EntityEntityAttributesCompartmentEditPart.VISUAL_ID:
			return getEntityEntityAttributesCompartment_7022SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getWebSite_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.WebSite modelElement = (dataWebDeskDSL.WebSite) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPages().iterator(); it.hasNext();) {
			dataWebDeskDSL.Page childElement = (dataWebDeskDSL.Page) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getRoles().iterator(); it.hasNext();) {
			dataWebDeskDSL.Rol childElement = (dataWebDeskDSL.Rol) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getEntities().iterator(); it.hasNext();) {
			dataWebDeskDSL.Entity childElement = (dataWebDeskDSL.Entity) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDatatype().iterator(); it.hasNext();) {
			dataWebDeskDSL.DataType childElement = (dataWebDeskDSL.DataType) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getCreatePageCreatePageSocialMediasCompartment_7023SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.CreatePage modelElement = (dataWebDeskDSL.CreatePage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSocialMedias().iterator(); it.hasNext();) {
			dataWebDeskDSL.SocialMedia childElement = (dataWebDeskDSL.SocialMedia) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getCreatePageCreatePagePagesexternalCompartment_7024SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.CreatePage modelElement = (dataWebDeskDSL.CreatePage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPagesexternal().iterator(); it.hasNext();) {
			dataWebDeskDSL.PageExternal childElement = (dataWebDeskDSL.PageExternal) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getCreatePageCreatePageMultimediasCompartment_7025SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.CreatePage modelElement = (dataWebDeskDSL.CreatePage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMultimedias().iterator(); it.hasNext();) {
			dataWebDeskDSL.Multimedia childElement = (dataWebDeskDSL.Multimedia) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getDetailPageDetailPageSocialMediasCompartment_7026SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.DetailPage modelElement = (dataWebDeskDSL.DetailPage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSocialMedias().iterator(); it.hasNext();) {
			dataWebDeskDSL.SocialMedia childElement = (dataWebDeskDSL.SocialMedia) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getDetailPageDetailPagePagesexternalCompartment_7027SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.DetailPage modelElement = (dataWebDeskDSL.DetailPage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPagesexternal().iterator(); it.hasNext();) {
			dataWebDeskDSL.PageExternal childElement = (dataWebDeskDSL.PageExternal) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getDetailPageDetailPageMultimediasCompartment_7028SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.DetailPage modelElement = (dataWebDeskDSL.DetailPage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMultimedias().iterator(); it.hasNext();) {
			dataWebDeskDSL.Multimedia childElement = (dataWebDeskDSL.Multimedia) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getDeletePageDeletePageSocialMediasCompartment_7029SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.DeletePage modelElement = (dataWebDeskDSL.DeletePage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSocialMedias().iterator(); it.hasNext();) {
			dataWebDeskDSL.SocialMedia childElement = (dataWebDeskDSL.SocialMedia) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getDeletePageDeletePagePagesexternalCompartment_7030SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.DeletePage modelElement = (dataWebDeskDSL.DeletePage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPagesexternal().iterator(); it.hasNext();) {
			dataWebDeskDSL.PageExternal childElement = (dataWebDeskDSL.PageExternal) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getDeletePageDeletePageMultimediasCompartment_7031SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.DeletePage modelElement = (dataWebDeskDSL.DeletePage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMultimedias().iterator(); it.hasNext();) {
			dataWebDeskDSL.Multimedia childElement = (dataWebDeskDSL.Multimedia) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getIndexPageIndexPageSocialMediasCompartment_7032SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.IndexPage modelElement = (dataWebDeskDSL.IndexPage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSocialMedias().iterator(); it.hasNext();) {
			dataWebDeskDSL.SocialMedia childElement = (dataWebDeskDSL.SocialMedia) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getIndexPageIndexPagePagesexternalCompartment_7033SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.IndexPage modelElement = (dataWebDeskDSL.IndexPage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPagesexternal().iterator(); it.hasNext();) {
			dataWebDeskDSL.PageExternal childElement = (dataWebDeskDSL.PageExternal) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getIndexPageIndexPageMultimediasCompartment_7034SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.IndexPage modelElement = (dataWebDeskDSL.IndexPage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMultimedias().iterator(); it.hasNext();) {
			dataWebDeskDSL.Multimedia childElement = (dataWebDeskDSL.Multimedia) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getNormalPageNormalPageSocialMediasCompartment_7035SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.NormalPage modelElement = (dataWebDeskDSL.NormalPage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSocialMedias().iterator(); it.hasNext();) {
			dataWebDeskDSL.SocialMedia childElement = (dataWebDeskDSL.SocialMedia) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getNormalPageNormalPagePagesexternalCompartment_7036SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.NormalPage modelElement = (dataWebDeskDSL.NormalPage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPagesexternal().iterator(); it.hasNext();) {
			dataWebDeskDSL.PageExternal childElement = (dataWebDeskDSL.PageExternal) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getNormalPageNormalPageMultimediasCompartment_7037SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.NormalPage modelElement = (dataWebDeskDSL.NormalPage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMultimedias().iterator(); it.hasNext();) {
			dataWebDeskDSL.Multimedia childElement = (dataWebDeskDSL.Multimedia) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getMainPageMainPageSocialMediasCompartment_7038SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.MainPage modelElement = (dataWebDeskDSL.MainPage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSocialMedias().iterator(); it.hasNext();) {
			dataWebDeskDSL.SocialMedia childElement = (dataWebDeskDSL.SocialMedia) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getMainPageMainPagePagesexternalCompartment_7039SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.MainPage modelElement = (dataWebDeskDSL.MainPage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPagesexternal().iterator(); it.hasNext();) {
			dataWebDeskDSL.PageExternal childElement = (dataWebDeskDSL.PageExternal) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getMainPageMainPageMultimediasCompartment_7040SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.MainPage modelElement = (dataWebDeskDSL.MainPage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMultimedias().iterator(); it.hasNext();) {
			dataWebDeskDSL.Multimedia childElement = (dataWebDeskDSL.Multimedia) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getCRUDPageCRUDPageSocialMediasCompartment_7041SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.CRUDPage modelElement = (dataWebDeskDSL.CRUDPage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSocialMedias().iterator(); it.hasNext();) {
			dataWebDeskDSL.SocialMedia childElement = (dataWebDeskDSL.SocialMedia) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getCRUDPageCRUDPagePagesexternalCompartment_7042SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.CRUDPage modelElement = (dataWebDeskDSL.CRUDPage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getPagesexternal().iterator(); it.hasNext();) {
			dataWebDeskDSL.PageExternal childElement = (dataWebDeskDSL.PageExternal) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getCRUDPageCRUDPageMultimediasCompartment_7043SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.CRUDPage modelElement = (dataWebDeskDSL.CRUDPage) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getMultimedias().iterator(); it.hasNext();) {
			dataWebDeskDSL.Multimedia childElement = (dataWebDeskDSL.Multimedia) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getEntityEntityAttributesCompartment_7022SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		dataWebDeskDSL.Entity modelElement = (dataWebDeskDSL.Entity) containerView.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor>();
		for (Iterator<?> it = modelElement.getAttributes().iterator(); it.hasNext();) {
			dataWebDeskDSL.Attribute childElement = (dataWebDeskDSL.Attribute) it.next();
			int visualID = dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getContainedLinks(View view) {
		switch (dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {
		case dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			return getWebSite_1000ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID:
			return getCreatePage_2011ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID:
			return getDetailPage_2012ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID:
			return getDeletePage_2013ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID:
			return getIndexPage_2014ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID:
			return getNormalPage_2015ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID:
			return getMainPage_2016ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID:
			return getCRUDPage_2017ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2008ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID:
			return getEntity_2009ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart.VISUAL_ID:
			return getDataType_2010ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getText_3008ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return getVideo_3009ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID:
			return getAudio_3010ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3011ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID:
			return getSocialMedia_3012ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID:
			return getPageExternal_3013ContainedLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3007ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingLinks(View view) {
		switch (dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {
		case dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID:
			return getCreatePage_2011IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID:
			return getDetailPage_2012IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID:
			return getDeletePage_2013IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID:
			return getIndexPage_2014IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID:
			return getNormalPage_2015IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID:
			return getMainPage_2016IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID:
			return getCRUDPage_2017IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2008IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID:
			return getEntity_2009IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart.VISUAL_ID:
			return getDataType_2010IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getText_3008IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return getVideo_3009IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID:
			return getAudio_3010IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3011IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID:
			return getSocialMedia_3012IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID:
			return getPageExternal_3013IncomingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3007IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingLinks(View view) {
		switch (dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {
		case dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID:
			return getCreatePage_2011OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID:
			return getDetailPage_2012OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID:
			return getDeletePage_2013OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID:
			return getIndexPage_2014OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID:
			return getNormalPage_2015OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID:
			return getMainPage_2016OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID:
			return getCRUDPage_2017OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2008OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID:
			return getEntity_2009OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart.VISUAL_ID:
			return getDataType_2010OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getText_3008OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return getVideo_3009OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID:
			return getAudio_3010OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3011OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID:
			return getSocialMedia_3012OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID:
			return getPageExternal_3013OutgoingLinks(view);
		case dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3007OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getWebSite_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getCreatePage_2011ContainedLinks(
			View view) {
		dataWebDeskDSL.CreatePage modelElement = (dataWebDeskDSL.CreatePage) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getDetailPage_2012ContainedLinks(
			View view) {
		dataWebDeskDSL.DetailPage modelElement = (dataWebDeskDSL.DetailPage) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getDeletePage_2013ContainedLinks(
			View view) {
		dataWebDeskDSL.DeletePage modelElement = (dataWebDeskDSL.DeletePage) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIndexPage_2014ContainedLinks(
			View view) {
		dataWebDeskDSL.IndexPage modelElement = (dataWebDeskDSL.IndexPage) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getNormalPage_2015ContainedLinks(
			View view) {
		dataWebDeskDSL.NormalPage modelElement = (dataWebDeskDSL.NormalPage) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getMainPage_2016ContainedLinks(
			View view) {
		dataWebDeskDSL.MainPage modelElement = (dataWebDeskDSL.MainPage) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getCRUDPage_2017ContainedLinks(
			View view) {
		dataWebDeskDSL.CRUDPage modelElement = (dataWebDeskDSL.CRUDPage) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getRol_2008ContainedLinks(View view) {
		dataWebDeskDSL.Rol modelElement = (dataWebDeskDSL.Rol) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rol_Access_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getEntity_2009ContainedLinks(
			View view) {
		dataWebDeskDSL.Entity modelElement = (dataWebDeskDSL.Entity) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_EntitiesReferences_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_Primarykey_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_Crudpages_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getDataType_2010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getText_3008ContainedLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getVideo_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getAudio_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getImage_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getSocialMedia_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPageExternal_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getAttribute_3007ContainedLinks(
			View view) {
		dataWebDeskDSL.Attribute modelElement = (dataWebDeskDSL.Attribute) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Attribute_Type_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getCreatePage_2011IncomingLinks(
			View view) {
		dataWebDeskDSL.CreatePage modelElement = (dataWebDeskDSL.CreatePage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Access_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Entity_Crudpages_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getDetailPage_2012IncomingLinks(
			View view) {
		dataWebDeskDSL.DetailPage modelElement = (dataWebDeskDSL.DetailPage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Access_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Entity_Crudpages_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getDeletePage_2013IncomingLinks(
			View view) {
		dataWebDeskDSL.DeletePage modelElement = (dataWebDeskDSL.DeletePage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Access_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Entity_Crudpages_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIndexPage_2014IncomingLinks(
			View view) {
		dataWebDeskDSL.IndexPage modelElement = (dataWebDeskDSL.IndexPage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Access_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Entity_Crudpages_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getNormalPage_2015IncomingLinks(
			View view) {
		dataWebDeskDSL.NormalPage modelElement = (dataWebDeskDSL.NormalPage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Access_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getMainPage_2016IncomingLinks(
			View view) {
		dataWebDeskDSL.MainPage modelElement = (dataWebDeskDSL.MainPage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Access_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getCRUDPage_2017IncomingLinks(
			View view) {
		dataWebDeskDSL.CRUDPage modelElement = (dataWebDeskDSL.CRUDPage) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Rol_Access_4006(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Entity_Crudpages_4005(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getRol_2008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getEntity_2009IncomingLinks(
			View view) {
		dataWebDeskDSL.Entity modelElement = (dataWebDeskDSL.Entity) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entity_EntitiesReferences_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getDataType_2010IncomingLinks(
			View view) {
		dataWebDeskDSL.DataType modelElement = (dataWebDeskDSL.DataType) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Attribute_Type_4007(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getText_3008IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getVideo_3009IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getAudio_3010IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getImage_3011IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getSocialMedia_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPageExternal_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getAttribute_3007IncomingLinks(
			View view) {
		dataWebDeskDSL.Attribute modelElement = (dataWebDeskDSL.Attribute) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Entity_Primarykey_4004(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getCreatePage_2011OutgoingLinks(
			View view) {
		dataWebDeskDSL.CreatePage modelElement = (dataWebDeskDSL.CreatePage) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getDetailPage_2012OutgoingLinks(
			View view) {
		dataWebDeskDSL.DetailPage modelElement = (dataWebDeskDSL.DetailPage) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getDeletePage_2013OutgoingLinks(
			View view) {
		dataWebDeskDSL.DeletePage modelElement = (dataWebDeskDSL.DeletePage) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIndexPage_2014OutgoingLinks(
			View view) {
		dataWebDeskDSL.IndexPage modelElement = (dataWebDeskDSL.IndexPage) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getNormalPage_2015OutgoingLinks(
			View view) {
		dataWebDeskDSL.NormalPage modelElement = (dataWebDeskDSL.NormalPage) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getMainPage_2016OutgoingLinks(
			View view) {
		dataWebDeskDSL.MainPage modelElement = (dataWebDeskDSL.MainPage) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getCRUDPage_2017OutgoingLinks(
			View view) {
		dataWebDeskDSL.CRUDPage modelElement = (dataWebDeskDSL.CRUDPage) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Page_PagesReferences_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getRol_2008OutgoingLinks(View view) {
		dataWebDeskDSL.Rol modelElement = (dataWebDeskDSL.Rol) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Rol_Access_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getEntity_2009OutgoingLinks(
			View view) {
		dataWebDeskDSL.Entity modelElement = (dataWebDeskDSL.Entity) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_EntitiesReferences_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_Primarykey_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Entity_Crudpages_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getDataType_2010OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getText_3008OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getVideo_3009OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getAudio_3010OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getImage_3011OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getSocialMedia_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getPageExternal_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getAttribute_3007OutgoingLinks(
			View view) {
		dataWebDeskDSL.Attribute modelElement = (dataWebDeskDSL.Attribute) view.getElement();
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Attribute_Type_4007(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingFeatureModelFacetLinks_Rol_Access_4006(
			dataWebDeskDSL.Page target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getRol_Access()) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(setting.getEObject(), target,
						dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolAccess_4006,
						dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingFeatureModelFacetLinks_Page_PagesReferences_4001(
			dataWebDeskDSL.Page target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE
					.getPage_PagesReferences()) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(setting.getEObject(), target,
						dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001,
						dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingFeatureModelFacetLinks_Entity_EntitiesReferences_4003(
			dataWebDeskDSL.Entity target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE
					.getEntity_EntitiesReferences()) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(setting.getEObject(), target,
						dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityEntitiesReferences_4003,
						dataWebDeskDSL.diagram.edit.parts.EntityEntitiesReferencesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingFeatureModelFacetLinks_Entity_Primarykey_4004(
			dataWebDeskDSL.Attribute target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE
					.getEntity_Primarykey()) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(setting.getEObject(), target,
						dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityPrimarykey_4004,
						dataWebDeskDSL.diagram.edit.parts.EntityPrimarykeyEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingFeatureModelFacetLinks_Entity_Crudpages_4005(
			dataWebDeskDSL.CRUDPage target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE
					.getEntity_Crudpages()) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(setting.getEObject(), target,
						dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityCrudpages_4005,
						dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingFeatureModelFacetLinks_Attribute_Type_4007(
			dataWebDeskDSL.DataType target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getAttribute_Type()) {
				result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(setting.getEObject(), target,
						dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.AttributeType_4007,
						dataWebDeskDSL.diagram.edit.parts.AttributeTypeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Rol_Access_4006(
			dataWebDeskDSL.Rol source) {
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		for (Iterator<?> destinations = source.getAccess().iterator(); destinations.hasNext();) {
			dataWebDeskDSL.Page destination = (dataWebDeskDSL.Page) destinations.next();
			result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(source, destination,
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolAccess_4006,
					dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Page_PagesReferences_4001(
			dataWebDeskDSL.Page source) {
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		for (Iterator<?> destinations = source.getPagesReferences().iterator(); destinations.hasNext();) {
			dataWebDeskDSL.Page destination = (dataWebDeskDSL.Page) destinations.next();
			result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(source, destination,
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001,
					dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entity_EntitiesReferences_4003(
			dataWebDeskDSL.Entity source) {
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		for (Iterator<?> destinations = source.getEntitiesReferences().iterator(); destinations.hasNext();) {
			dataWebDeskDSL.Entity destination = (dataWebDeskDSL.Entity) destinations.next();
			result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(source, destination,
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityEntitiesReferences_4003,
					dataWebDeskDSL.diagram.edit.parts.EntityEntitiesReferencesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entity_Primarykey_4004(
			dataWebDeskDSL.Entity source) {
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		dataWebDeskDSL.Attribute destination = source.getPrimarykey();
		if (destination == null) {
			return result;
		}
		result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(source, destination,
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityPrimarykey_4004,
				dataWebDeskDSL.diagram.edit.parts.EntityPrimarykeyEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Entity_Crudpages_4005(
			dataWebDeskDSL.Entity source) {
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		for (Iterator<?> destinations = source.getCrudpages().iterator(); destinations.hasNext();) {
			dataWebDeskDSL.CRUDPage destination = (dataWebDeskDSL.CRUDPage) destinations.next();
			result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(source, destination,
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityCrudpages_4005,
					dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingFeatureModelFacetLinks_Attribute_Type_4007(
			dataWebDeskDSL.Attribute source) {
		LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> result = new LinkedList<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor>();
		dataWebDeskDSL.DataType destination = source.getType();
		if (destination == null) {
			return result;
		}
		result.add(new dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor(source, destination,
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.AttributeType_4007,
				dataWebDeskDSL.diagram.edit.parts.AttributeTypeEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<dataWebDeskDSL.diagram.part.DataWebDeskDSLNodeDescriptor> getSemanticChildren(View view) {
			return DataWebDeskDSLDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getContainedLinks(View view) {
			return DataWebDeskDSLDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getIncomingLinks(View view) {
			return DataWebDeskDSLDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<dataWebDeskDSL.diagram.part.DataWebDeskDSLLinkDescriptor> getOutgoingLinks(View view) {
			return DataWebDeskDSLDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
