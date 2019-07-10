/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Interaction of the Data Model uml.
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
{@link lifeline}, 
{@link fragment}, 
{@link action}, 
{@link formalGate}, 
{@link message}, 

* It provides of then following operations (getters and setters)
{@link getLifeline},
{@link getFragment},
{@link getAction},
{@link getFormalGate},
{@link getMessage},
{@link setLifeline},
{@link setFragment},
{@link setAction},
{@link setFormalGate},
{@link setMessage},
 */

@Description("An Interaction is a unit of Behavior that focuses on the observable exchange of information between connectable elements.<p>From package UML::Interactions.</p>")

public interface Interaction extends GenericEntity, uml.Behavior, uml.Interactionfragment {

	EntityType<Interaction> T = EntityTypes.T(Interaction.class);

	/* Constants for each property name. */
	java.lang.String lifeline = "lifeline";
	java.lang.String fragment = "fragment";
	java.lang.String action = "action";
	java.lang.String formalGate = "formalGate";
	java.lang.String message = "message";

	@Description("Specifies the participants in this Interaction.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Lifeline> getLifeline();
	void setLifeline(java.util.List<uml.Lifeline> lifeline);

	@Description("The ordered set of fragments in the Interaction.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Interactionfragment> getFragment();
	void setFragment(java.util.List<uml.Interactionfragment> fragment);

	@Description("Actions owned by the Interaction.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Action> getAction();
	void setAction(java.util.List<uml.Action> action);

	@Description("Specifies the gates that form the message interface between this Interaction and any InteractionUses which reference it.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Gate> getFormalGate();
	void setFormalGate(java.util.List<uml.Gate> formalGate);

	@Description("The Messages contained in this Interaction.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Message> getMessage();
	void setMessage(java.util.List<uml.Message> message);

}
