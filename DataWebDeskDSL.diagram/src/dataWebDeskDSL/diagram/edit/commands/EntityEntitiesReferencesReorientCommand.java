/*
 * 
 */
package dataWebDeskDSL.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class EntityEntitiesReferencesReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public EntityEntitiesReferencesReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof dataWebDeskDSL.Entity) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof dataWebDeskDSL.Entity && newEnd instanceof dataWebDeskDSL.Entity)) {
			return false;
		}
		return dataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEntityEntitiesReferences_4003(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof dataWebDeskDSL.Entity && newEnd instanceof dataWebDeskDSL.Entity)) {
			return false;
		}
		return dataWebDeskDSL.diagram.edit.policies.DataWebDeskDSLBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistEntityEntitiesReferences_4003(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getEntitiesReferences().remove(getOldTarget());
		getNewSource().getEntitiesReferences().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getEntitiesReferences().remove(getOldTarget());
		getOldSource().getEntitiesReferences().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected dataWebDeskDSL.Entity getOldSource() {
		return (dataWebDeskDSL.Entity) referenceOwner;
	}

	/**
	* @generated
	*/
	protected dataWebDeskDSL.Entity getNewSource() {
		return (dataWebDeskDSL.Entity) newEnd;
	}

	/**
	* @generated
	*/
	protected dataWebDeskDSL.Entity getOldTarget() {
		return (dataWebDeskDSL.Entity) oldEnd;
	}

	/**
	* @generated
	*/
	protected dataWebDeskDSL.Entity getNewTarget() {
		return (dataWebDeskDSL.Entity) newEnd;
	}
}
