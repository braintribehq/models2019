/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Combinedfragment of the Data Model uml.
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
{@link cfragmentGate}, 
{@link interactionOperator}, 
{@link operand}, 

* It provides of then following operations (getters and setters)
{@link getCfragmentGate},
{@link getInteractionOperator},
{@link getOperand},
{@link setCfragmentGate},
{@link setInteractionOperator},
{@link setOperand},
 */

@Description("A CombinedFragment defines an expression of InteractionFragments. A CombinedFragment is defined by an interaction operator and corresponding InteractionOperands. Through the use of CombinedFragments the user will be able to describe a number of traces in a compact and concise manner.<p>From package UML::Interactions.</p>")

public interface Combinedfragment extends GenericEntity, uml.Interactionfragment {

	EntityType<Combinedfragment> T = EntityTypes.T(Combinedfragment.class);

	/* Constants for each property name. */
	java.lang.String cfragmentGate = "cfragmentGate";
	java.lang.String interactionOperator = "interactionOperator";
	java.lang.String operand = "operand";

	@Description("Specifies the gates that form the interface between this CombinedFragment and its surroundings<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Gate> getCfragmentGate();
	void setCfragmentGate(java.util.List<uml.Gate> cfragmentGate);

	@Description("Specifies the operation which defines the semantics of this combination of InteractionFragments.<p>From package UML::Interactions.</p>")
	@Mandatory
	uml.InteractionOperatorKind getInteractionOperator();
	void setInteractionOperator(uml.InteractionOperatorKind interactionOperator);
	@Description("The set of operands of the combined fragment.<p>From package UML::Interactions.</p>")
	
	java.util.List<uml.Interactionoperand> getOperand();
	void setOperand(java.util.List<uml.Interactionoperand> operand);

}
