/*
 * 
 */
package dataWebDeskDSL.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.parsers.EnumParser;

/**
 * @generated
 */
public class DataWebDeskDSLParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser createPageTitle_5024Parser;

	/**
	* @generated
	*/
	private IParser getCreatePageTitle_5024Parser() {
		if (createPageTitle_5024Parser == null) {
			EAttribute[] features = new EAttribute[] { dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPage_Title() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			createPageTitle_5024Parser = parser;
		}
		return createPageTitle_5024Parser;
	}

	/**
	* @generated
	*/
	private IParser detailPageTitle_5025Parser;

	/**
	* @generated
	*/
	private IParser getDetailPageTitle_5025Parser() {
		if (detailPageTitle_5025Parser == null) {
			EAttribute[] features = new EAttribute[] { dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPage_Title() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			detailPageTitle_5025Parser = parser;
		}
		return detailPageTitle_5025Parser;
	}

	/**
	* @generated
	*/
	private IParser deletePageTitle_5026Parser;

	/**
	* @generated
	*/
	private IParser getDeletePageTitle_5026Parser() {
		if (deletePageTitle_5026Parser == null) {
			EAttribute[] features = new EAttribute[] { dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPage_Title() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			deletePageTitle_5026Parser = parser;
		}
		return deletePageTitle_5026Parser;
	}

	/**
	* @generated
	*/
	private IParser indexPageTitle_5027Parser;

	/**
	* @generated
	*/
	private IParser getIndexPageTitle_5027Parser() {
		if (indexPageTitle_5027Parser == null) {
			EAttribute[] features = new EAttribute[] { dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPage_Title() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			indexPageTitle_5027Parser = parser;
		}
		return indexPageTitle_5027Parser;
	}

	/**
	* @generated
	*/
	private IParser normalPageTitle_5028Parser;

	/**
	* @generated
	*/
	private IParser getNormalPageTitle_5028Parser() {
		if (normalPageTitle_5028Parser == null) {
			EAttribute[] features = new EAttribute[] { dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPage_Title() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			normalPageTitle_5028Parser = parser;
		}
		return normalPageTitle_5028Parser;
	}

	/**
	* @generated
	*/
	private IParser mainPageTitle_5029Parser;

	/**
	* @generated
	*/
	private IParser getMainPageTitle_5029Parser() {
		if (mainPageTitle_5029Parser == null) {
			EAttribute[] features = new EAttribute[] { dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPage_Title() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			mainPageTitle_5029Parser = parser;
		}
		return mainPageTitle_5029Parser;
	}

	/**
	* @generated
	*/
	private IParser cRUDPageTitle_5030Parser;

	/**
	* @generated
	*/
	private IParser getCRUDPageTitle_5030Parser() {
		if (cRUDPageTitle_5030Parser == null) {
			EAttribute[] features = new EAttribute[] { dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPage_Title() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			cRUDPageTitle_5030Parser = parser;
		}
		return cRUDPageTitle_5030Parser;
	}

	/**
	* @generated
	*/
	private IParser rolName_5008Parser;

	/**
	* @generated
	*/
	private IParser getRolName_5008Parser() {
		if (rolName_5008Parser == null) {
			EAttribute[] features = new EAttribute[] { dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getRol_Name() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			rolName_5008Parser = parser;
		}
		return rolName_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser entityName_5009Parser;

	/**
	* @generated
	*/
	private IParser getEntityName_5009Parser() {
		if (entityName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getEntity_Name() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			entityName_5009Parser = parser;
		}
		return entityName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser dataTypeName_5010Parser;

	/**
	* @generated
	*/
	private IParser getDataTypeName_5010Parser() {
		if (dataTypeName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] {
					dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getDataType_Name() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			dataTypeName_5010Parser = parser;
		}
		return dataTypeName_5010Parser;
	}

	/**
	* @generated
	*/
	private IParser textName_5018Parser;

	/**
	* @generated
	*/
	private IParser getTextName_5018Parser() {
		if (textName_5018Parser == null) {
			EAttribute[] features = new EAttribute[] {
					dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getMultimedia_Name() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			textName_5018Parser = parser;
		}
		return textName_5018Parser;
	}

	/**
	* @generated
	*/
	private IParser videoName_5019Parser;

	/**
	* @generated
	*/
	private IParser getVideoName_5019Parser() {
		if (videoName_5019Parser == null) {
			EAttribute[] features = new EAttribute[] {
					dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getMultimedia_Name() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			videoName_5019Parser = parser;
		}
		return videoName_5019Parser;
	}

	/**
	* @generated
	*/
	private IParser audioName_5020Parser;

	/**
	* @generated
	*/
	private IParser getAudioName_5020Parser() {
		if (audioName_5020Parser == null) {
			EAttribute[] features = new EAttribute[] {
					dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getMultimedia_Name() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			audioName_5020Parser = parser;
		}
		return audioName_5020Parser;
	}

	/**
	* @generated
	*/
	private IParser imageName_5021Parser;

	/**
	* @generated
	*/
	private IParser getImageName_5021Parser() {
		if (imageName_5021Parser == null) {
			EAttribute[] features = new EAttribute[] {
					dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getMultimedia_Name() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			imageName_5021Parser = parser;
		}
		return imageName_5021Parser;
	}

	/**
	* @generated
	*/
	private IParser socialMediaName_5022Parser;

	/**
	* @generated
	*/
	private IParser getSocialMediaName_5022Parser() {
		if (socialMediaName_5022Parser == null) {
			EAttribute editableFeature = dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getSocialMedia_Name();
			EnumParser parser = new EnumParser(editableFeature);
			socialMediaName_5022Parser = parser;
		}
		return socialMediaName_5022Parser;
	}

	/**
	* @generated
	*/
	private IParser pageExternalName_5023Parser;

	/**
	* @generated
	*/
	private IParser getPageExternalName_5023Parser() {
		if (pageExternalName_5023Parser == null) {
			EAttribute[] features = new EAttribute[] {
					dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getPageExternal_Name() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			pageExternalName_5023Parser = parser;
		}
		return pageExternalName_5023Parser;
	}

	/**
	* @generated
	*/
	private IParser attributeName_5017Parser;

	/**
	* @generated
	*/
	private IParser getAttributeName_5017Parser() {
		if (attributeName_5017Parser == null) {
			EAttribute[] features = new EAttribute[] {
					dataWebDeskDSL.DataWebDeskDSLPackage.eINSTANCE.getAttribute_Name() };
			dataWebDeskDSL.diagram.parsers.MessageFormatParser parser = new dataWebDeskDSL.diagram.parsers.MessageFormatParser(
					features);
			attributeName_5017Parser = parser;
		}
		return attributeName_5017Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case dataWebDeskDSL.diagram.edit.parts.CreatePageTitleEditPart.VISUAL_ID:
			return getCreatePageTitle_5024Parser();
		case dataWebDeskDSL.diagram.edit.parts.DetailPageTitleEditPart.VISUAL_ID:
			return getDetailPageTitle_5025Parser();
		case dataWebDeskDSL.diagram.edit.parts.DeletePageTitleEditPart.VISUAL_ID:
			return getDeletePageTitle_5026Parser();
		case dataWebDeskDSL.diagram.edit.parts.IndexPageTitleEditPart.VISUAL_ID:
			return getIndexPageTitle_5027Parser();
		case dataWebDeskDSL.diagram.edit.parts.NormalPageTitleEditPart.VISUAL_ID:
			return getNormalPageTitle_5028Parser();
		case dataWebDeskDSL.diagram.edit.parts.MainPageTitleEditPart.VISUAL_ID:
			return getMainPageTitle_5029Parser();
		case dataWebDeskDSL.diagram.edit.parts.CRUDPageTitleEditPart.VISUAL_ID:
			return getCRUDPageTitle_5030Parser();
		case dataWebDeskDSL.diagram.edit.parts.RolNameEditPart.VISUAL_ID:
			return getRolName_5008Parser();
		case dataWebDeskDSL.diagram.edit.parts.EntityNameEditPart.VISUAL_ID:
			return getEntityName_5009Parser();
		case dataWebDeskDSL.diagram.edit.parts.DataTypeNameEditPart.VISUAL_ID:
			return getDataTypeName_5010Parser();
		case dataWebDeskDSL.diagram.edit.parts.TextNameEditPart.VISUAL_ID:
			return getTextName_5018Parser();
		case dataWebDeskDSL.diagram.edit.parts.VideoNameEditPart.VISUAL_ID:
			return getVideoName_5019Parser();
		case dataWebDeskDSL.diagram.edit.parts.AudioNameEditPart.VISUAL_ID:
			return getAudioName_5020Parser();
		case dataWebDeskDSL.diagram.edit.parts.ImageNameEditPart.VISUAL_ID:
			return getImageName_5021Parser();

		case dataWebDeskDSL.diagram.edit.parts.SocialMediaNameEditPart.VISUAL_ID:
			return getSocialMediaName_5022Parser();
		case dataWebDeskDSL.diagram.edit.parts.PageExternalNameEditPart.VISUAL_ID:
			return getPageExternalName_5023Parser();
		case dataWebDeskDSL.diagram.edit.parts.AttributeNameEditPart.VISUAL_ID:
			return getAttributeName_5017Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
