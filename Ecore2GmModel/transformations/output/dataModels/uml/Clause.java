/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Clause of the Data Model uml.
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
{@link body}, 
{@link bodyOutput}, 
{@link decider}, 
{@link predecessorClause}, 
{@link successorClause}, 
{@link test}, 

* It provides of then following operations (getters and setters)
{@link getBody},
{@link getBodyOutput},
{@link getDecider},
{@link getPredecessorClause},
{@link getSuccessorClause},
{@link getTest},
{@link setBody},
{@link setBodyOutput},
{@link setDecider},
{@link setPredecessorClause},
{@link setSuccessorClause},
{@link setTest},
 */

@Description("A Clause is an Element that represents a single branch of a ConditionalNode, including a test and a body section. The body section is executed only if (but not necessarily if) the test section evaluates to true.<p>From package UML::Actions.</p>")

public interface Clause extends GenericEntity, uml.Element {

	EntityType<Clause> T = EntityTypes.T(Clause.class);

	/* Constants for each property name. */
	java.lang.String body = "body";
	java.lang.String bodyOutput = "bodyOutput";
	java.lang.String decider = "decider";
	java.lang.String predecessorClause = "predecessorClause";
	java.lang.String successorClause = "successorClause";
	java.lang.String test = "test";

	@Description("The set of ExecutableNodes that are executed if the test evaluates to true and the Clause is chosen over other Clauses within the ConditionalNode that also have tests that evaluate to true.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Executablenode> getBody();
	void setBody(java.util.List<uml.Executablenode> body);

	@Description("The OutputPins on Actions within the body section whose values are moved to the result OutputPins of the containing ConditionalNode after execution of the body.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Outputpin> getBodyOutput();
	void setBodyOutput(java.util.List<uml.Outputpin> bodyOutput);

	@Description("An OutputPin on an Action in the test section whose Boolean value determines the result of the test.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Outputpin getDecider();
	void setDecider(uml.Outputpin decider);
	@Description("A set of Clauses whose tests must all evaluate to false before this Clause can evaluate its test.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Clause> getPredecessorClause();
	void setPredecessorClause(java.util.List<uml.Clause> predecessorClause);

	@Description("A set of Clauses that may not evaluate their tests unless the test for this Clause evaluates to false.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Clause> getSuccessorClause();
	void setSuccessorClause(java.util.List<uml.Clause> successorClause);

	@Description("The set of ExecutableNodes that are executed in order to provide a test result for the Clause.<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Executablenode> getTest();
	void setTest(java.util.List<uml.Executablenode> test);

}
