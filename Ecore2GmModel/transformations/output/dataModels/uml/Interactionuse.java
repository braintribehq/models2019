/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Interactionuse of the Data Model uml.
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
{@link actualGate}, 
{@link argument}, 
{@link refersTo}, 
{@link returnValue}, 
{@link returnValueRecipient}, 

* It provides of then following operations (getters and setters)
{@link getActualGate},
{@link getArgument},
{@link getRefersTo},
{@link getReturnValue},
{@link getReturnValueRecipient},
{@link setActualGate},
{@link setArgument},
{@link setRefersTo},
{@link setReturnValue},
{@link setReturnValueRecipient},
 */

@Description("An InteractionUse refers to an Interaction. The InteractionUse is a shorthand for copying the contents of the referenced Interaction where the InteractionUse is. To be accurate the copying must take into account substituting parameters with arguments and connect the formal Gates with the actual ones.<p>From package UML::Interactions.</p>")

public interface Interactionuse extends GenericEntity, uml.Interactionfragment {

	EntityType<Interactionuse> T = EntityTypes.T(Interactionuse.class);

	/* Constants for each property name. */
	java.lang.String actualGate = "actualGate";
	java.lang.String argument = "argument";
	java.lang.String refersTo = "refersTo";
	java.lang.String returnValue = "returnValue";
	java.lang.String returnValueRecipient = "returnValueRecipient";

	@Description("The actual gates of the InteractionUse.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Gate> getActualGate();
	void setActualGate(java.util.List<uml.Gate> actualGate);

	@Description("The actual arguments of the Interaction.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Valuespecification> getArgument();
	void setArgument(java.util.List<uml.Valuespecification> argument);

	@Description("Refers to the Interaction that defines its meaning.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Interaction getRefersTo();
	void setRefersTo(uml.Interaction refersTo);
	@Description("The value of the executed Interaction.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Valuespecification getReturnValue();
	void setReturnValue(uml.Valuespecification returnValue);
	@Description("The recipient of the return value.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Property getReturnValueRecipient();
	void setReturnValueRecipient(uml.Property returnValueRecipient);
}
