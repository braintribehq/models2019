/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Conditionalnode of the Data Model uml.
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
{@link clause}, 
{@link isAssured}, 
{@link isDeterminate}, 
{@link result}, 

* It provides of then following operations (getters and setters)
{@link getClause},
{@link getIsAssured},
{@link getIsDeterminate},
{@link getResult},
{@link setClause},
{@link setIsAssured},
{@link setIsDeterminate},
{@link setResult},
 */

@Description("A ConditionalNode is a StructuredActivityNode that chooses one among some number of alternative collections of ExecutableNodes to execute.<p>From package UML::Actions.</p>")

public interface Conditionalnode extends GenericEntity, uml.Structuredactivitynode {

	EntityType<Conditionalnode> T = EntityTypes.T(Conditionalnode.class);

	/* Constants for each property name. */
	java.lang.String clause = "clause";
	java.lang.String isAssured = "isAssured";
	java.lang.String isDeterminate = "isDeterminate";
	java.lang.String result = "result";

	@Description("The set of Clauses composing the ConditionalNode.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Clause> getClause();
	void setClause(java.util.List<uml.Clause> clause);

	@Description("If true, the modeler asserts that the test for at least one Clause of the ConditionalNode will succeed.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsAssured();
	void setIsAssured(types.Boolean isAssured);
	@Description("If true, the modeler asserts that the test for at most one Clause of the ConditionalNode will succeed.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsDeterminate();
	void setIsDeterminate(types.Boolean isDeterminate);
	@Description("The OutputPins that onto which are moved values from the bodyOutputs of the Clause selected for execution.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Outputpin> getResult();
	void setResult(java.util.List<uml.Outputpin> result);

}
