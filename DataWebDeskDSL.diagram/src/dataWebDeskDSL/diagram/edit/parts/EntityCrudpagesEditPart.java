/*
 * 
 */
package dataWebDeskDSL.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class EntityCrudpagesEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4005;

	/**
	* @generated
	*/
	public EntityCrudpagesEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new dataWebDeskDSL.diagram.edit.policies.EntityCrudpagesItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new EntityCrudpagesFigure();
	}

	/**
	* @generated
	*/
	public EntityCrudpagesFigure getPrimaryShape() {
		return (EntityCrudpagesFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class EntityCrudpagesFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public EntityCrudpagesFigure() {
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DOT);

		}

	}

}
