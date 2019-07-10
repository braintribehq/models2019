/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Lifeline of the Data Model uml.
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
{@link decomposedAs}, 
{@link interaction}, 
{@link represents}, 
{@link selector}, 
{@link coveredBy}, 

* It provides of then following operations (getters and setters)
{@link getDecomposedAs},
{@link getInteraction},
{@link getRepresents},
{@link getSelector},
{@link getCoveredBy},
{@link setDecomposedAs},
{@link setInteraction},
{@link setRepresents},
{@link setSelector},
{@link setCoveredBy},
 */

@Description("A Lifeline represents an individual participant in the Interaction. While parts and structural features may have multiplicity greater than 1, Lifelines represent only one interacting entity.<p>From package UML::Interactions.</p>")

public interface Lifeline extends GenericEntity, uml.Namedelement {

	EntityType<Lifeline> T = EntityTypes.T(Lifeline.class);

	/* Constants for each property name. */
	java.lang.String decomposedAs = "decomposedAs";
	java.lang.String interaction = "interaction";
	java.lang.String represents = "represents";
	java.lang.String selector = "selector";
	java.lang.String coveredBy = "coveredBy";

	@Description("References the Interaction that represents the decomposition.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Partdecomposition getDecomposedAs();
	void setDecomposedAs(uml.Partdecomposition decomposedAs);
	@Description("References the Interaction enclosing this Lifeline.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Interaction getInteraction();
	void setInteraction(uml.Interaction interaction);
	@Description("References the ConnectableElement within the classifier that contains the enclosing interaction.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Connectableelement getRepresents();
	void setRepresents(uml.Connectableelement represents);
	@Description("If the referenced ConnectableElement is multivalued, then this specifies the specific individual part within that set.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.Valuespecification getSelector();
	void setSelector(uml.Valuespecification selector);
	@Description("References the InteractionFragments in which this Lifeline takes part.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Interactionfragment> getCoveredBy();
	void setCoveredBy(java.util.List<uml.Interactionfragment> coveredBy);

}
