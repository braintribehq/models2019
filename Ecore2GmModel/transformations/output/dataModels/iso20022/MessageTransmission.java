/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageTransmission of the Data Model iso20022.
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
{@link businessTransaction}, 
{@link derivation}, 
{@link messageTypeDescription}, 
{@link send}, 
{@link receive}, 

* It provides of then following operations (getters and setters)
{@link getBusinessTransaction},
{@link getDerivation},
{@link getMessageTypeDescription},
{@link getSend},
{@link getReceive},
{@link setBusinessTransaction},
{@link setDerivation},
{@link setMessageTypeDescription},
{@link setSend},
{@link setReceive},
 */

@Description("the passing of information from one Participant to another in the context of a BusinessTransaction")

public interface MessageTransmission extends GenericEntity, iso20022.RepositoryConcept {

	EntityType<MessageTransmission> T = EntityTypes.T(MessageTransmission.class);

	/* Constants for each property name. */
	java.lang.String businessTransaction = "businessTransaction";
	java.lang.String derivation = "derivation";
	java.lang.String messageTypeDescription = "messageTypeDescription";
	java.lang.String send = "send";
	java.lang.String receive = "receive";

	@Description("the BusinessTransaction to which the MessageTransmission belongs")
	@Mandatory
	iso20022.BusinessTransaction getBusinessTransaction();
	void setBusinessTransaction(iso20022.BusinessTransaction businessTransaction);
	@Description("all of the MessagetypeTraces that derive MessageDefinitions from one MessageTransmission")
	
	java.util.List<iso20022.MessageDefinition> getDerivation();
	void setDerivation(java.util.List<iso20022.MessageDefinition> derivation);

	@Description("Describes the purpose and scope of the MessageTransmission in the BusinessTransaction")
	@Mandatory
	java.lang.String getMessageTypeDescription();
	void setMessageTypeDescription(java.lang.String messageTypeDescription);
	@Description("the passing of a MessagTransmission from a sender instance to a receiver instance")
	@Mandatory
	iso20022.Send getSend();
	void setSend(iso20022.Send send);
	@Description("the handling of a MessageTransmission passed from a sender instance")
	
	java.util.List<iso20022.Receive> getReceive();
	void setReceive(java.util.List<iso20022.Receive> receive);

}
