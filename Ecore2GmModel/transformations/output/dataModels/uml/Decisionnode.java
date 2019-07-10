/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Decisionnode of the Data Model uml.
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
{@link decisionInput}, 
{@link decisionInputFlow}, 

* It provides of then following operations (getters and setters)
{@link getDecisionInput},
{@link getDecisionInputFlow},
{@link setDecisionInput},
{@link setDecisionInputFlow},
 */

@Description("A DecisionNode is a ControlNode that chooses between outgoing ActivityEdges for the routing of tokens.<p>From package UML::Activities.</p>")

public interface Decisionnode extends GenericEntity, uml.Controlnode {

	EntityType<Decisionnode> T = EntityTypes.T(Decisionnode.class);

	/* Constants for each property name. */
	java.lang.String decisionInput = "decisionInput";
	java.lang.String decisionInputFlow = "decisionInputFlow";

	@Description("A Behavior that is executed to provide an input to guard ValueSpecifications on ActivityEdges outgoing from the DecisionNode.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Behavior getDecisionInput();
	void setDecisionInput(uml.Behavior decisionInput);
	@Description("An additional ActivityEdge incoming to the DecisionNode that provides a decision input value for the guards ValueSpecifications on ActivityEdges outgoing from the DecisionNode.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Objectflow getDecisionInputFlow();
	void setDecisionInputFlow(uml.Objectflow decisionInputFlow);
}
