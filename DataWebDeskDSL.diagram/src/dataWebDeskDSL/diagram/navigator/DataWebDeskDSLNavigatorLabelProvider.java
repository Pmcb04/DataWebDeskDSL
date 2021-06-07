/*
* 
*/
package dataWebDeskDSL.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class DataWebDeskDSLNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem
				&& !isOwnView(((dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup) {
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup group = (dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup) element;
			return dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) {
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem navigatorItem = (dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {
		case dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://www.example.org/dataWebDeskDSL?WebSite", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.WebSite_1000);
		case dataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataWebDeskDSL?Rol", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Rol_2008);
		case dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataWebDeskDSL?Entity", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entity_2009);
		case dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataWebDeskDSL?DataType", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DataType_2010);
		case dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataWebDeskDSL?CreatePage", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CreatePage_2011);
		case dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataWebDeskDSL?DetailPage", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DetailPage_2012);
		case dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataWebDeskDSL?DeletePage", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DeletePage_2013);
		case dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataWebDeskDSL?IndexPage", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.IndexPage_2014);
		case dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataWebDeskDSL?NormalPage", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.NormalPage_2015);
		case dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataWebDeskDSL?MainPage", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.MainPage_2016);
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://www.example.org/dataWebDeskDSL?CRUDPage", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUDPage_2017);
		case dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dataWebDeskDSL?Attribute", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Attribute_3007);
		case dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dataWebDeskDSL?Text", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Text_3008);
		case dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dataWebDeskDSL?Video", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Video_3009);
		case dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dataWebDeskDSL?Audio", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Audio_3010);
		case dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dataWebDeskDSL?Image", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Image_3011);
		case dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dataWebDeskDSL?SocialMedia", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.SocialMedia_3012);
		case dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://www.example.org/dataWebDeskDSL?PageExternal", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PageExternal_3013);
		case dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dataWebDeskDSL?Page?pagesReferences", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001);
		case dataWebDeskDSL.diagram.edit.parts.EntityEntitiesReferencesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dataWebDeskDSL?Entity?entitiesReferences", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityEntitiesReferences_4003);
		case dataWebDeskDSL.diagram.edit.parts.EntityPrimarykeyEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dataWebDeskDSL?Entity?primarykey", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityPrimarykey_4004);
		case dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dataWebDeskDSL?Entity?crudpages", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityCrudpages_4005);
		case dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dataWebDeskDSL?Rol?access", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolAccess_4006);
		case dataWebDeskDSL.diagram.edit.parts.AttributeTypeEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://www.example.org/dataWebDeskDSL?Attribute?type", //$NON-NLS-1$
					dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.AttributeType_4007);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.isKnownElementType(elementType)) {
			image = dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup) {
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup group = (dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) {
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem navigatorItem = (dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {
		case dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			return getWebSite_1000Text(view);
		case dataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return getRol_2008Text(view);
		case dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID:
			return getEntity_2009Text(view);
		case dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart.VISUAL_ID:
			return getDataType_2010Text(view);
		case dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID:
			return getCreatePage_2011Text(view);
		case dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID:
			return getDetailPage_2012Text(view);
		case dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID:
			return getDeletePage_2013Text(view);
		case dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID:
			return getIndexPage_2014Text(view);
		case dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID:
			return getNormalPage_2015Text(view);
		case dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID:
			return getMainPage_2016Text(view);
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID:
			return getCRUDPage_2017Text(view);
		case dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return getAttribute_3007Text(view);
		case dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return getText_3008Text(view);
		case dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return getVideo_3009Text(view);
		case dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID:
			return getAudio_3010Text(view);
		case dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return getImage_3011Text(view);
		case dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID:
			return getSocialMedia_3012Text(view);
		case dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID:
			return getPageExternal_3013Text(view);
		case dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID:
			return getPagePagesReferences_4001Text(view);
		case dataWebDeskDSL.diagram.edit.parts.EntityEntitiesReferencesEditPart.VISUAL_ID:
			return getEntityEntitiesReferences_4003Text(view);
		case dataWebDeskDSL.diagram.edit.parts.EntityPrimarykeyEditPart.VISUAL_ID:
			return getEntityPrimarykey_4004Text(view);
		case dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart.VISUAL_ID:
			return getEntityCrudpages_4005Text(view);
		case dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID:
			return getRolAccess_4006Text(view);
		case dataWebDeskDSL.diagram.edit.parts.AttributeTypeEditPart.VISUAL_ID:
			return getAttributeType_4007Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getWebSite_1000Text(View view) {
		dataWebDeskDSL.WebSite domainModelElement = (dataWebDeskDSL.WebSite) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRol_2008Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Rol_2008,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.RolNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntity_2009Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entity_2009,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.EntityNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDataType_2010Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DataType_2010,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.DataTypeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCreatePage_2011Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CreatePage_2011,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.CreatePageTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDetailPage_2012Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DetailPage_2012,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.DetailPageTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDeletePage_2013Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DeletePage_2013,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.DeletePageTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getIndexPage_2014Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.IndexPage_2014,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.IndexPageTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getNormalPage_2015Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.NormalPage_2015,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.NormalPageTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMainPage_2016Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.MainPage_2016,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.MainPageTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getCRUDPage_2017Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUDPage_2017,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.CRUDPageTitleEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAttribute_3007Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Attribute_3007,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.AttributeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getText_3008Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Text_3008,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.TextNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVideo_3009Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Video_3009,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.VideoNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAudio_3010Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Audio_3010,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.AudioNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getImage_3011Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Image_3011,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.ImageNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getSocialMedia_3012Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.SocialMedia_3012,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.SocialMediaNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPageExternal_3013Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PageExternal_3013,
				view.getElement() != null ? view.getElement() : view,
				dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
						.getType(dataWebDeskDSL.diagram.edit.parts.PageExternalNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getPagePagesReferences_4001Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntityEntitiesReferences_4003Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityEntitiesReferences_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntityPrimarykey_4004Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityPrimarykey_4004,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getEntityCrudpages_4005Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityCrudpages_4005,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getRolAccess_4006Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolAccess_4006,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getAttributeType_4007Text(View view) {
		IParser parser = dataWebDeskDSL.diagram.providers.DataWebDeskDSLParserProvider.getParser(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.AttributeType_4007,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.MODEL_ID
				.equals(dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getModelID(view));
	}

}
