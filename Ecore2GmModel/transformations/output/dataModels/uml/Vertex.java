/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Vertex of the Data Model uml.
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
{@link container}, 
{@link incoming}, 
{@link outgoing}, 

* It provides of then following operations (getters and setters)
{@link getContainer},
{@link getIncoming},
{@link getOutgoing},
{@link setContainer},
{@link setIncoming},
{@link setOutgoing},
 */

@Description("A Vertex is an abstraction of a node in a StateMachine graph. It can be the source or destination of any number of Transitions.<p>From package UML::StateMachines.</p>")
 
@Abstract 

public interface Vertex extends GenericEntity, uml.Namedelement {

	EntityType<Vertex> T = EntityTypes.T(Vertex.class);

	/* Constants for each property name. */
	java.lang.String container = "container";
	java.lang.String incoming = "incoming";
	java.lang.String outgoing = "outgoing";

	@Description("The Region that contains this Vertex.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.Region getContainer();
	void setContainer(uml.Region container);
	@Description("Specifies the Transitions entering this Vertex.<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Transition> getIncoming();
	void setIncoming(java.util.List<uml.Transition> incoming);

	@Description("Specifies the Transitions departing from this Vertex.<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Transition> getOutgoing();
	void setOutgoing(java.util.List<uml.Transition> outgoing);

}
