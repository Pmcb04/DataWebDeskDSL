/*
 * 
 */
package dataWebDeskDSL.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class DataWebDeskDSLElementTypes {

	/**
	* @generated
	*/
	private DataWebDeskDSLElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType WebSite_1000 = getElementType("DataWebDeskDSL.diagram.WebSite_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CreatePage_2011 = getElementType("DataWebDeskDSL.diagram.CreatePage_2011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DetailPage_2012 = getElementType("DataWebDeskDSL.diagram.DetailPage_2012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DeletePage_2013 = getElementType("DataWebDeskDSL.diagram.DeletePage_2013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType IndexPage_2014 = getElementType("DataWebDeskDSL.diagram.IndexPage_2014"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType NormalPage_2015 = getElementType("DataWebDeskDSL.diagram.NormalPage_2015"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MainPage_2016 = getElementType("DataWebDeskDSL.diagram.MainPage_2016"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType CRUDPage_2017 = getElementType("DataWebDeskDSL.diagram.CRUDPage_2017"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Rol_2008 = getElementType("DataWebDeskDSL.diagram.Rol_2008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Entity_2009 = getElementType("DataWebDeskDSL.diagram.Entity_2009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType DataType_2010 = getElementType("DataWebDeskDSL.diagram.DataType_2010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Text_3008 = getElementType("DataWebDeskDSL.diagram.Text_3008"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Video_3009 = getElementType("DataWebDeskDSL.diagram.Video_3009"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Audio_3010 = getElementType("DataWebDeskDSL.diagram.Audio_3010"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Image_3011 = getElementType("DataWebDeskDSL.diagram.Image_3011"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType SocialMedia_3012 = getElementType("DataWebDeskDSL.diagram.SocialMedia_3012"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PageExternal_3013 = getElementType("DataWebDeskDSL.diagram.PageExternal_3013"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Attribute_3007 = getElementType("DataWebDeskDSL.diagram.Attribute_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType RolAccess_4006 = getElementType("DataWebDeskDSL.diagram.RolAccess_4006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType PagePagesReferences_4001 = getElementType(
			"DataWebDeskDSL.diagram.PagePagesReferences_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EntityEntitiesReferences_4003 = getElementType(
			"DataWebDeskDSL.diagram.EntityEntitiesReferences_4003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EntityPrimarykey_4004 = getElementType(
			"DataWebDeskDSL.diagram.EntityPrimarykey_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType EntityCrudpages_4005 = getElementType(
			"DataWebDeskDSL.diagram.EntityCrudpages_4005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType AttributeType_4007 = getElementType("DataWebDeskDSL.diagram.AttributeType_4007"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(WebSite_1000, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getWebSite());

			elements.put(CreatePage_2011, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getCreatePage());

			elements.put(DetailPage_2012, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getDetailPage());

			elements.put(DeletePage_2013, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getDeletePage());

			elements.put(IndexPage_2014, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getIndexPage());

			elements.put(NormalPage_2015, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getNormalPage());

			elements.put(MainPage_2016, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getMainPage());

			elements.put(CRUDPage_2017, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getCRUDPage());

			elements.put(Rol_2008, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getRol());

			elements.put(Entity_2009, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getEntity());

			elements.put(DataType_2010, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getDataType());

			elements.put(Text_3008, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getText());

			elements.put(Video_3009, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getVideo());

			elements.put(Audio_3010, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getAudio());

			elements.put(Image_3011, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getImage());

			elements.put(SocialMedia_3012, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getSocialMedia());

			elements.put(PageExternal_3013, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPageExternal());

			elements.put(Attribute_3007, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getAttribute());

			elements.put(RolAccess_4006, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getRol_Access());

			elements.put(PagePagesReferences_4001,
					dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPage_PagesReferences());

			elements.put(EntityEntitiesReferences_4003,
					dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getEntity_EntitiesReferences());

			elements.put(EntityPrimarykey_4004, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getEntity_Primarykey());

			elements.put(EntityCrudpages_4005, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getEntity_Crudpages());

			elements.put(AttributeType_4007, dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getAttribute_Type());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(WebSite_1000);
			KNOWN_ELEMENT_TYPES.add(CreatePage_2011);
			KNOWN_ELEMENT_TYPES.add(DetailPage_2012);
			KNOWN_ELEMENT_TYPES.add(DeletePage_2013);
			KNOWN_ELEMENT_TYPES.add(IndexPage_2014);
			KNOWN_ELEMENT_TYPES.add(NormalPage_2015);
			KNOWN_ELEMENT_TYPES.add(MainPage_2016);
			KNOWN_ELEMENT_TYPES.add(CRUDPage_2017);
			KNOWN_ELEMENT_TYPES.add(Rol_2008);
			KNOWN_ELEMENT_TYPES.add(Entity_2009);
			KNOWN_ELEMENT_TYPES.add(DataType_2010);
			KNOWN_ELEMENT_TYPES.add(Text_3008);
			KNOWN_ELEMENT_TYPES.add(Video_3009);
			KNOWN_ELEMENT_TYPES.add(Audio_3010);
			KNOWN_ELEMENT_TYPES.add(Image_3011);
			KNOWN_ELEMENT_TYPES.add(SocialMedia_3012);
			KNOWN_ELEMENT_TYPES.add(PageExternal_3013);
			KNOWN_ELEMENT_TYPES.add(Attribute_3007);
			KNOWN_ELEMENT_TYPES.add(RolAccess_4006);
			KNOWN_ELEMENT_TYPES.add(PagePagesReferences_4001);
			KNOWN_ELEMENT_TYPES.add(EntityEntitiesReferences_4003);
			KNOWN_ELEMENT_TYPES.add(EntityPrimarykey_4004);
			KNOWN_ELEMENT_TYPES.add(EntityCrudpages_4005);
			KNOWN_ELEMENT_TYPES.add(AttributeType_4007);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.VISUAL_ID:
			return WebSite_1000;
		case dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID:
			return CreatePage_2011;
		case dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID:
			return DetailPage_2012;
		case dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID:
			return DeletePage_2013;
		case dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID:
			return IndexPage_2014;
		case dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID:
			return NormalPage_2015;
		case dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID:
			return MainPage_2016;
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID:
			return CRUDPage_2017;
		case dataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID:
			return Rol_2008;
		case dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID:
			return Entity_2009;
		case dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart.VISUAL_ID:
			return DataType_2010;
		case dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID:
			return Text_3008;
		case dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID:
			return Video_3009;
		case dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID:
			return Audio_3010;
		case dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID:
			return Image_3011;
		case dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID:
			return SocialMedia_3012;
		case dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID:
			return PageExternal_3013;
		case dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID:
			return Attribute_3007;
		case dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID:
			return RolAccess_4006;
		case dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID:
			return PagePagesReferences_4001;
		case dataWebDeskDSL.diagram.edit.parts.EntityEntitiesReferencesEditPart.VISUAL_ID:
			return EntityEntitiesReferences_4003;
		case dataWebDeskDSL.diagram.edit.parts.EntityPrimarykeyEditPart.VISUAL_ID:
			return EntityPrimarykey_4004;
		case dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart.VISUAL_ID:
			return EntityCrudpages_4005;
		case dataWebDeskDSL.diagram.edit.parts.AttributeTypeEditPart.VISUAL_ID:
			return AttributeType_4007;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.getElement(elementTypeAdapter);
		}
	};

}
