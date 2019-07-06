/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Receive of the Data Model iso20022.
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
{@link messageTransmission}, 
{@link receiver}, 

* It provides of then following operations (getters and setters)
{@link getMessageTransmission},
{@link getReceiver},
{@link setMessageTransmission},
{@link setReceiver},
 */

@Description("the handling of a stimulus passed from a sender instance")

public interface Receive extends GenericEntity, iso20022.ModelEntity {

	EntityType<Receive> T = EntityTypes.T(Receive.class);

	/* Constants for each property name. */
	java.lang.String messageTransmission = "messageTransmission";
	java.lang.String receiver = "receiver";

	@Description("the stimulus handled as part of the Receive")
	@Mandatory
	iso20022.MessageTransmission getMessageTransmission();
	void setMessageTransmission(iso20022.MessageTransmission messageTransmission);
	@Description("the object handling a stimulus passed from the sender")
	@Mandatory
	iso20022.Participant getReceiver();
	void setReceiver(iso20022.Participant receiver);
}
