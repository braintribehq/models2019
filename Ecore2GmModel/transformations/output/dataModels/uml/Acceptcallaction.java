/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Acceptcallaction of the Data Model uml.
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
{@link returnInformation}, 

* It provides of then following operations (getters and setters)
{@link getReturnInformation},
{@link setReturnInformation},
 */

@Description("An AcceptCallAction is an AcceptEventAction that handles the receipt of a synchronous call request. In addition to the values from the Operation input parameters, the Action produces an output that is needed later to supply the information to the ReplyAction necessary to return control to the caller. An AcceptCallAction is for synchronous calls. If it is used to handle an asynchronous call, execution of the subsequent ReplyAction will complete immediately with no effect.<p>From package UML::Actions.</p>")

public interface Acceptcallaction extends GenericEntity, uml.Accepteventaction {

	EntityType<Acceptcallaction> T = EntityTypes.T(Acceptcallaction.class);

	/* Constants for each property name. */
	java.lang.String returnInformation = "returnInformation";

	@Description("An OutputPin where a value is placed containing sufficient information to perform a subsequent ReplyAction and return control to the caller. The contents of this value are opaque. It can be passed and copied but it cannot be manipulated by the model.<p>From package UML::Actions.</p>")
	@Mandatory
	uml.Outputpin getReturnInformation();
	void setReturnInformation(uml.Outputpin returnInformation);
}
