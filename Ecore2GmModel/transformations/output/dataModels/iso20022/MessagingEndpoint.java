/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessagingEndpoint of the Data Model iso20022.
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
{@link transportSystem}, 
{@link receivedMessage}, 
{@link sentMessage}, 
{@link location}, 

* It provides of then following operations (getters and setters)
{@link getTransportSystem},
{@link getReceivedMessage},
{@link getSentMessage},
{@link getLocation},
{@link setTransportSystem},
{@link setReceivedMessage},
{@link setSentMessage},
{@link setLocation},
 */

@Description("addressable node on the MessageTransportSystem which is capable of sending and receiving TransportMessages")

public interface MessagingEndpoint extends GenericEntity, iso20022.ModelEntity {

	EntityType<MessagingEndpoint> T = EntityTypes.T(MessagingEndpoint.class);

	/* Constants for each property name. */
	java.lang.String transportSystem = "transportSystem";
	java.lang.String receivedMessage = "receivedMessage";
	java.lang.String sentMessage = "sentMessage";
	java.lang.String location = "location";

	@Description("the MessageTransportSystem that owns and uses this MessagingEndpoint")
	@Mandatory
	iso20022.MessageTransportSystem getTransportSystem();
	void setTransportSystem(iso20022.MessageTransportSystem transportSystem);
	@Description("the TransportMessage that is received by the receiving MessagingEndpoint")
	
	java.util.List<iso20022.TransportMessage> getReceivedMessage();
	void setReceivedMessage(java.util.List<iso20022.TransportMessage> receivedMessage);

	@Description("the TransportMessage that is sent by the sending MessagingEndpoint")
	
	java.util.List<iso20022.TransportMessage> getSentMessage();
	void setSentMessage(java.util.List<iso20022.TransportMessage> sentMessage);

	@Description("an Address used to identify the MessagingEndpoint")
	
	java.util.List<iso20022.Address> getLocation();
	void setLocation(java.util.List<iso20022.Address> location);

}
