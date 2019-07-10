/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Connectionpointreference of the Data Model uml.
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
{@link entry}, 
{@link exit}, 
{@link state}, 

* It provides of then following operations (getters and setters)
{@link getEntry},
{@link getExit},
{@link getState},
{@link setEntry},
{@link setExit},
{@link setState},
 */

@Description("A ConnectionPointReference represents a usage (as part of a submachine State) of an entry/exit point Pseudostate defined in the StateMachine referenced by the submachine State.<p>From package UML::StateMachines.</p>")

public interface Connectionpointreference extends GenericEntity, uml.Vertex {

	EntityType<Connectionpointreference> T = EntityTypes.T(Connectionpointreference.class);

	/* Constants for each property name. */
	java.lang.String entry = "entry";
	java.lang.String exit = "exit";
	java.lang.String state = "state";

	@Description("The entryPoint Pseudostates corresponding to this connection point.<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Pseudostate> getEntry();
	void setEntry(java.util.List<uml.Pseudostate> entry);

	@Description("The exitPoints kind Pseudostates corresponding to this connection point.<p>From package UML::StateMachines.</p>")
	
	java.util.List<uml.Pseudostate> getExit();
	void setExit(java.util.List<uml.Pseudostate> exit);

	@Description("The State in which the ConnectionPointReference is defined.<p>From package UML::StateMachines.</p>")
	@Mandatory
	uml.State getState();
	void setState(uml.State state);
}
