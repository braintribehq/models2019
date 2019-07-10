/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Objectnode of the Data Model uml.
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
{@link inState}, 
{@link isControlType}, 
{@link ordering}, 
{@link selection}, 
{@link upperBound}, 

* It provides of then following operations (getters and setters)
{@link getInState},
{@link getIsControlType},
{@link getOrdering},
{@link getSelection},
{@link getUpperBound},
{@link setInState},
{@link setIsControlType},
{@link setOrdering},
{@link setSelection},
{@link setUpperBound},
 */

@Description("An ObjectNode is an abstract ActivityNode that may hold tokens within the object flow in an Activity. ObjectNodes also support token selection, limitation on the number of tokens held, specification of the state required for tokens being held, and carrying control values.<p>From package UML::Activities.</p>")
 
@Abstract 

public interface Objectnode extends GenericEntity, uml.Activitynode, uml.Typedelement {

	EntityType<Objectnode> T = EntityTypes.T(Objectnode.class);

	/* Constants for each property name. */
	java.lang.String inState = "inState";
	java.lang.String isControlType = "isControlType";
	java.lang.String ordering = "ordering";
	java.lang.String selection = "selection";
	java.lang.String upperBound = "upperBound";

	@Description("The States required to be associated with the values held by tokens on this ObjectNode.<p>From package UML::Activities.</p>")
	
	java.util.List<uml.State> getInState();
	void setInState(java.util.List<uml.State> inState);

	@Description("Indicates whether the type of the ObjectNode is to be treated as representing control values that may traverse ControlFlows.<p>From package UML::Activities.</p>")
	@Mandatory
	types.Boolean getIsControlType();
	void setIsControlType(types.Boolean isControlType);
	@Description("Indicates how the tokens held by the ObjectNode are ordered for selection to traverse ActivityEdges outgoing from the ObjectNode.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.ObjectNodeOrderingKind getOrdering();
	void setOrdering(uml.ObjectNodeOrderingKind ordering);
	@Description("A Behavior used to select tokens to be offered on outgoing ActivityEdges.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Behavior getSelection();
	void setSelection(uml.Behavior selection);
	@Description("The maximum number of tokens that may be held by this ObjectNode. Tokens cannot flow into the ObjectNode if the upperBound is reached. If no upperBound is specified, then there is no limit on how many tokens the ObjectNode can hold.<p>From package UML::Activities.</p>")
	@Mandatory
	uml.Valuespecification getUpperBound();
	void setUpperBound(uml.Valuespecification upperBound);
}
