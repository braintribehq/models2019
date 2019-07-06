/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type TransportMessage of the Data Model iso20022.
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
{@link messageInstance}, 
{@link receiver}, 

* It provides of then following operations (getters and setters)
{@link getSender},
{@link getMessageInstance},
{@link getReceiver},
{@link setSender},
{@link setMessageInstance},
{@link setReceiver},
 */

@Description("document that is an instance of the MessageTransportSystem message schema")

public interface TransportMessage extends GenericEntity, iso20022.ModelEntity {

	EntityType<TransportMessage> T = EntityTypes.T(TransportMessage.class);

	/* Constants for each property name. */
	java.lang.String sender = "sender";
	java.lang.String messageInstance = "messageInstance";
	java.lang.String receiver = "receiver";

	@Description("the sending MessagingEndpoint of a TransportMessage")
	@Mandatory
	iso20022.MessagingEndpoint getSender();
	void setSender(iso20022.MessagingEndpoint sender);
	@Description("the MessageInstance that is part of the TransportMessage")
	@Mandatory
	iso20022.MessageInstance getMessageInstance();
	void setMessageInstance(iso20022.MessageInstance messageInstance);
	@Description("the receiving MessagingEndpoint in a TransportMessage")
	
	java.util.List<iso20022.MessagingEndpoint> getReceiver();
	void setReceiver(java.util.List<iso20022.MessagingEndpoint> receiver);

}
