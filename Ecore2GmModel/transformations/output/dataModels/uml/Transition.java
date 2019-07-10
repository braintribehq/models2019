/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Transition of the Data Model uml.
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
{@link effect}, 
{@link guard}, 
{@link kind}, 
{@link redefinedTransition}, 
{@link source}, 
{@link target}, 
{@link trigger}, 
{@link container}, 

* It provides of then following operations (getters and setters)
{@link getEffect},
{@link getGuard},
{@link getKind},
{@link getRedefinedTransition},
{@link getSource},
{@link getTarget},
{@link getTrigger},
{@link getContainer},
{@link setEffect},
{@link setGuard},
{@link setKind},
{@link setRedefinedTransition},
{@link setSource},
{@link setTarget},
{@link setTrigger},
{@link setContainer},
 */

@Description("A Transition represents an arc between exactly one source Vertex and exactly one Target vertex (the source and targets may be the same Vertex). It may form part of a compound transition, which takes the StateMachine from one steady State configuration to another, representing the full response of the StateMachine to an occurrence of an Event that triggered it.<p>From package UML::StateMachines.</p>")

public interface Transition extends GenericEntity, uml.Namespace, uml.Redefinableelement {

	EntityType<Transition> T = EntityTypes.T(Transition.class);

	/* Constants for each property name. */
	java.lang.String effect = "effect";
	java.lang.String guard = "guard";
	java.lang.String kind = "kind";
	java.lang.String redefinedTransition = "redefinedTransition";
	java.lang.String source = "source";
	java.lang.String target = "target";
	java.lang.String trigger = "trigger";
	java.lang.String container = "container";

	@Description("Specifies an optional behavior to be performed when the Transition fires.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Behavior getEffect();
	void setEffect(uml.Behavior effect);
	@Description("A guard is a Constraint that provides a fine-grained control over the firing of the Transition. The guard is evaluated when an Event occurrence is dispatched by the StateMachine. If the guard is true at that time, the Transition may be enabled, otherwise, it is disabled. Guards should be pure expressions without side effects. Guard expressions with side effects are ill formed.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Constraint getGuard();
	void setGuard(uml.Constraint guard);
	@Description("Indicates the precise type of the Transition.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.TransitionKind getKind();
	void setKind(uml.TransitionKind kind);
	@Description("The Transition that is redefined by this Transition.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Transition getRedefinedTransition();
	void setRedefinedTransition(uml.Transition redefinedTransition);
	@Description("Designates the originating Vertex (State or Pseudostate) of the Transition.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Vertex getSource();
	void setSource(uml.Vertex source);
	@Description("Designates the target Vertex that is reached when the Transition is taken.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Vertex getTarget();
	void setTarget(uml.Vertex target);
	@Description("Specifies the Triggers that may fire the transition.<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Trigger> getTrigger();
	void setTrigger(java.util.List<uml.Trigger> trigger);

	@Description("Designates the Region that owns this Transition.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Region getContainer();
	void setContainer(uml.Region container);
}
