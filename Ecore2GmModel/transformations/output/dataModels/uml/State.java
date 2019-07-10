/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type State of the Data Model uml.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package uml;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link connection}, 
{@link connectionPoint}, 
{@link deferrableTrigger}, 
{@link doActivity}, 
{@link entry}, 
{@link exit}, 
{@link isComposite}, 
{@link isOrthogonal}, 
{@link isSimple}, 
{@link isSubmachineState}, 
{@link redefinedState}, 
{@link stateInvariant}, 
{@link submachine}, 
{@link region}, 

* It provides of then following operations (getters and setters)
{@link getConnection},
{@link getConnectionPoint},
{@link getDeferrableTrigger},
{@link getDoActivity},
{@link getEntry},
{@link getExit},
{@link getIsComposite},
{@link getIsOrthogonal},
{@link getIsSimple},
{@link getIsSubmachineState},
{@link getRedefinedState},
{@link getStateInvariant},
{@link getSubmachine},
{@link getRegion},
{@link setConnection},
{@link setConnectionPoint},
{@link setDeferrableTrigger},
{@link setDoActivity},
{@link setEntry},
{@link setExit},
{@link setIsComposite},
{@link setIsOrthogonal},
{@link setIsSimple},
{@link setIsSubmachineState},
{@link setRedefinedState},
{@link setStateInvariant},
{@link setSubmachine},
{@link setRegion},
 */

@Description("A State models a situation during which some (usually implicit) invariant condition holds.<p>From package UML::StateMachines.</p>")

public interface State extends GenericEntity, uml.Namespace, uml.Redefinableelement, uml.Vertex {

	EntityType<State> T = EntityTypes.T(State.class);

	/* Constants for each property name. */
	java.lang.String connection = "connection";
	java.lang.String connectionPoint = "connectionPoint";
	java.lang.String deferrableTrigger = "deferrableTrigger";
	java.lang.String doActivity = "doActivity";
	java.lang.String entry = "entry";
	java.lang.String exit = "exit";
	java.lang.String isComposite = "isComposite";
	java.lang.String isOrthogonal = "isOrthogonal";
	java.lang.String isSimple = "isSimple";
	java.lang.String isSubmachineState = "isSubmachineState";
	java.lang.String redefinedState = "redefinedState";
	java.lang.String stateInvariant = "stateInvariant";
	java.lang.String submachine = "submachine";
	java.lang.String region = "region";

	@Description("The entry and exit connection points used in conjunction with this (submachine) State, i.e., as targets and sources, respectively, in the Region with the submachine State. A connection point reference references the corresponding definition of a connection point Pseudostate in the StateMachine referenced by the submachine State.<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Connectionpointreference> getConnection();
	void setConnection(java.util.List<uml.Connectionpointreference> connection);

	@Description("The entry and exit Pseudostates of a composite State. These can only be entry or exit Pseudostates, and they must have different names. They can only be defined for composite States.<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Pseudostate> getConnectionPoint();
	void setConnectionPoint(java.util.List<uml.Pseudostate> connectionPoint);

	@Description("A list of Triggers that are candidates to be retained by the StateMachine if they trigger no Transitions out of the State (not consumed). A deferred Trigger is retained until the StateMachine reaches a State configuration where it is no longer deferred.<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Trigger> getDeferrableTrigger();
	void setDeferrableTrigger(java.util.List<uml.Trigger> deferrableTrigger);

	@Description("An optional Behavior that is executed while being in the State. The execution starts when this State is entered, and ceases either by itself when done, or when the State is exited, whichever comes first.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Behavior getDoActivity();
	void setDoActivity(uml.Behavior doActivity);
	@Description("An optional Behavior that is executed whenever this State is entered regardless of the Transition taken to reach the State. If defined, entry Behaviors are always executed to completion prior to any internal Behavior or Transitions performed within the State.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Behavior getEntry();
	void setEntry(uml.Behavior entry);
	@Description("An optional Behavior that is executed whenever this State is exited regardless of which Transition was taken out of the State. If defined, exit Behaviors are always executed to completion only after all internal and transition Behaviors have completed execution.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Behavior getExit();
	void setExit(uml.Behavior exit);
	@Description("A state with isComposite=true is said to be a composite State. A composite State is a State that contains at least one Region.<p>From package UML::StateMachines.</p>")
	@Mandatory
	types.Boolean getIsComposite();
	void setIsComposite(types.Boolean isComposite);
	@Description("A State with isOrthogonal=true is said to be an orthogonal composite State An orthogonal composite State contains two or more Regions.<p>From package UML::StateMachines.</p>")
	@Mandatory
	types.Boolean getIsOrthogonal();
	void setIsOrthogonal(types.Boolean isOrthogonal);
	@Description("A State with isSimple=true is said to be a simple State A simple State does not have any Regions and it does not refer to any submachine StateMachine.<p>From package UML::StateMachines.</p>")
	@Mandatory
	types.Boolean getIsSimple();
	void setIsSimple(types.Boolean isSimple);
	@Description("A State with isSubmachineState=true is said to be a submachine State Such a State refers to another StateMachine(submachine).<p>From package UML::StateMachines.</p>")
	@Mandatory
	types.Boolean getIsSubmachineState();
	void setIsSubmachineState(types.Boolean isSubmachineState);
	@Description("The State of which this State is a redefinition.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.State getRedefinedState();
	void setRedefinedState(uml.State redefinedState);
	@Description("Specifies conditions that are always true when this State is the current State. In ProtocolStateMachines state invariants are additional conditions to the preconditions of the outgoing Transitions, and to the postcondition of the incoming Transitions.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Constraint getStateInvariant();
	void setStateInvariant(uml.Constraint stateInvariant);
	@Description("The StateMachine that is to be inserted in place of the (submachine) State.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Statemachine getSubmachine();
	void setSubmachine(uml.Statemachine submachine);
	@Description("The Regions owned directly by the State.<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Region> getRegion();
	void setRegion(java.util.List<uml.Region> region);

}
