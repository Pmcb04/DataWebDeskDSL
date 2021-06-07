/*
 * 
 */
package dataWebDeskDSL.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class DataWebDeskDSLModelingAssistantProviderOfWebSiteEditPart
		extends dataWebDeskDSL.diagram.providers.DataWebDeskDSLModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(10);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CreatePage_2011);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DetailPage_2012);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DeletePage_2013);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.IndexPage_2014);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.NormalPage_2015);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.MainPage_2016);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUDPage_2017);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Rol_2008);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entity_2009);
		types.add(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DataType_2010);
		return types;
	}

}
