/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type Send of the Data Model iso20022.
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
{@link sender}, 
{@link messageTransmission}, 

* It provides of then following operations (getters and setters)
{@link getSender},
{@link getMessageTransmission},
{@link setSender},
{@link setMessageTransmission},
 */

@Description("the passing of a stimulus from a sender instance to a receiver instance")

public interface Send extends GenericEntity, iso20022.ModelEntity {

	EntityType<Send> T = EntityTypes.T(Send.class);

	/* Constants for each property name. */
	java.lang.String sender = "sender";
	java.lang.String messageTransmission = "messageTransmission";

	@Description("The object passing a stimulus to a receiver object")
	@Mandatory
	iso20022.Participant getSender();
	void setSender(iso20022.Participant sender);
	@Description("the stimulus handled as part of the Send")
	@Mandatory
	iso20022.MessageTransmission getMessageTransmission();
	void setMessageTransmission(iso20022.MessageTransmission messageTransmission);
}
