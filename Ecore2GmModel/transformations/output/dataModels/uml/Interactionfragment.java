/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Interactionfragment of the Data Model uml.
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
{@link covered}, 
{@link enclosingOperand}, 
{@link enclosingInteraction}, 
{@link generalOrdering}, 

* It provides of then following operations (getters and setters)
{@link getCovered},
{@link getEnclosingOperand},
{@link getEnclosingInteraction},
{@link getGeneralOrdering},
{@link setCovered},
{@link setEnclosingOperand},
{@link setEnclosingInteraction},
{@link setGeneralOrdering},
 */

@Description("InteractionFragment is an abstract notion of the most general interaction unit. An InteractionFragment is a piece of an Interaction. Each InteractionFragment is conceptually like an Interaction by itself.<p>From package UML::Interactions.</p>")
 
@Abstract 

public interface Interactionfragment extends GenericEntity, uml.Namedelement {

	EntityType<Interactionfragment> T = EntityTypes.T(Interactionfragment.class);

	/* Constants for each property name. */
	java.lang.String covered = "covered";
	java.lang.String enclosingOperand = "enclosingOperand";
	java.lang.String enclosingInteraction = "enclosingInteraction";
	java.lang.String generalOrdering = "generalOrdering";

	@Description("References the Lifelines that the InteractionFragment involves.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Lifeline> getCovered();
	void setCovered(java.util.List<uml.Lifeline> covered);

	@Description("The operand enclosing this InteractionFragment (they may nest recursively).<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Interactionoperand getEnclosingOperand();
	void setEnclosingOperand(uml.Interactionoperand enclosingOperand);
	@Description("The Interaction enclosing this InteractionFragment.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Interaction getEnclosingInteraction();
	void setEnclosingInteraction(uml.Interaction enclosingInteraction);
	@Description("The general ordering relationships contained in this fragment.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Generalordering> getGeneralOrdering();
	void setGeneralOrdering(java.util.List<uml.Generalordering> generalOrdering);

}
