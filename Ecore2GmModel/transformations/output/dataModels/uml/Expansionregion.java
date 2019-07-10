/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Expansionregion of the Data Model uml.
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
{@link mode}, 
{@link outputElement}, 
{@link inputElement}, 

* It provides of then following operations (getters and setters)
{@link getMode},
{@link getOutputElement},
{@link getInputElement},
{@link setMode},
{@link setOutputElement},
{@link setInputElement},
 */

@Description("An ExpansionRegion is a StructuredActivityNode that executes its content multiple times corresponding to elements of input collection(s).<p>From package UML::Actions.</p>")

public interface Expansionregion extends GenericEntity, uml.Structuredactivitynode {

	EntityType<Expansionregion> T = EntityTypes.T(Expansionregion.class);

	/* Constants for each property name. */
	java.lang.String mode = "mode";
	java.lang.String outputElement = "outputElement";
	java.lang.String inputElement = "inputElement";

	@Description("The mode in which the ExpansionRegion executes its contents. If parallel, executions are concurrent. If iterative, executions are sequential. If stream, a stream of values flows into a single execution.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.ExpansionKind getMode();
	void setMode(uml.ExpansionKind mode);
	@Description("The ExpansionNodes that form the output collections of the ExpansionRegion.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Expansionnode> getOutputElement();
	void setOutputElement(java.util.List<uml.Expansionnode> outputElement);

	@Description("The ExpansionNodes that hold the input collections for the ExpansionRegion.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Expansionnode> getInputElement();
	void setInputElement(java.util.List<uml.Expansionnode> inputElement);

}
