/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Interruptibleactivityregion of the Data Model uml.
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
{@link interruptingEdge}, 
{@link node}, 

* It provides of then following operations (getters and setters)
{@link getInterruptingEdge},
{@link getNode},
{@link setInterruptingEdge},
{@link setNode},
 */

@Description("An InterruptibleActivityRegion is an ActivityGroup that supports the termination of tokens flowing in the portions of an activity within it.<p>From package UML::Activities.</p>")

public interface Interruptibleactivityregion extends GenericEntity, uml.Activitygroup {

	EntityType<Interruptibleactivityregion> T = EntityTypes.T(Interruptibleactivityregion.class);

	/* Constants for each property name. */
	java.lang.String interruptingEdge = "interruptingEdge";
	java.lang.String node = "node";

	@Description("The ActivityEdges leaving the InterruptibleActivityRegion on which a traversing token will result in the termination of other tokens flowing in the InterruptibleActivityRegion.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activityedge> getInterruptingEdge();
	void setInterruptingEdge(java.util.List<uml.Activityedge> interruptingEdge);

	@Description("ActivityNodes immediately contained in the InterruptibleActivityRegion.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.Activitynode> getNode();
	void setNode(java.util.List<uml.Activitynode> node);

}
