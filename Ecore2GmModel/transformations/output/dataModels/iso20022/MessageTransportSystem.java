/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageTransportSystem of the Data Model iso20022.
The resulting Data Model 
- has to be imported as servlet in your TribeFire server (Data Model are bundled within a .war file), 
- has to be detected and syncronized in the TribeFire::ControlCenter
As a result, a Business Model (or simply Model) should be visible throung the TribeFire:Modeler.

Author: Luca Berardinelli
Tool: Eclipse Epsilon
*/

package iso20022;

import com.braintribe.model.generic.GenericEntity;
import com.braintribe.model.generic.reflection.EntityType;
import com.braintribe.model.generic.reflection.EntityTypes;
import com.braintribe.model.generic.annotation.*;
import com.braintribe.model.generic.annotation.meta.*;

/**
 * 
 * It consists of then following properties
{@link endpoint}, 

* It provides of then following operations (getters and setters)
{@link getEndpoint},
{@link setEndpoint},
 */

@Description("mechanism that receives Transport Messages from the sending MessagingEndpoint, transports them, and delivers them to the receiving MessagingEndpoint")

public interface MessageTransportSystem extends GenericEntity, iso20022.ModelEntity {

	EntityType<MessageTransportSystem> T = EntityTypes.T(MessageTransportSystem.class);

	/* Constants for each property name. */
	java.lang.String endpoint = "endpoint";

	@Description("a MessagingEndpoint owned by a single MessageTransportSystem")
	
	java.util.List<iso20022.MessagingEndpoint> getEndpoint();
	void setEndpoint(java.util.List<iso20022.MessagingEndpoint> endpoint);

}
