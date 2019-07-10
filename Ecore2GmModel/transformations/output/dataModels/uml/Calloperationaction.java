/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Calloperationaction of the Data Model uml.
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
{@link operation}, 
{@link target}, 

* It provides of then following operations (getters and setters)
{@link getOperation},
{@link getTarget},
{@link setOperation},
{@link setTarget},
 */

@Description("A CallOperationAction is a CallAction that transmits an Operation call request to the target object, where it may cause the invocation of associated Behavior. The argument values of the CallOperationAction are passed on the input Parameters of the Operation. If call is synchronous, the execution of the CallOperationAction waits until the execution of the invoked Operation completes and the values of output Parameters of the Operation are placed on the result OutputPins. If the call is asynchronous, the CallOperationAction completes immediately and no results values can be provided.<p>From package UML::Actions.</p>")

public interface Calloperationaction extends GenericEntity, uml.Callaction {

	EntityType<Calloperationaction> T = EntityTypes.T(Calloperationaction.class);

	/* Constants for each property name. */
	java.lang.String operation = "operation";
	java.lang.String target = "target";

	@Description("The Operation being invoked.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Operation getOperation();
	void setOperation(uml.Operation operation);
	@Description("The InputPin that provides the target object to which the Operation call request is sent.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getTarget();
	void setTarget(uml.Inputpin target);
}
