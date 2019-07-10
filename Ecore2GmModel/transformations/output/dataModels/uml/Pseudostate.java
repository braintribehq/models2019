/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Pseudostate of the Data Model uml.
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
{@link state}, 
{@link kind}, 
{@link stateMachine}, 

* It provides of then following operations (getters and setters)
{@link getState},
{@link getKind},
{@link getStateMachine},
{@link setState},
{@link setKind},
{@link setStateMachine},
 */

@Description("A Pseudostate is an abstraction that encompasses different types of transient Vertices in the StateMachine graph. A StateMachine instance never comes to rest in a Pseudostate, instead, it will exit and enter the Pseudostate within a single run-to-completion step.<p>From package UML::StateMachines.</p>")

public interface Pseudostate extends GenericEntity, uml.Vertex {

	EntityType<Pseudostate> T = EntityTypes.T(Pseudostate.class);

	/* Constants for each property name. */
	java.lang.String state = "state";
	java.lang.String kind = "kind";
	java.lang.String stateMachine = "stateMachine";

	@Description("The State that owns this Pseudostate and in which it appears.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.State getState();
	void setState(uml.State state);
	@Description("Determines the precise type of the Pseudostate and can be one of: entryPoint, exitPoint, initial, deepHistory, shallowHistory, join, fork, junction, terminate or choice.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.PseudostateKind getKind();
	void setKind(uml.PseudostateKind kind);
	@Description("The StateMachine in which this Pseudostate is defined. This only applies to Pseudostates of the kind entryPoint or exitPoint.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Statemachine getStateMachine();
	void setStateMachine(uml.Statemachine stateMachine);
}
