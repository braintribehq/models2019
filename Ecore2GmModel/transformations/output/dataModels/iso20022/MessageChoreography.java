/*
Auto-generated code via model transformation (Eclipse Epsilon EGL/EGX).
Task: Cartridge Development - Data Model generation
This Java source artifact defines the Data Type MessageChoreography of the Data Model iso20022.
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
{@link businessTransactionTrace}, 
{@link messageDefinition}, 

* It provides of then following operations (getters and setters)
{@link getBusinessTransactionTrace},
{@link getMessageDefinition},
{@link setBusinessTransactionTrace},
{@link setMessageDefinition},
 */

@Description("precise and complete description of a MessageInstance exchange within a BusinessTransaction, describing the sequence and correlation of MessageInstances within a conversation, including the constraints on the interaction between Participants")

public interface MessageChoreography extends GenericEntity, iso20022.TopLevelCatalogueEntry {

	EntityType<MessageChoreography> T = EntityTypes.T(MessageChoreography.class);

	/* Constants for each property name. */
	java.lang.String businessTransactionTrace = "businessTransactionTrace";
	java.lang.String messageDefinition = "messageDefinition";

	@Description("the BusinessTransactionTrace from the MessageChoreography to the BusinessTransaction")
	@Mandatory
	iso20022.BusinessTransaction getBusinessTransactionTrace();
	void setBusinessTransactionTrace(iso20022.BusinessTransaction businessTransactionTrace);
	@Description("The MessageDefinition that is used in a MessageChoreography.")
	
	java.util.List<iso20022.MessageDefinition> getMessageDefinition();
	void setMessageDefinition(java.util.List<iso20022.MessageDefinition> messageDefinition);

}
