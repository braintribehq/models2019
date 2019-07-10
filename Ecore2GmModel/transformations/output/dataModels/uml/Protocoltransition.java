/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Protocoltransition of the Data Model uml.
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
{@link postCondition}, 
{@link preCondition}, 
{@link referred}, 

* It provides of then following operations (getters and setters)
{@link getPostCondition},
{@link getPreCondition},
{@link getReferred},
{@link setPostCondition},
{@link setPreCondition},
{@link setReferred},
 */

@Description("A ProtocolTransition specifies a legal Transition for an Operation. Transitions of ProtocolStateMachines have the following information: a pre-condition (guard), a Trigger, and a post-condition. Every ProtocolTransition is associated with at most one BehavioralFeature belonging to the context Classifier of the ProtocolStateMachine.<p>From package UML::StateMachines.</p>")

public interface Protocoltransition extends GenericEntity, uml.Transition {

	EntityType<Protocoltransition> T = EntityTypes.T(Protocoltransition.class);

	/* Constants for each property name. */
	java.lang.String postCondition = "postCondition";
	java.lang.String preCondition = "preCondition";
	java.lang.String referred = "referred";

	@Description("Specifies the post condition of the Transition which is the Condition that should be obtained once the Transition is triggered. This post condition is part of the post condition of the Operation connected to the Transition.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Constraint getPostCondition();
	void setPostCondition(uml.Constraint postCondition);
	@Description("Specifies the precondition of the Transition. It specifies the Condition that should be verified before triggering the Transition. This guard condition added to the source State will be evaluated as part of the precondition of the Operation referred by the Transition if any.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Constraint getPreCondition();
	void setPreCondition(uml.Constraint preCondition);
	@Description("This association refers to the associated Operation. It is derived from the Operation of the CallEvent Trigger when applicable.<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Operation> getReferred();
	void setReferred(java.util.List<uml.Operation> referred);

}
