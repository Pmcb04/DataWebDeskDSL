/*
 * 
 */
package dataWebDeskDSL.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class DataWebDeskDSLCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected dataWebDeskDSL.diagram.part.DataWebDeskDSLCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected dataWebDeskDSL.diagram.part.DataWebDeskDSLCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(dataWebDeskDSL.diagram.part.Messages.DataWebDeskDSLCreationWizardTitle);
		setDefaultPageImageDescriptor(dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewDataWebDeskDSLWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new dataWebDeskDSL.diagram.part.DataWebDeskDSLCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "datawebdeskdsl_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(dataWebDeskDSL.diagram.part.Messages.DataWebDeskDSLCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				dataWebDeskDSL.diagram.part.Messages.DataWebDeskDSLCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new dataWebDeskDSL.diagram.part.DataWebDeskDSLCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "datawebdeskdsl") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".datawebdeskdsl_diagram".length()); //$NON-NLS-1$
					setFileName(dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "datawebdeskdsl")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(dataWebDeskDSL.diagram.part.Messages.DataWebDeskDSLCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				dataWebDeskDSL.diagram.part.Messages.DataWebDeskDSLCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								dataWebDeskDSL.diagram.part.Messages.DataWebDeskDSLCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						dataWebDeskDSL.diagram.part.Messages.DataWebDeskDSLCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				dataWebDeskDSL.diagram.part.DataWebDeskDSLDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
