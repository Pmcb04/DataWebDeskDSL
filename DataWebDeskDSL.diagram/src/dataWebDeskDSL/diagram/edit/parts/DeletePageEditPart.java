/*
 * 
 */
package dataWebDeskDSL.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class DeletePageEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2013;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public DeletePageEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new dataWebDeskDSL.diagram.edit.policies.DeletePageItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new dataWebDeskDSL.diagram.edit.policies.OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new DeletePageFigure();
	}

	/**
	* @generated
	*/
	public DeletePageFigure getPrimaryShape() {
		return (DeletePageFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.DeletePageTitleEditPart) {
			((dataWebDeskDSL.diagram.edit.parts.DeletePageTitleEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureDeletePageLabelFigure());
			return true;
		}
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageSocialMediasCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDeletePageSocialMediasCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageSocialMediasCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePagePagesexternalCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDeletePagePagesexternalCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePagePagesexternalCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDeletePageMultimediasCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.DeletePageTitleEditPart) {
			return true;
		}
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageSocialMediasCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDeletePageSocialMediasCompartmentFigure();
			pane.remove(
					((dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageSocialMediasCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePagePagesexternalCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDeletePagePagesexternalCompartmentFigure();
			pane.remove(
					((dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePagePagesexternalCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getDeletePageMultimediasCompartmentFigure();
			pane.remove(
					((dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageSocialMediasCompartmentEditPart) {
			return getPrimaryShape().getDeletePageSocialMediasCompartmentFigure();
		}
		if (editPart instanceof dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePagePagesexternalCompartmentEditPart) {
			return getPrimaryShape().getDeletePagePagesexternalCompartmentFigure();
		}
		if (editPart instanceof dataWebDeskDSL.diagram.edit.parts.DeletePageDeletePageMultimediasCompartmentEditPart) {
			return getPrimaryShape().getDeletePageMultimediasCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(dataWebDeskDSL.diagram.part.DataWebDeskDSLVisualIDRegistry
				.getType(dataWebDeskDSL.diagram.edit.parts.DeletePageTitleEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel()
				&& EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
	}

	/**
	 * @generated
	 */
	public class DeletePageFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureDeletePageLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDeletePageSocialMediasCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDeletePagePagesexternalCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fDeletePageMultimediasCompartmentFigure;

		/**
		 * @generated
		 */
		public DeletePageFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setLineWidth(3);
			this.setForegroundColor(THIS_FORE);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureDeletePageLabelFigure = new WrappingLabel();

			fFigureDeletePageLabelFigure.setText("DeletePage");
			fFigureDeletePageLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureDeletePageLabelFigure);

			fDeletePageSocialMediasCompartmentFigure = new RectangleFigure();

			fDeletePageSocialMediasCompartmentFigure.setOutline(false);

			this.add(fDeletePageSocialMediasCompartmentFigure);

			fDeletePagePagesexternalCompartmentFigure = new RectangleFigure();

			fDeletePagePagesexternalCompartmentFigure.setOutline(false);

			this.add(fDeletePagePagesexternalCompartmentFigure);

			fDeletePageMultimediasCompartmentFigure = new RectangleFigure();

			fDeletePageMultimediasCompartmentFigure.setOutline(false);

			this.add(fDeletePageMultimediasCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureDeletePageLabelFigure() {
			return fFigureDeletePageLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDeletePageSocialMediasCompartmentFigure() {
			return fDeletePageSocialMediasCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDeletePagePagesexternalCompartmentFigure() {
			return fDeletePagePagesexternalCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getDeletePageMultimediasCompartmentFigure() {
			return fDeletePageMultimediasCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 207, 25, 25);

}
