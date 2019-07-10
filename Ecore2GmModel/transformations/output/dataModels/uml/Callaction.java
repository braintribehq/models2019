/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Callaction of the Data Model uml.
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
{@link isSynchronous}, 
{@link result}, 

* It provides of then following operations (getters and setters)
{@link getIsSynchronous},
{@link getResult},
{@link setIsSynchronous},
{@link setResult},
 */

@Description("CallAction is an abstract class for Actions that invoke a Behavior with given argument values and (if the invocation is synchronous) receive reply values.<p>From package UML::Actions.</p>")
 
@Abstract 

public interface Callaction extends GenericEntity, uml.Invocationaction {

	EntityType<Callaction> T = EntityTypes.T(Callaction.class);

	/* Constants for each property name. */
	java.lang.String isSynchronous = "isSynchronous";
	java.lang.String result = "result";

	@Description("If true, the call is synchronous and the caller waits for completion of the invoked Behavior. If false, the call is asynchronous and the caller proceeds immediately and cannot receive return values.<p>From package UML::Actions.</p>")
	@Mandatory
	types.Boolean getIsSynchronous();
	void setIsSynchronous(types.Boolean isSynchronous);
	@Description("The OutputPins on which the reply values from the invocation are placed (if the call is synchronous).<p>From package UML::Actions.</p>")
	
	java.util.List<uml.Outputpin> getResult();
	void setResult(java.util.List<uml.Outputpin> result);

}
