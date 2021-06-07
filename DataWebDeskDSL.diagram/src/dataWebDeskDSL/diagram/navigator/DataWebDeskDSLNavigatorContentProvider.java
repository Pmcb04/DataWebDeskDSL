/*
* 
*/
package dataWebDeskDSL.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class DataWebDeskDSLNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public DataWebDeskDSLNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem> result = new ArrayList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup) {
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup group = (dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) {
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem navigatorItem = (dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getVisualID(view)) {

		case dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup links = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_WebSite_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityEntitiesReferencesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityPrimarykeyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.AttributeTypeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_Rol_2008_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_Entity_2009_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_Entity_2009_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.EntityEntityAttributesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityEntitiesReferencesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityEntitiesReferencesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityPrimarykeyEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_DataType_2010_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.AttributeTypeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_CreatePage_2011_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_CreatePage_2011_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePageSocialMediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.CreatePageCreatePagePagesexternalCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_DetailPage_2012_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_DetailPage_2012_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPageSocialMediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.DetailPageDetailPagePagesexternalCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_DeletePage_2013_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_DeletePage_2013_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageSocialMediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePagePagesexternalCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_IndexPage_2014_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_IndexPage_2014_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPageSocialMediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.IndexPageIndexPagePagesexternalCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_NormalPage_2015_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_NormalPage_2015_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageSocialMediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPagePagesexternalCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_MainPage_2016_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_MainPage_2016_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.MainPageMainPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.MainPageMainPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.MainPageMainPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.MainPageMainPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.MainPageMainPageSocialMediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.MainPageMainPagePagesexternalCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_CRUDPage_2017_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_CRUDPage_2017_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.TextEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.VideoEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.AudioEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageMultimediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.ImageEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPageSocialMediasCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.SocialMediaEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getType(
							dataWebDeskDSL.diagram.edit.parts.CRUDPageCRUDPagePagesexternalCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PageExternalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Node sv = (Node) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup incominglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_Attribute_3007_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup outgoinglinks = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_Attribute_3007_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityPrimarykeyEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.AttributeTypeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.PagePagesReferencesEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup target = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PagePagesReferences_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup source = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_PagePagesReferences_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.EntityEntitiesReferencesEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup target = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_EntityEntitiesReferences_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup source = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_EntityEntitiesReferences_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.EntityPrimarykeyEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup target = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_EntityPrimarykey_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup source = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_EntityPrimarykey_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.EntityCrudpagesEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup target = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_EntityCrudpages_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup source = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_EntityCrudpages_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.EntityEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.RolAccessEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup target = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_RolAccess_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup source = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_RolAccess_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.CreatePageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.DetailPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.DeletePageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.IndexPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.NormalPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.MainPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.CRUDPageEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.RolEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case dataWebDeskDSL.diagram.edit.parts.AttributeTypeEditPart.VISUAL_ID: {
			LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem> result = new LinkedList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup target = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_AttributeType_4007_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup source = new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorGroup(
					dataWebDeskDSL.diagram.part.Messages.NavigatorGroupName_AttributeType_4007_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.DataTypeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
							.getType(dataWebDeskDSL.diagram.edit.parts.AttributeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return dataWebDeskDSL.diagram.edit.parts.WebSiteEditPart.MODEL_ID
				.equals(dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem> result = new ArrayList<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<dataWebDeskDSL.diagram.navigator.DataWebDeskDSLNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem) {
			dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem abstractNavigatorItem = (dataWebDeskDSL.diagram.navigator.DataWebDeskDSLAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
