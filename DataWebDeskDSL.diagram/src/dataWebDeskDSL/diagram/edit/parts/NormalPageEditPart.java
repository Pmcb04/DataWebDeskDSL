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
public class NormalPageEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 2015;

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
	public NormalPageEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new dataWebDeskDSL.diagram.edit.policies.NormalPageItemSemanticEditPolicy());
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
		return primaryShape = new NormalPageFigure();
	}

	/**
	* @generated
	*/
	public NormalPageFigure getPrimaryShape() {
		return (NormalPageFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.NormalPageTitleEditPart) {
			((dataWebDeskDSL.diagram.edit.parts.NormalPageTitleEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureNormalPageLabelFigure());
			return true;
		}
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageSocialMediasCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getNormalPageSocialMediasCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageSocialMediasCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPagePagesexternalCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getNormalPagePagesexternalCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPagePagesexternalCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getNormalPageMultimediasCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.NormalPageTitleEditPart) {
			return true;
		}
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageSocialMediasCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getNormalPageSocialMediasCompartmentFigure();
			pane.remove(
					((dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageSocialMediasCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPagePagesexternalCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getNormalPagePagesexternalCompartmentFigure();
			pane.remove(
					((dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPagePagesexternalCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		if (childEditPart instanceof dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getNormalPageMultimediasCompartmentFigure();
			pane.remove(
					((dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart) childEditPart)
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
		if (editPart instanceof dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageSocialMediasCompartmentEditPart) {
			return getPrimaryShape().getNormalPageSocialMediasCompartmentFigure();
		}
		if (editPart instanceof dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPagePagesexternalCompartmentEditPart) {
			return getPrimaryShape().getNormalPagePagesexternalCompartmentFigure();
		}
		if (editPart instanceof dataWebDeskDSL.diagram.edit.parts.NormalPageNormalPageMultimediasCompartmentEditPart) {
			return getPrimaryShape().getNormalPageMultimediasCompartmentFigure();
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
				.getType(dataWebDeskDSL.diagram.edit.parts.NormalPageTitleEditPart.VISUAL_ID));
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
	public class NormalPageFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureNormalPageLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fNormalPageSocialMediasCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fNormalPagePagesexternalCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fNormalPageMultimediasCompartmentFigure;

		/**
		 * @generated
		 */
		public NormalPageFigure() {
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

			fFigureNormalPageLabelFigure = new WrappingLabel();

			fFigureNormalPageLabelFigure.setText("NormalPage");
			fFigureNormalPageLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureNormalPageLabelFigure);

			fNormalPageSocialMediasCompartmentFigure = new RectangleFigure();

			fNormalPageSocialMediasCompartmentFigure.setOutline(false);

			this.add(fNormalPageSocialMediasCompartmentFigure);

			fNormalPagePagesexternalCompartmentFigure = new RectangleFigure();

			fNormalPagePagesexternalCompartmentFigure.setOutline(false);

			this.add(fNormalPagePagesexternalCompartmentFigure);

			fNormalPageMultimediasCompartmentFigure = new RectangleFigure();

			fNormalPageMultimediasCompartmentFigure.setOutline(false);

			this.add(fNormalPageMultimediasCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureNormalPageLabelFigure() {
			return fFigureNormalPageLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getNormalPageSocialMediasCompartmentFigure() {
			return fNormalPageSocialMediasCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getNormalPagePagesexternalCompartmentFigure() {
			return fNormalPagePagesexternalCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getNormalPageMultimediasCompartmentFigure() {
			return fNormalPageMultimediasCompartmentFigure;
		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 207, 89, 25);

}
