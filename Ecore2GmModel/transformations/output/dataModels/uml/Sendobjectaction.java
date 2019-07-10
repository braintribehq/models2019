/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Sendobjectaction of the Data Model uml.
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
{@link request}, 
{@link target}, 

* It provides of then following operations (getters and setters)
{@link getRequest},
{@link getTarget},
{@link setRequest},
{@link setTarget},
 */

@Description("A SendObjectAction is an InvocationAction that transmits an input object to the target object, which is handled as a request message by the target object. The requestor continues execution immediately after the object is sent out and cannot receive reply values.<p>From package UML::Actions.</p>")

public interface Sendobjectaction extends GenericEntity, uml.Invocationaction {

	EntityType<Sendobjectaction> T = EntityTypes.T(Sendobjectaction.class);

	/* Constants for each property name. */
	java.lang.String request = "request";
	java.lang.String target = "target";

	@Description("The request object, which is transmitted to the target object. The object may be copied in transmission, so identity might not be preserved.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getRequest();
	void setRequest(uml.Inputpin request);
	@Description("The target object to which the object is sent.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Inputpin getTarget();
	void setTarget(uml.Inputpin target);
}
