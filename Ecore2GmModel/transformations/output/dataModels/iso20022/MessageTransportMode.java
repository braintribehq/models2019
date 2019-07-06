/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageTransportMode of the Data Model iso20022.
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
{@link boundedCommunicationDelay}, 
{@link maximumClockVariation}, 
{@link maximumMessageSize}, 
{@link messageDeliveryWindow}, 
{@link messageSendingWindow}, 
{@link deliveryAssurance}, 
{@link durability}, 
{@link messageCasting}, 
{@link messageDeliveryOrder}, 
{@link messageValidationLevel}, 
{@link messageValidationOnOff}, 
{@link messageValidationResults}, 
{@link receiverAsynchronicity}, 
{@link senderAsynchronicity}, 
{@link businessTransaction}, 

* It provides of then following operations (getters and setters)
{@link getBoundedCommunicationDelay},
{@link getMaximumClockVariation},
{@link getMaximumMessageSize},
{@link getMessageDeliveryWindow},
{@link getMessageSendingWindow},
{@link getDeliveryAssurance},
{@link getDurability},
{@link getMessageCasting},
{@link getMessageDeliveryOrder},
{@link getMessageValidationLevel},
{@link getMessageValidationOnOff},
{@link getMessageValidationResults},
{@link getReceiverAsynchronicity},
{@link getSenderAsynchronicity},
{@link getBusinessTransaction},
{@link setBoundedCommunicationDelay},
{@link setMaximumClockVariation},
{@link setMaximumMessageSize},
{@link setMessageDeliveryWindow},
{@link setMessageSendingWindow},
{@link setDeliveryAssurance},
{@link setDurability},
{@link setMessageCasting},
{@link setMessageDeliveryOrder},
{@link setMessageValidationLevel},
{@link setMessageValidationOnOff},
{@link setMessageValidationResults},
{@link setReceiverAsynchronicity},
{@link setSenderAsynchronicity},
{@link setBusinessTransaction},
 */

@Description("group of settings for the values for the MessageTransportCharacteristics properties")

public interface MessageTransportMode extends GenericEntity, iso20022.TopLevelCatalogueEntry {

	EntityType<MessageTransportMode> T = EntityTypes.T(MessageTransportMode.class);

	/* Constants for each property name. */
	java.lang.String boundedCommunicationDelay = "boundedCommunicationDelay";
	java.lang.String maximumClockVariation = "maximumClockVariation";
	java.lang.String maximumMessageSize = "maximumMessageSize";
	java.lang.String messageDeliveryWindow = "messageDeliveryWindow";
	java.lang.String messageSendingWindow = "messageSendingWindow";
	java.lang.String deliveryAssurance = "deliveryAssurance";
	java.lang.String durability = "durability";
	java.lang.String messageCasting = "messageCasting";
	java.lang.String messageDeliveryOrder = "messageDeliveryOrder";
	java.lang.String messageValidationLevel = "messageValidationLevel";
	java.lang.String messageValidationOnOff = "messageValidationOnOff";
	java.lang.String messageValidationResults = "messageValidationResults";
	java.lang.String receiverAsynchronicity = "receiverAsynchronicity";
	java.lang.String senderAsynchronicity = "senderAsynchronicity";
	java.lang.String businessTransaction = "businessTransaction";

	@Description("the maximum duration of time within which a TransportMessage must be delivered")
	@Mandatory
	java.lang.String getBoundedCommunicationDelay();
	void setBoundedCommunicationDelay(java.lang.String boundedCommunicationDelay);
	@Description("clocks must maintain a maximum (inclusive) variance from UTC for the supported MessageTransportMode")
	@Mandatory
	java.lang.String getMaximumClockVariation();
	void setMaximumClockVariation(java.lang.String maximumClockVariation);
	@Description("the maximum size of a TransportMessage in kilobytes (any positive integer greater than zero).")
	@Mandatory
	java.lang.Integer getMaximumMessageSize();
	void setMaximumMessageSize(java.lang.Integer maximumMessageSize);
	@Description("the MessageDeliveryOrder is relaxed by a rolling window of time in which the Transport Messages may be delivered out of order whereby for each TransportMessage delivered it defines the maximum duration of time it may be out of sequence within")
	@Mandatory
	java.lang.String getMessageDeliveryWindow();
	void setMessageDeliveryWindow(java.lang.String messageDeliveryWindow);
	@Description("the Choreography is relaxed by a rolling window of time in which the Business Messages may be sent out of order whereby for each Business Message sent it defines the maximum duration of time it may be out of sequence with")
	@Mandatory
	java.lang.String getMessageSendingWindow();
	void setMessageSendingWindow(java.lang.String messageSendingWindow);
	@Description("the degree to which the sending MessagingEndpoint is assured that a TransportMessage will be delivered")
	@Mandatory
	iso20022.DeliveryAssurance getDeliveryAssurance();
	void setDeliveryAssurance(iso20022.DeliveryAssurance deliveryAssurance);
	@Description("whether the MessageTransportSystem safely retains a TransportMessage until it has been received by the destination MessagingEndpoint")
	@Mandatory
	iso20022.Durability getDurability();
	void setDurability(iso20022.Durability durability);
	@Description("specifies how receiving MessagingEndpoints may be addressed in a TransportMessage")
	@Mandatory
	iso20022.MessageCasting getMessageCasting();
	void setMessageCasting(iso20022.MessageCasting messageCasting);
	@Description("indicates to what extent Transport Messages from a sending MessagingEndpoint arrive in the order in which they were sent at the receiving MessagingEndpoints")
	@Mandatory
	iso20022.MessageDeliveryOrder getMessageDeliveryOrder();
	void setMessageDeliveryOrder(iso20022.MessageDeliveryOrder messageDeliveryOrder);
	@Description("the level of validation the MessageTransportSystem has tested the message")
	@Mandatory
	iso20022.MessageValidationLevel getMessageValidationLevel();
	void setMessageValidationLevel(iso20022.MessageValidationLevel messageValidationLevel);
	@Description("specifies whether the MessageTransportSystem validates the MessageInstance with respect to SyntaxMessageScheme, Constraints, the MarketPractices, and the MessageChoreography")
	@Mandatory
	iso20022.MessageValidationOnOff getMessageValidationOnOff();
	void setMessageValidationOnOff(iso20022.MessageValidationOnOff messageValidationOnOff);
	@Description("specifies how the MessageTransport System acts upon the results of MessageValidationOnOff")
	@Mandatory
	iso20022.MessageValidationResults getMessageValidationResults();
	void setMessageValidationResults(iso20022.MessageValidationResults messageValidationResults);
	@Description("indicates whether a receiving MessagingEndpoint blocks the sending and receipt of other Transport Messages until it sends a response to this TransportMessage")
	@Mandatory
	iso20022.ReceiverAsynchronicity getReceiverAsynchronicity();
	void setReceiverAsynchronicity(iso20022.ReceiverAsynchronicity receiverAsynchronicity);
	@Description("indicates whether a sending MessagingEndpoint blocks after sending a TransportMessage to the MessageTransportSystem while waiting for a response from a MessagingEndpoint")
	@Mandatory
	iso20022.SenderAsynchronicity getSenderAsynchronicity();
	void setSenderAsynchronicity(iso20022.SenderAsynchronicity senderAsynchronicity);
	@Description("specifies the BusinessTransaction for which a set of MessageTransportMode characteristics apply")
	
	java.util.List<iso20022.BusinessTransaction> getBusinessTransaction();
	void setBusinessTransaction(java.util.List<iso20022.BusinessTransaction> businessTransaction);

}
