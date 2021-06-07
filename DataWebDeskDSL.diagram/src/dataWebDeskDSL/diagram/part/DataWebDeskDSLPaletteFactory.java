
/*
 * 
 */
package dataWebDeskDSL.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class DataWebDeskDSLPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(dataWebDeskDSL.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createAttribute1CreationTool());
		paletteContainer.add(createAudio2CreationTool());
		paletteContainer.add(createCRUDPage3CreationTool());
		paletteContainer.add(createCreatePage4CreationTool());
		paletteContainer.add(createDataType5CreationTool());
		paletteContainer.add(createDeletePage6CreationTool());
		paletteContainer.add(createDetailPage7CreationTool());
		paletteContainer.add(createEntity8CreationTool());
		paletteContainer.add(createImage9CreationTool());
		paletteContainer.add(createIndexPage10CreationTool());
		paletteContainer.add(createMainPage11CreationTool());
		paletteContainer.add(createNormalPage12CreationTool());
		paletteContainer.add(createPageExternal13CreationTool());
		paletteContainer.add(createRol14CreationTool());
		paletteContainer.add(createSocialMedia15CreationTool());
		paletteContainer.add(createText16CreationTool());
		paletteContainer.add(createVideo17CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				dataWebDeskDSL.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createAccess1CreationTool());
		paletteContainer.add(createCrudpages2CreationTool());
		paletteContainer.add(createEntitiesReferences3CreationTool());
		paletteContainer.add(createPagesReferences4CreationTool());
		paletteContainer.add(createPrimarykey5CreationTool());
		paletteContainer.add(createType6CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createAttribute1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.Attribute1CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.Attribute1CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Attribute_3007));
		entry.setId("createAttribute1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Attribute_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAudio2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.Audio2CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.Audio2CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Audio_3010));
		entry.setId("createAudio2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Audio_3010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCRUDPage3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.CRUDPage3CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.CRUDPage3CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUDPage_2017));
		entry.setId("createCRUDPage3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CRUDPage_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCreatePage4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.CreatePage4CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.CreatePage4CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CreatePage_2011));
		entry.setId("createCreatePage4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.CreatePage_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDataType5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.DataType5CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.DataType5CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DataType_2010));
		entry.setId("createDataType5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DataType_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDeletePage6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.DeletePage6CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.DeletePage6CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DeletePage_2013));
		entry.setId("createDeletePage6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DeletePage_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createDetailPage7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.DetailPage7CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.DetailPage7CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DetailPage_2012));
		entry.setId("createDetailPage7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.DetailPage_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntity8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.Entity8CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.Entity8CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entity_2009));
		entry.setId("createEntity8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Entity_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createImage9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.Image9CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.Image9CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Image_3011));
		entry.setId("createImage9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Image_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIndexPage10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.IndexPage10CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.IndexPage10CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.IndexPage_2014));
		entry.setId("createIndexPage10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.IndexPage_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMainPage11CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.MainPage11CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.MainPage11CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.MainPage_2016));
		entry.setId("createMainPage11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.MainPage_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createNormalPage12CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.NormalPage12CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.NormalPage12CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.NormalPage_2015));
		entry.setId("createNormalPage12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.NormalPage_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPageExternal13CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.PageExternal13CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.PageExternal13CreationTool_desc, Collections
						.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PageExternal_3013));
		entry.setId("createPageExternal13CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PageExternal_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createRol14CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.Rol14CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.Rol14CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Rol_2008));
		entry.setId("createRol14CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Rol_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createSocialMedia15CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.SocialMedia15CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.SocialMedia15CreationTool_desc, Collections
						.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.SocialMedia_3012));
		entry.setId("createSocialMedia15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.SocialMedia_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createText16CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.Text16CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.Text16CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Text_3008));
		entry.setId("createText16CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Text_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVideo17CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				dataWebDeskDSL.diagram.part.Messages.Video17CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.Video17CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Video_3009));
		entry.setId("createVideo17CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.Video_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createAccess1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				dataWebDeskDSL.diagram.part.Messages.Access1CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.Access1CreationTool_desc,
				Collections.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolAccess_4006));
		entry.setId("createAccess1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.RolAccess_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createCrudpages2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				dataWebDeskDSL.diagram.part.Messages.Crudpages2CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.Crudpages2CreationTool_desc, Collections.singletonList(
						dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityCrudpages_4005));
		entry.setId("createCrudpages2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityCrudpages_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEntitiesReferences3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				dataWebDeskDSL.diagram.part.Messages.EntitiesReferences3CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.EntitiesReferences3CreationTool_desc, Collections.singletonList(
						dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityEntitiesReferences_4003));
		entry.setId("createEntitiesReferences3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.getImageDescriptor(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityEntitiesReferences_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPagesReferences4CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				dataWebDeskDSL.diagram.part.Messages.PagesReferences4CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.PagesReferences4CreationTool_desc, Collections.singletonList(
						dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001));
		entry.setId("createPagesReferences4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.getImageDescriptor(
				dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.PagePagesReferences_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createPrimarykey5CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				dataWebDeskDSL.diagram.part.Messages.Primarykey5CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.Primarykey5CreationTool_desc, Collections.singletonList(
						dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityPrimarykey_4004));
		entry.setId("createPrimarykey5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.EntityPrimarykey_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createType6CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				dataWebDeskDSL.diagram.part.Messages.Type6CreationTool_title,
				dataWebDeskDSL.diagram.part.Messages.Type6CreationTool_desc, Collections
						.singletonList(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.AttributeType_4007));
		entry.setId("createType6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes
				.getImageDescriptor(dataWebDeskDSL.diagram.providers.DataWebDeskDSLElementTypes.AttributeType_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
