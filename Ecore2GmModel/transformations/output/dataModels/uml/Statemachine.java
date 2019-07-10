/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Statemachine of the Data Model uml.
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
{@link connectionPoint}, 
{@link submachineState}, 
{@link region}, 
{@link extendedStateMachine}, 

* It provides of then following operations (getters and setters)
{@link getConnectionPoint},
{@link getSubmachineState},
{@link getRegion},
{@link getExtendedStateMachine},
{@link setConnectionPoint},
{@link setSubmachineState},
{@link setRegion},
{@link setExtendedStateMachine},
 */

@Description("StateMachines can be used to express event-driven behaviors of parts of a system. Behavior is modeled as a traversal of a graph of Vertices interconnected by one or more joined Transition arcs that are triggered by the dispatching of successive Event occurrences. During this traversal, the StateMachine may execute a sequence of Behaviors associated with various elements of the StateMachine.<p>From package UML::StateMachines.</p>")

public interface Statemachine extends GenericEntity, uml.Behavior {

	EntityType<Statemachine> T = EntityTypes.T(Statemachine.class);

	/* Constants for each property name. */
	java.lang.String connectionPoint = "connectionPoint";
	java.lang.String submachineState = "submachineState";
	java.lang.String region = "region";
	java.lang.String extendedStateMachine = "extendedStateMachine";

	@Description("The connection points defined for this StateMachine. They represent the interface of the StateMachine when used as part of submachine State<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Pseudostate> getConnectionPoint();
	void setConnectionPoint(java.util.List<uml.Pseudostate> connectionPoint);

	@Description("References the submachine(s) in case of a submachine State. Multiple machines are referenced in case of a concurrent State.<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.State> getSubmachineState();
	void setSubmachineState(java.util.List<uml.State> submachineState);

	@Description("The Regions owned directly by the StateMachine.<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Region> getRegion();
	void setRegion(java.util.List<uml.Region> region);

	@Description("The StateMachines of which this is an extension.<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Statemachine> getExtendedStateMachine();
	void setExtendedStateMachine(java.util.List<uml.Statemachine> extendedStateMachine);

}
